package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Tim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TimRepository extends JpaRepository<Tim,Integer> {
}
