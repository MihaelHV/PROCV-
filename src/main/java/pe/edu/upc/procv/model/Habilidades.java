package pe.edu.upc.procv.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "habilidades")
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Habilidad;

    @Column(name = "NOMBRE", length = 50, nullable = true)
    private String nombre_Habilidad;

    @Column(name = "DESCRIPCIÓN", length = 200, nullable = true)
    private String descripcion;

    @Column(name = "NIVEL", nullable = true)
    private Date nivel;


    @ManyToOne
    @JoinColumn(name="IDCURRICULUM",nullable = false)
    private Curriculum curriculum;

    public Integer getId_Habilidad() {
        return id_Habilidad;
    }

    public void setId_Habilidad(Integer id_Habilidad) {
        this.id_Habilidad = id_Habilidad;
    }

    public String getNombre_Habilidad() {
        return nombre_Habilidad;
    }

    public void setNombre_Habilidad(String nombre_Habilidad) {
        this.nombre_Habilidad = nombre_Habilidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getNivel() {
        return nivel;
    }

    public void setNivel(Date nivel) {
        this.nivel = nivel;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }
}


