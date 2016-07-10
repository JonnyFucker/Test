package data;

import javax.persistence.*;

/**
 * Created by Tomek on 2016-07-04.
 */
@Entity
@Table(name = "ETATY", schema = "HR", catalog = "")
public class EtatyEntity {
    private String nazwa;
    private Integer placaMin;
    private Integer placaMax;

    @Id
    @Column(name = "NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    public data.EtatyEntity setNazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    @Basic
    @Column(name = "PLACA_MIN")
    public int getPlacaMin() {
        return placaMin;
    }

    public data.EtatyEntity setPlacaMin(int placaMin) {
        this.placaMin = placaMin;
        return this;
    }

    @Basic
    @Column(name = "PLACA_MAX")
    public int getPlacaMax() {
        return placaMax;
    }

    public data.EtatyEntity setPlacaMax(int placaMax) {
        this.placaMax = placaMax;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatyEntity that = (EtatyEntity) o;

        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (placaMin != null ? !placaMin.equals(that.placaMin) : that.placaMin != null) return false;
        if (placaMax != null ? !placaMax.equals(that.placaMax) : that.placaMax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (placaMin != null ? placaMin.hashCode() : 0);
        result = 31 * result + (placaMax != null ? placaMax.hashCode() : 0);
        return result;
    }
}
