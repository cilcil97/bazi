package com.EsportLeagueStats.ESLS.service;

import com.EsportLeagueStats.ESLS.model.MenuvaatTim;
import com.EsportLeagueStats.ESLS.model.Players;
import com.EsportLeagueStats.ESLS.model.Tim;
import com.EsportLeagueStats.ESLS.persistance.MenuvaatTimRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MenuvaatTimService {

    private final MenuvaatTimRepository repository;

    public MenuvaatTimService(MenuvaatTimRepository repository) {
        this.repository = repository;
    }

    public MenuvaatTim makeTransfer(Integer cena, LocalDate datumNaSmena, Players igrach, Tim tim) {
        MenuvaatTim menuvaatTim = new MenuvaatTim(cena, datumNaSmena, igrach, tim);
        return repository.save(menuvaatTim);
    }

    public List<MenuvaatTim> findAll() {
        return repository.findAll();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}