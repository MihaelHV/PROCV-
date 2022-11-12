package pe.edu.upc.procv.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "advisers")
public class Adviser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdviser;

    @Column(name = "First_NameAs", length = 50, nullable = false)
    private String firstName;

    @Column(name = "Last_NameAs", length = 50, nullable = false)
    private String lastName;

    @Column(name = "Email_As", length = 50, nullable = false)
    private String email;

    @Column(name = "Dni_As", nullable = false)
    private Long dni;

    @Column(name = "Num_Cel_As", nullable = false)
    private Long telefono;


    @OneToMany(mappedBy = "adviser")
    Set<ServicioXAdviser> serviciosAdviser;

    public Integer getIdAdviser() {
        return idAdviser;
    }

    public void setIdAdviser(Integer idAdviser) {
        this.idAdviser = idAdviser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Set<ServicioXAdviser> getServiciosAdviser() {
        return serviciosAdviser;
    }

    public void setServiciosAdviser(Set<ServicioXAdviser> serviciosAdviser) {
        this.serviciosAdviser = serviciosAdviser;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
