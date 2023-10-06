package sv.edu.www.udb.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "estudiantes", schema = "registro_estudiantes", catalog = "")
public class EstudiantesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "carnet", nullable = false, length = 8)
    private String carnet;
    @Basic
    @Column(name = "nombres", nullable = false, length = 40)
    private String nombres;
    @Basic
    @Column(name = "apellidos", nullable = false, length = 40)
    private String apellidos;
    @Basic
    @Column(name = "edad", nullable = false)
    private int edad;
    @Basic
    @Column(name = "cum", nullable = false, precision = 2)
    private BigDecimal cum;
    @Basic
    @Column(name = "genero", nullable = false, length = 1)
    private String genero;
    @Basic
    @Column(name = "carrera", nullable = false, length = 40)
    private String carrera;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public BigDecimal getCum() {
        return cum;
    }

    public void setCum(BigDecimal cum) {
        this.cum = cum;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstudiantesEntity that = (EstudiantesEntity) o;

        if (edad != that.edad) return false;
        if (carnet != null ? !carnet.equals(that.carnet) : that.carnet != null) return false;
        if (nombres != null ? !nombres.equals(that.nombres) : that.nombres != null) return false;
        if (apellidos != null ? !apellidos.equals(that.apellidos) : that.apellidos != null) return false;
        if (cum != null ? !cum.equals(that.cum) : that.cum != null) return false;
        if (genero != null ? !genero.equals(that.genero) : that.genero != null) return false;
        if (carrera != null ? !carrera.equals(that.carrera) : that.carrera != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = carnet != null ? carnet.hashCode() : 0;
        result = 31 * result + (nombres != null ? nombres.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        result = 31 * result + (cum != null ? cum.hashCode() : 0);
        result = 31 * result + (genero != null ? genero.hashCode() : 0);
        result = 31 * result + (carrera != null ? carrera.hashCode() : 0);
        return result;
    }
}
