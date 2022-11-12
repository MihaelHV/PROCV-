package pe.edu.upc.procv.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ExperienciasLaborales")
public class ExpLaboral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Exp_Laboral;

    @Column(name = "INSTITUCION", length = 50, nullable = true)
    private String nombre_Institucion;

    @Column(name = "DESCRIPCIÓN", length = 200, nullable = true)
    private String descripcion;

    @Column(name = "FECHA_INICIO", nullable = true)
    private Date fecha_Inicio;

    @Column(name = "FECHA_FIN", nullable = true)
    private Date fecha_Fin;

    @ManyToOne
    @JoinColumn(name="IDCURRICULUM",nullable = false)
    private Curriculum curriculum;

    public Integer getId_Exp_Laboral() {
        return id_Exp_Laboral;
    }

    public void setId_Exp_Laboral(Integer id_Exp_Laboral) {
        this.id_Exp_Laboral = id_Exp_Laboral;
    }

    public String getNombre_Institucion() {
        return nombre_Institucion;
    }

    public void setNombre_Institucion(String nombre_Institucion) {
        this.nombre_Institucion = nombre_Institucion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }
}

