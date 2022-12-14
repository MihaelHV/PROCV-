package com.upc.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "servicios_advisers")
public class ServicioXAdviser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicioAdviser;


    @Column(name = "HORA_INICIO", length = 8, nullable = false)
    private String horaInicio;


    @Column(name = "HORA_FIN", length = 8, nullable = false)
    private String horaFin;

    @ManyToOne
    @JoinColumn(name = "IDADVISER", nullable = false)
    private Adviser adviser;

    @ManyToOne
    @JoinColumn(name = "IDSERVICIO", nullable = false)
    private Servicio servicio;

    @OneToMany(mappedBy = "servicioAdviser")
    Set<Advisory> advisories;

    public ServicioXAdviser() {

    }

    public ServicioXAdviser(Integer idServicioAdviser,String horaInicio, String horaFin,
                            Adviser adviser,Servicio servicio, Set<Advisory> advisories) {

        this.idServicioAdviser = idServicioAdviser;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.adviser = adviser;
        this.servicio = servicio;
        this.advisories = advisories;

    }

    public Integer getIdServicioAdviser() {
        return idServicioAdviser;
    }

    public void setIdServicioAdviser(Integer idServicioAdviser) {
        this.idServicioAdviser = idServicioAdviser;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public Adviser getAdviser() {
        return adviser;
    }

    public void setAdviser(Adviser adviser) {
        this.adviser = adviser;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Set<Advisory> getAdvisories() {
        return advisories;
    }

    public void setAdvisories(Set<Advisory> advisories) {
        this.advisories = advisories;
    }

    @Override
    public String toString() {
        return adviser.getFirstName() + " " +adviser.getLastName() + "  |  " + servicio.getServiceName() + "  |  "+ horaInicio + " - " + horaFin ;
    }
}