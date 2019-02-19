package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Sezona;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SezonaRepository extends JpaRepository<Sezona,Integer> {
}
