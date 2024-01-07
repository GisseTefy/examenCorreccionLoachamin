package ec.edu.espe.correccionloachamin.correccion.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "ASIGNATURA")
public class Asignatura {
    @Id
    @Column(name = "COD_ASIGNATURA", nullable = false, length = 10)
    private String codAsignatura;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombreAsignatura;

    @Column(name = "CREDITOS", nullable = true)
    private Integer codCreditos;

    public Asignatura() {
    }

    public Asignatura(String codAsignatura) {
        this.codAsignatura = codAsignatura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAsignatura == null) ? 0 : codAsignatura.hashCode());
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
        Asignatura other = (Asignatura) obj;
        if (codAsignatura == null) {
            if (other.codAsignatura != null)
                return false;
        } else if (!codAsignatura.equals(other.codAsignatura))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Asignatura [codAsignatura=" + codAsignatura + ", nombreAsignatura=" + nombreAsignatura
                + ", codCreditos=" + codCreditos + "]";
    }




}
