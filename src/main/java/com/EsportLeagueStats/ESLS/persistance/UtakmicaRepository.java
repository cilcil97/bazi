package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Sezona;
import com.EsportLeagueStats.ESLS.model.Tim;
import com.EsportLeagueStats.ESLS.model.Utakmica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UtakmicaRepository extends JpaRepository<Utakmica, Integer> {

    @Query(value = "SELECT COUNT (u) FROM Utakmica  u WHERE u.pobednik = :tim AND u.sezona.sezona = :sezona ")
    Long countAllBySezonaAndTim(@Param("sezona") Sezona sezona, @Param("tim") Tim tim);

}
