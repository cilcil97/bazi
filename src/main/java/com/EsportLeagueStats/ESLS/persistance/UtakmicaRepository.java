package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Utakmica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UtakmicaRepository extends JpaRepository<Utakmica,Integer> {
}
