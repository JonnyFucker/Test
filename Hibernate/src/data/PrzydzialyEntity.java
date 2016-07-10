package data;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Tomek on 2016-07-04.
 */
@Entity
@Table(name = "PRZYDZIALY", schema = "HR", catalog = "")
@IdClass(PrzydzialyEntityPK.class)
public class PrzydzialyEntity {
    private byte idProjektu;
    private byte nrPracownika;
    private Time od;
    private Time doDnia;
    private Integer stawka;
    private String rola;
    private Integer godziny;

    @Id
    @Column(name = "ID_PROJEKTU")
    public byte getIdProjektu() {
        return idProjektu;
    }

    public data.PrzydzialyEntity setIdProjektu(byte idProjektu) {
        this.idProjektu = idProjektu;
        return this;
    }

    @Id
    @Column(name = "NR_PRACOWNIKA")
    public byte getNrPracownika() {
        return nrPracownika;
    }

    public data.PrzydzialyEntity setNrPracownika(byte nrPracownika) {
        this.nrPracownika = nrPracownika;
        return this;
    }

    @Basic
    @Column(name = "OD")
    public Time getOd() {
        return od;
    }

    public data.PrzydzialyEntity setOd(Time od) {
        this.od = od;
        return this;
    }

    @Basic
    @Column(name = "DO")
    public Time getDoDnia() {
        return doDnia;
    }

    public data.PrzydzialyEntity setDoDnia(Time doDnia) {
        this.doDnia = doDnia;
        return this;
    }

    @Basic
    @Column(name = "STAWKA")
    public Integer getStawka() {
        return stawka;
    }

    public data.PrzydzialyEntity setStawka(Integer stawka) {
        this.stawka = stawka;
        return this;
    }

    @Basic
    @Column(name = "ROLA")
    public String getRola() {
        return rola;
    }

    public data.PrzydzialyEntity setRola(String rola) {
        this.rola = rola;
        return this;
    }

    @Basic
    @Column(name = "GODZINY")
    public Integer getGodziny() {
        return godziny;
    }

    public data.PrzydzialyEntity setGodziny(Integer godziny) {
        this.godziny = godziny;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrzydzialyEntity that = (PrzydzialyEntity) o;

        if (idProjektu != that.idProjektu) return false;
        if (nrPracownika != that.nrPracownika) return false;
        if (od != null ? !od.equals(that.od) : that.od != null) return false;
        if (doDnia != null ? !doDnia.equals(that.doDnia) : that.doDnia != null) return false;
        if (stawka != null ? !stawka.equals(that.stawka) : that.stawka != null) return false;
        if (rola != null ? !rola.equals(that.rola) : that.rola != null) return false;
        if (godziny != null ? !godziny.equals(that.godziny) : that.godziny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idProjektu;
        result = 31 * result + (int) nrPracownika;
        result = 31 * result + (od != null ? od.hashCode() : 0);
        result = 31 * result + (doDnia != null ? doDnia.hashCode() : 0);
        result = 31 * result + (stawka != null ? stawka.hashCode() : 0);
        result = 31 * result + (rola != null ? rola.hashCode() : 0);
        result = 31 * result + (godziny != null ? godziny.hashCode() : 0);
        return result;
    }
}
