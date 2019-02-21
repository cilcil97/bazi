package com.EsportLeagueStats.ESLS.service;import com.EsportLeagueStats.ESLS.model.LigaSezona;import com.EsportLeagueStats.ESLS.model.Sezona;import com.EsportLeagueStats.ESLS.model.Tim;import com.EsportLeagueStats.ESLS.model.Utakmica;import com.EsportLeagueStats.ESLS.persistance.UtakmicaRepository;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import java.util.List;@Servicepublic class UtakmicaService {    private final UtakmicaRepository repository;    private final SezonaService sezonaService;    private final TimService timService;    private final LigaSezonaService ligaSezonaService;    public UtakmicaService(UtakmicaRepository repository, SezonaService sezonaService, TimService timService, LigaSezonaService ligaSezonaService) {        this.repository = repository;        this.sezonaService = sezonaService;        this.timService = timService;        this.ligaSezonaService = ligaSezonaService;    }    public List<Utakmica> findAllUtakmicas(){        return  repository.findAll();    }    public Utakmica findUtakmicaById(int id){        return  repository.findById(id).orElseThrow(()-> new RuntimeException("utakmica not found"));    }    @Transactional    public Utakmica addUtakmica(int timPobednikId, int timGubitnikId, int sezonaId, String ligaId, boolean finale) {        Tim pobednik = timService.findTimById(timPobednikId);        Tim gubitnik = timService.findTimById(timGubitnikId);        LigaSezona ligaSezona = ligaSezonaService.findBySezonaIntLigaName(sezonaId, ligaId);        return this.addUtakmica(pobednik, gubitnik, ligaSezona, finale);    }    public Utakmica addUtakmica(Tim pobednik, Tim gubitnik, LigaSezona ligaSezona, boolean finale){        Utakmica utakmica = new Utakmica(pobednik, gubitnik, ligaSezona, finale);        return repository.save(utakmica);    }    public void deleteUtakmica(int id){        Utakmica utakmica = findUtakmicaById(id);        repository.delete(utakmica);    }    public long countAllWinsBySezonaAndTeam(int year, int teamId) {        Sezona sezona = sezonaService.findSezonaById(year);        Tim tim = timService.findTimById(teamId);        return countAllWinsBySezonaAndTeam(sezona, tim);    }    public long countAllWinsBySezonaAndTeam(Sezona sezona, Tim tim) {        return this.repository.countAllBySezonaAndTim(sezona, tim);    }}