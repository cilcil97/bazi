package com.EsportLeagueStats.ESLS.service;import com.EsportLeagueStats.ESLS.model.Sezona;import com.EsportLeagueStats.ESLS.persistance.SezonaRepository;import org.springframework.stereotype.Service;import java.util.List;@Servicepublic class SezonaService  {    private final SezonaRepository repository;    public SezonaService(SezonaRepository sezonaRepository) {        this.repository = sezonaRepository;    }    public List<Sezona> findAllSezona() {        return repository.findAll();    }    public Sezona findSezonaById(int id) {        return repository.findById(id).orElseThrow(() -> new RuntimeException("Nema takva sezona"));    }        public Sezona addSezona(String kraenDatum, String pocetenDatum) {        Sezona sezona = new Sezona(kraenDatum,pocetenDatum);        return repository.save(sezona);    }}