package com.EsportLeagueStats.ESLS.persistance;import com.EsportLeagueStats.ESLS.model.Liga;import org.springframework.data.jpa.repository.JpaRepository;import java.util.Optional;public interface LigaRepository extends JpaRepository<Liga,Integer> {    Optional<Liga> findByIme(String name);}