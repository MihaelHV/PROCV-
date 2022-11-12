package pe.edu.upc.procv.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="curriculums")
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Curriculum;

    @Column(name = "INTRODUCCION", length = 200, nullable = true)
    private String introduccion;

    @OneToMany(mappedBy = "curriculum")
    Set<ExpAcademica> expAcademicas;

    @OneToMany(mappedBy = "curriculum")
    Set<ExpLaboral> expLaborals;

    @OneToMany(mappedBy = "curriculum")
    Set<Habilidades> Habilidades;


    @OneToOne
    @JoinColumn(name="IDSTUDENT",nullable = false)
    private Student student;

    public Set<ExpAcademica> getExpAcademicas() {
        return expAcademicas;
    }

    public void setExpAcademicas(Set<ExpAcademica> expAcademicas) {
        this.expAcademicas = expAcademicas;
    }

    public Set<ExpLaboral> getExpLaborals() {
        return expLaborals;
    }

    public void setExpLaborals(Set<ExpLaboral> expLaborals) {
        this.expLaborals = expLaborals;
    }

    public Set<pe.edu.upc.procv.model.Habilidades> getHabilidades() {
        return Habilidades;
    }

    public void setHabilidades(Set<pe.edu.upc.procv.model.Habilidades> habilidades) {
        Habilidades = habilidades;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getId_Curriculum() {
        return id_Curriculum;
    }

    public void setId_Curriculum(Integer id_Curriculum) {
        this.id_Curriculum = id_Curriculum;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }
}
