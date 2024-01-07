package ec.edu.espe.correccionloachamin.correccion.domain;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "ALUMNO")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ALUMNO", nullable = false)
    private Integer codAlumno;

    @Column(name = "COD_COLEGIO", nullable = true)
    private Integer codColegio;

    @Column(name = "CEDULA", nullable = false, length = 100)
    private String cedula;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombreAlumno;

    @Column(name = "FECHA_NACIMIENTO", nullable = true)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "FECHA_CREACION", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaCreacion;

    @ManyToOne()
    @JoinColumn(name = "COD_COLEGIO", nullable = false, updatable = false, insertable = false)
    private Colegio colegio;

    public Alumno() {
    }

    public Alumno(Integer codAlumno) {
        this.codAlumno = codAlumno;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codAlumno == null) ? 0 : codAlumno.hashCode());
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
        Alumno other = (Alumno) obj;
        if (codAlumno == null) {
            if (other.codAlumno != null)
                return false;
        } else if (!codAlumno.equals(other.codAlumno))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Alumno [codAlumno=" + codAlumno + ", codColegio=" + codColegio + ", cedula=" + cedula
                + ", nombreAlumno=" + nombreAlumno + ", fechaNacimiento=" + fechaNacimiento + ", fechaCreacion="
                + fechaCreacion + ", colegio=" + colegio + "]";
    }

    
}
