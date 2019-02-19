package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Sezona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SezonaRepository extends JpaRepository<Sezona,Integer> {
}
