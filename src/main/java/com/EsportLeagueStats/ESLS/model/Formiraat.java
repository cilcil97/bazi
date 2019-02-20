package com.EsportLeagueStats.ESLS.model;

import javax.persistence.*;

@Entity
@Table(schema = "project", name = "formiraat")
public class Formiraat {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tim_id")
    private Tim tim;

    @ManyToOne
    @JoinColumn(name = "igrach_id")
    private Players igrach;

    @ManyToOne
    @JoinColumn(name = "sezona_id")
    private Sezona sezona;

    public Formiraat(Tim tim, Players igrach, Sezona sezona) {
        this.tim = tim;
        this.igrach = igrach;
        this.sezona = sezona;
    }

    public Formiraat() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tim getTim() {
        return tim;
    }

    public void setTim(Tim tim) {
        this.tim = tim;
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
