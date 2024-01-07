package ec.edu.espe.correccionloachamin.correccion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "COLEGIO")
public class Colegio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_COLEGIO", nullable = false)
    private Integer codColegio;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombreColegio;

    public Colegio() {
    }

    public Colegio(Integer codColegio) {
        this.codColegio = codColegio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codColegio == null) ? 0 : codColegio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Colegio other = (Colegio) obj;
        if (codColegio == null) {
            if (other.codColegio != null)
                return false;
        } else if (!codColegio.equals(other.codColegio))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Colegio [codColegio=" + codColegio + ", nombreColegio=" + nombreColegio + "]";
    }

}
