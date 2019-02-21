package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Liga;
import com.EsportLeagueStats.ESLS.model.LigaSezona;
import com.EsportLeagueStats.ESLS.model.Sezona;
import com.EsportLeagueStats.ESLS.model.dto.LigaSezonaSimple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LigaSezonaRepository extends JpaRepository<LigaSezona, Integer> {

    Optional<LigaSezona> findByLigaAndSezona(Liga liga, Sezona sezona);

    @Query(value = "SELECT new com.EsportLeagueStats.ESLS.model.dto.LigaSezonaSimple(ls.sezona.id, ls.liga.ime) " +
            "FROM LigaSezona ls ")
    List<LigaSezonaSimple> groupLigaSezona();

    boolean existsByLigaAndSezona(Liga liga, Sezona sezona);
}
