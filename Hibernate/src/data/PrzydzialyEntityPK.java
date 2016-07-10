package data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Tomek on 2016-07-04.
 */
public class PrzydzialyEntityPK implements Serializable {
    private byte idProjektu;
    private byte nrPracownika;

    @Column(name = "ID_PROJEKTU")
    @Id
    public byte getIdProjektu() {
        return idProjektu;
    }

    public data.PrzydzialyEntityPK setIdProjektu(byte idProjektu) {
        this.idProjektu = idProjektu;
        return this;
    }

    @Column(name = "NR_PRACOWNIKA")
    @Id
    public byte getNrPracownika() {
        return nrPracownika;
    }

    public data.PrzydzialyEntityPK setNrPracownika(byte nrPracownika) {
        this.nrPracownika = nrPracownika;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrzydzialyEntityPK that = (PrzydzialyEntityPK) o;

        if (idProjektu != that.idProjektu) return false;
        if (nrPracownika != that.nrPracownika) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idProjektu;
        result = 31 * result + (int) nrPracownika;
        return result;
    }
}
