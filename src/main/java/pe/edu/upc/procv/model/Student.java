package pe.edu.upc.procv.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_student")
    private int idStudent;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="dni")
    private String dni;

    @Column(name="email")
    private String email;

    @Column(name="cellphone")
    private String cellphone;

    @OneToOne(mappedBy = "student")
    private Curriculum curriculum;

    @OneToMany(mappedBy = "student")
    Set<Advisory> advisorys;

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public Set<Advisory> getAdvisorys() {
        return advisorys;
    }

    public void setAdvisorys(Set<Advisory> advisorys) {
        this.advisorys = advisorys;
    }

    public Student(int idStudent, String firstName, String lastName, String dni, String email, String cellphone, Curriculum curriculum, Set<Advisory> advisorys) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.email = email;
        this.cellphone = cellphone;
        this.curriculum = curriculum;
        this.advisorys = advisorys;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
}
