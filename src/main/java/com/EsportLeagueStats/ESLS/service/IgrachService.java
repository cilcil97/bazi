package com.EsportLeagueStats.ESLS.service;import com.EsportLeagueStats.ESLS.model.Players;import com.EsportLeagueStats.ESLS.persistance.IgrachRepository;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import java.util.List;@Servicepublic class IgrachService {    private final IgrachRepository repository;    public IgrachService(IgrachRepository repository) {        this.repository = repository;    }    public List<Players> findAllIgrachi() {        return repository.findAll();    }    public Players findIgrachById(Integer id) {        return repository.findById(id).                orElseThrow(() -> new RuntimeException("Igracot ne e vo bazata"));    }    public Players addIgrach(String akronim, String drzava, String ime, String pozicija) {        Players igrachi = new Players(akronim, drzava, ime, pozicija);        return repository.save(igrachi);    }    @Transactional    public void deleteIgrach(int id) {        repository.deleteById(id);    }//    @Override//    @Transactional   public Players findBestPlayer(int id) {    return null; }}