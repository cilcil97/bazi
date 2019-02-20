package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.MenuvaatTim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuvaatTimRepository extends JpaRepository<MenuvaatTim, Integer> {
}
