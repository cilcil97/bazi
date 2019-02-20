package com.EsportLeagueStats.ESLS.service;

import com.EsportLeagueStats.ESLS.model.Liga;
import com.EsportLeagueStats.ESLS.model.LigaSezona;
import com.EsportLeagueStats.ESLS.model.Sezona;
import com.EsportLeagueStats.ESLS.persistance.LigaSezonaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

        LigaSezona ligaSezona = new LigaSezona(liga, sezona);
        logger.info("Saving LigaSezona [{}]", ligaSezona);
        return repository.save(ligaSezona);
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
    public LigaSezona findByLigaAndSezona(int ligaId, int sezonaYear) {
        Liga liga = ligaService.findLigaById(ligaId);
        Sezona sezona = sezonaService.findSezonaById(sezonaYear);
        return this.findByLigaAndSezona(liga, sezona);
    }
}
