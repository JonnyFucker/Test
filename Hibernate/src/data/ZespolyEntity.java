package data;

import javax.persistence.*;

/**
 * Created by Tomek on 2016-07-04.
 */
@Entity
@Table(name = "ZESPOLY", schema = "HR", catalog = "")
public class ZespolyEntity {
    private byte idZesp;
    private String nazwa;
    private String adres;

    @Id
    @Column(name = "ID_ZESP")
    public byte getIdZesp() {
        return idZesp;
    }

    public data.ZespolyEntity setIdZesp(byte idZesp) {
        this.idZesp = idZesp;
        return this;
    }

    @Basic
    @Column(name = "NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    public data.ZespolyEntity setNazwa(String nazwa) {
        this.nazwa = nazwa;
        return this;
    }

    @Basic
    @Column(name = "ADRES")
    public String getAdres() {
        return adres;
    }

    public data.ZespolyEntity setAdres(String adres) {
        this.adres = adres;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZespolyEntity that = (ZespolyEntity) o;

        if (idZesp != that.idZesp) return false;
        if (nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if (adres != null ? !adres.equals(that.adres) : that.adres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idZesp;
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        return result;
    }
}
