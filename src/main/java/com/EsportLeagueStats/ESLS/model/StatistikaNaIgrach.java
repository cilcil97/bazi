package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(schema = "project", name = "statistika_na_igrach")
public class StatistikaNaIgrach {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "kda")
    private Integer kda;

    @Column(name = "nadigruvanja")
    private Integer nadigruvanja;

    @Column(name = "napravena_steta")
    private Integer napravenaSteta;

    @Column(name = "poeni_vo_10_min")
    private Integer poeniVo10Min;

    @Column(name = "primena_steta")
    private Integer primenaSteta;

    @Column(name = "prinudeni_greski")
    private Integer prinudeniGreski;

    @Column(name = "prisustvo_na_soigrachi")
    private Integer prisustvoNaSoigrachi;

    @Column(name = "prisustvo_na_vardovi")
    private Integer prisustvoNaVardovi;

    @ManyToOne
    @JoinColumn(name = "igrach_id")
    private Players igrach;

    @ManyToOne
    @JoinColumn(name = "sezona_id")
    private Sezona sezona;

    public StatistikaNaIgrach(Integer kda, Integer nadigruvanja, Integer napravenaSteta, Integer poeniVo10Min, Integer primenaSteta, Integer prinudeniGreski, Integer prisustvoNaSoigrachi, Integer prisustvoNaVardovi, Players igrach, Sezona sezona) {
        this.kda = kda;
        this.nadigruvanja = nadigruvanja;
        this.napravenaSteta = napravenaSteta;
        this.poeniVo10Min = poeniVo10Min;
        this.primenaSteta = primenaSteta;
        this.prinudeniGreski = prinudeniGreski;
        this.prisustvoNaSoigrachi = prisustvoNaSoigrachi;
        this.prisustvoNaVardovi = prisustvoNaVardovi;
        this.igrach = igrach;
        this.sezona = sezona;
    }

    public Integer getId() {
        return id;
    }

    public Integer getKda() {
        return kda;
    }

    public void setKda(Integer kda) {
        this.kda = kda;
    }

    public Integer getNadigruvanja() {
        return nadigruvanja;
    }

    public void setNadigruvanja(Integer nadigruvanja) {
        this.nadigruvanja = nadigruvanja;
    }

    public Integer getNapravenaSteta() {
        return napravenaSteta;
    }

    public void setNapravenaSteta(Integer napravenaSteta) {
        this.napravenaSteta = napravenaSteta;
    }

    public Integer getPoeniVo10Min() {
        return poeniVo10Min;
    }

    public void setPoeniVo10Min(Integer poeniVo10Min) {
        this.poeniVo10Min = poeniVo10Min;
    }

    public Integer getPrimenaSteta() {
        return primenaSteta;
    }

    public void setPrimenaSteta(Integer primenaSteta) {
        this.primenaSteta = primenaSteta;
    }

    public Integer getPrinudeniGreski() {
        return prinudeniGreski;
    }

    public void setPrinudeniGreski(Integer prinudeniGreski) {
        this.prinudeniGreski = prinudeniGreski;
    }

    public Integer getPrisustvoNaSoigrachi() {
        return prisustvoNaSoigrachi;
    }

    public void setPrisustvoNaSoigrachi(Integer prisustvoNaSoigrachi) {
        this.prisustvoNaSoigrachi = prisustvoNaSoigrachi;
    }

    public Integer getPrisustvoNaVardovi() {
        return prisustvoNaVardovi;
    }

    public void setPrisustvoNaVardovi(Integer prisustvoNaVardovi) {
        this.prisustvoNaVardovi = prisustvoNaVardovi;
    }

    public Players getIgrach() {
        return igrach;
    }

    public void setIgrach(Players igrach) {
        this.igrach = igrach;
    }

    public Sezona getSezona() {
        return sezona;
    }

    public void setSezona(Sezona sezona) {
        this.sezona = sezona;
    }
}