package com.EsportLeagueStats.ESLS.service;

import com.EsportLeagueStats.ESLS.model.Formiraat;
import com.EsportLeagueStats.ESLS.model.Players;
import com.EsportLeagueStats.ESLS.model.Sezona;
import com.EsportLeagueStats.ESLS.model.Tim;
import com.EsportLeagueStats.ESLS.persistance.FormiraatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormiraatService {

    private final TimService timService;
    private final IgrachService igrachService;
    private final SezonaService sezonaService;
    private final FormiraatRepository repository;

    public FormiraatService(TimService timService, IgrachService igrachService, SezonaService sezonaService, FormiraatRepository repository) {
        this.timService = timService;
        this.igrachService = igrachService;
        this.sezonaService = sezonaService;
        this.repository = repository;
    }

    @Transactional
    public Formiraat createFormiraat(int timId, int playerId, int sezonaYear) {
        Tim tim = timService.findTimById(timId);
        Players players = igrachService.findIgrachById(playerId);
        Sezona sezona = sezonaService.findSezonaById(sezonaYear);
        return this.createFormiraat(tim, players, sezona);
    }

    public Formiraat createFormiraat(Tim tim, Players players, Sezona sezona) {
        Formiraat formiraat = new Formiraat(tim, players, sezona);
        return repository.save(formiraat);
    }
}
