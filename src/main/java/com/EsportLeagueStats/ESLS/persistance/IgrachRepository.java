package com.EsportLeagueStats.ESLS.persistance;

import com.EsportLeagueStats.ESLS.model.Igrachi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IgrachRepository extends JpaRepository<Igrachi, Integer> {

    @Query(value = "SELECT i " +
            "FROM Igrachi i " +
            "WHERE i.ime = :asd")
    List<Igrachi> all(@Param("asd") String asd);


    // TODO  Insert complicated query to get the MVP of the season

//   @Query(value = "\n" +
//           "select\n" +
//           "    akronim,\n" +
//           "    pozicija,\n" +
//           "    ime,\n" +
//           "    t_ime,\n" +
//           "    br_pobedi\n" +
//           "from\n" +
//           "    project.igrachi igrachi\n" +
//           "join project.formiraat f on\n" +
//           "    f.iid = igrachi.iid\n" +
//           "join project.statistika_na_igrach s on\n" +
//           "    s.iid = igrachi.iid\n" +
//           "join project.tim t on\n" +
//           "    t.tid = f.tid\n" +
//           "join project.statistika_na_tim stats on\n" +
//           "    stats.tid = t.tid\n" +
//           "join project.liga liga on\n" +
//           "    liga.lime = 'EU-LCS'\n" +
//           "join project.sezona sez on\n" +
//           "    sez.poceten_datum = 'January-2018'\n" +
//           "where\n" +
//           "    s.poeni_vo_10_min in (\n" +
//           "    select\n" +
//           "        max(poeni_vo_10_min)\n" +
//           "    from\n" +
//           "        project.statistika_na_igrach s\n" +
//           "    join project.igrachi i on\n" +
//           "        i.iid = s.iid )\n" +
//           "    or stats.br_pobedi in (\n" +
//           "    select\n" +
//           "        max(br_pobedi)\n" +
//           "    from\n" +
//           "        project.statistika_na_tim s\n" +
//           "    join project.tim t on\n" +
//           "        s.tid = t.tid ) \n")
//        Igrachi getBestIgrach(@Param("id") int id);
//




    // TODO INSERT COMPLICATED QUERY TO GET THE BEST PLAYER IN ALL OF THE LEAGUES

}