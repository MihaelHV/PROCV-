package com.upc.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStudent;

    @Column(name = "FIRSTNAME", length = 80, nullable = false)
    private String firstName;

    @Column(name = "LASTNAME", length = 80, nullable = false)
    private String lastName;

    @Column(name = "EMAIL", length = 80, nullable = false)
    private String email;

    @Column(name = "DNI", nullable = false)
    private Long dni;


    @Column(name = "NUMERO", nullable = false)
    private Long numero;

    @OneToMany(mappedBy = "student")
    Set<Advisory> advisories;



    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
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

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }


    public Set<Advisory> getAdvisories() {
        return advisories;
    }

    public void setAdvisories(Set<Advisory> advisories) {
        this.advisories = advisories;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}