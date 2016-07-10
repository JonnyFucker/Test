package data;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Tomek on 2016-07-04.
 */
@Entity
@Table(name = "PROJEKTY", schema = "HR", catalog = "")
public class ProjektyEntity {
    private byte idProjektu;
    private String opisProjektu;
    private Time dataRozpoczecia;
    private Time dataZakonczenia;
    private Byte fundusz;

    @Id
    @Column(name = "ID_PROJEKTU")
    public byte getIdProjektu() {
        return idProjektu;
    }

    public data.ProjektyEntity setIdProjektu(byte idProjektu) {
        this.idProjektu = idProjektu;
        return this;
    }

    @Basic
    @Column(name = "OPIS_PROJEKTU")
    public String getOpisProjektu() {
        return opisProjektu;
    }

    public data.ProjektyEntity setOpisProjektu(String opisProjektu) {
        this.opisProjektu = opisProjektu;
        return this;
    }

    @Basic
    @Column(name = "DATA_ROZPOCZECIA")
    public Time getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public data.ProjektyEntity setDataRozpoczecia(Time dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
        return this;
    }

    @Basic
    @Column(name = "DATA_ZAKONCZENIA")
    public Time getDataZakonczenia() {
        return dataZakonczenia;
    }

    public data.ProjektyEntity setDataZakonczenia(Time dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
        return this;
    }

    @Basic
    @Column(name = "FUNDUSZ")
    public Byte getFundusz() {
        return fundusz;
    }

    public data.ProjektyEntity setFundusz(Byte fundusz) {
        this.fundusz = fundusz;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjektyEntity that = (ProjektyEntity) o;

        if (idProjektu != that.idProjektu) return false;
        if (opisProjektu != null ? !opisProjektu.equals(that.opisProjektu) : that.opisProjektu != null) return false;
        if (dataRozpoczecia != null ? !dataRozpoczecia.equals(that.dataRozpoczecia) : that.dataRozpoczecia != null)
            return false;
        if (dataZakonczenia != null ? !dataZakonczenia.equals(that.dataZakonczenia) : that.dataZakonczenia != null)
            return false;
        if (fundusz != null ? !fundusz.equals(that.fundusz) : that.fundusz != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idProjektu;
        result = 31 * result + (opisProjektu != null ? opisProjektu.hashCode() : 0);
        result = 31 * result + (dataRozpoczecia != null ? dataRozpoczecia.hashCode() : 0);
        result = 31 * result + (dataZakonczenia != null ? dataZakonczenia.hashCode() : 0);
        result = 31 * result + (fundusz != null ? fundusz.hashCode() : 0);
        return result;
    }
}
