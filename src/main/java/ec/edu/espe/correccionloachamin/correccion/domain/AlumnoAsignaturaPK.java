package ec.edu.espe.correccionloachamin.correccion.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class AlumnoAsignaturaPK implements Serializable{
    @Column(name="COD_ALUMNO", nullable = false)
    private Integer codAlumno;
    @Column(name="COD_ASIGNATURA", nullable = false, length = 100)
    private String codAsignatura;
    public AlumnoAsignaturaPK() {
    }
    public AlumnoAsignaturaPK(Integer codAlumno, String codAsignatura) {
        this.codAlumno = codAlumno;
        this.codAsignatura = codAsignatura;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
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
        AlumnoAsignaturaPK other = (AlumnoAsignaturaPK) obj;
        if (codAlumno == null) {
            if (other.codAlumno != null)
                return false;
        } else if (!codAlumno.equals(other.codAlumno))
            return false;
        if (codAsignatura == null) {
            if (other.codAsignatura != null)
                return false;
        } else if (!codAsignatura.equals(other.codAsignatura))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "AlumnoAsignaturaPK [codAlumno=" + codAlumno + ", codAsignatura=" + codAsignatura + "]";
    }

}
