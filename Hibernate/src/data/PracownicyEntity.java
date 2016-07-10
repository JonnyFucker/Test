package data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

/**
 * Created by Tomek on 2016-07-04.
 */
@Entity
@Table(name = "PRACOWNICY", schema = "HR", catalog = "")
public class PracownicyEntity {
    private Integer idPrac;
    private String nazwisko;
    private Date zatrudniony;
    private Long placaPod;
    private Long placaDod;

    @Id
    @Column(name = "ID_PRAC")
    public Integer getIdPrac() {
        return idPrac;
    }

    public data.PracownicyEntity setIdPrac(Integer idPrac) {
        this.idPrac = idPrac;
        return this;
    }

    @Basic
    @Column(name = "NAZWISKO")
    public String getNazwisko() {
        return nazwisko;
    }

    public data.PracownicyEntity setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    @Basic
    @Column(name = "ZATRUDNIONY")
    public Date getZatrudniony() {
        return zatrudniony;
    }

    public data.PracownicyEntity setZatrudniony(Date zatrudniony) {
        this.zatrudniony = zatrudniony;
        return this;
    }

    @Basic
    @Column(name = "PLACA_POD")
    public Long getPlacaPod() {
        return placaPod;
    }

    public data.PracownicyEntity setPlacaPod(Long placaPod) {
        this.placaPod = placaPod;
        return this;
    }

    @Basic
    @Column(name = "PLACA_DOD")
    public Long getPlacaDod() {
        return placaDod;
    }

    public data.PracownicyEntity setPlacaDod(Long placaDod) {
        this.placaDod = placaDod;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PracownicyEntity that = (PracownicyEntity) o;

        if (idPrac != that.idPrac) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (zatrudniony != null ? !zatrudniony.equals(that.zatrudniony) : that.zatrudniony != null) return false;
        if (placaPod != null ? !placaPod.equals(that.placaPod) : that.placaPod != null) return false;
        if (placaDod != null ? !placaDod.equals(that.placaDod) : that.placaDod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idPrac;
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (zatrudniony != null ? zatrudniony.hashCode() : 0);
        result = 31 * result + (placaPod != null ? placaPod.hashCode() : 0);
        result = 31 * result + (placaDod != null ? placaDod.hashCode() : 0);
        return result;
    }
}
