package com.EsportLeagueStats.ESLS.service;import com.EsportLeagueStats.ESLS.model.Finale;import com.EsportLeagueStats.ESLS.model.Igraat;import com.EsportLeagueStats.ESLS.model.IgraatPK;import com.EsportLeagueStats.ESLS.persistance.IgraatRepository;import org.springframework.stereotype.Service;import javax.management.relation.RoleUnresolved;import java.util.List;@Servicepublic class IgraatService {    private final IgraatRepository repository;    public IgraatService(IgraatRepository repository) {        this.repository = repository;    }    public List<Igraat> findAllIgrani(){        return repository.findAll();    }    public Igraat findIgraatById(IgraatPK id){        return repository.findById(id).orElseThrow(()-> new RuntimeException("Nema takva utakmica"));    }    public void deleteIgrana(IgraatPK id) {        Igraat igraat = repository.findById(id).orElseThrow(()-> new RuntimeException("Nema takva utakmica"));        repository.delete(igraat);}}