package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Liga;
import com.EsportLeagueStats.ESLS.model.LigaSezona;
import com.EsportLeagueStats.ESLS.model.Sezona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LigaSezonaRepository extends JpaRepository<LigaSezona, Integer> {

    Optional<LigaSezona> findByLigaAndSezona(Liga liga, Sezona sezona);

}
