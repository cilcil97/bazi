package com.EsportLeagueStats.ESLS.service;

import com.EsportLeagueStats.ESLS.model.Liga;
import com.EsportLeagueStats.ESLS.model.LigaSezona;
import com.EsportLeagueStats.ESLS.model.Sezona;
import com.EsportLeagueStats.ESLS.model.dto.LigaSezonaSimple;
import com.EsportLeagueStats.ESLS.model.dto.SezonaSoLigi;
import com.EsportLeagueStats.ESLS.persistance.LigaSezonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class LigaSezonaService {

    private static final Logger logger = LoggerFactory.getLogger(LigaSezonaService.class);

    private final LigaService ligaService;
    private final SezonaService sezonaService;
    private final LigaSezonaRepository repository;

    public LigaSezonaService(LigaService ligaService, SezonaService sezonaService, LigaSezonaRepository repository) {
        this.ligaService = ligaService;
        this.sezonaService = sezonaService;
        this.repository = repository;
    }

    @Transactional
    public LigaSezona createLigaAndSezona(int sezonaYear, int ligaIg) {

        Sezona sezona = sezonaService.findSezonaById(sezonaYear);
        Liga liga = ligaService.findLigaById(ligaIg);
        return this.createLigaAndSezona(sezona, liga);
    }

    @Transactional
    public LigaSezona createLigaAndSezona(Sezona sezona, Liga liga) {
        if (repository.existsByLigaAndSezona(liga, sezona)) {
            throw new RuntimeException("Vekje postoi");
        }
        LigaSezona ligaSezona = new LigaSezona(liga, sezona);
        return repository.save(ligaSezona);
    }

    @Transactional
    public List<LigaSezona> createMultiple(int sezonaYear, List<Integer> ligi) {
        Sezona sezona = sezonaService.findSezonaById(sezonaYear);
        return ligi.stream()
                .map(ligaService::findLigaById)
                .map(it -> this.createLigaAndSezona(sezona, it))
                .collect(toList());
    }

    public LigaSezona findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nema liga i sezona so baranoto id"));
    }

    public LigaSezona findByLigaAndSezona(Liga liga, Sezona sezona) {
        return repository.findByLigaAndSezona(liga, sezona)
                .orElseThrow(() -> new RuntimeException("Nema liga i sezona so baranite parametri"));
    }

    @Transactional
    public LigaSezona findBySezonaIntLigaName(int sezonaId, String imeLiga) {
        Liga liga = ligaService.findByIme(imeLiga);
        Sezona sezona = sezonaService.findSezonaById(sezonaId);
        return this.findByLigaAndSezona(liga, sezona);
    }

    @Transactional
    public LigaSezona findByLigaAndSezona(int ligaId, int sezonaYear) {
        Liga liga = ligaService.findLigaById(ligaId);
        Sezona sezona = sezonaService.findSezonaById(sezonaYear);
        return this.findByLigaAndSezona(liga, sezona);
    }

    public List<SezonaSoLigi> groupBySezona() {
        return repository.groupLigaSezona()
                .stream()
                .collect(Collectors.groupingBy(LigaSezonaSimple::getYear, Collectors.mapping(LigaSezonaSimple::getLigaIme, toList())))
                .entrySet()
                .stream()
                .map(it -> new SezonaSoLigi(it.getKey(), it.getValue()))
                .collect(toList());
    }
}
