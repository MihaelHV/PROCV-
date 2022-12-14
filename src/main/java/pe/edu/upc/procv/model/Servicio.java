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
@Table(name = "servicios")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServicio;

    @Column(name = "NOMBRE_SERVICIO", length = 100, nullable = false)
    private String serviceName;

    @Column(name = "PRECIO", nullable = false)
    private double precio;

    @OneToMany(mappedBy = "servicio")
    Set<ServicioXAdviser> serviciosAdviser;


    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Set<ServicioXAdviser> getServiciosAdviser() {
        return serviciosAdviser;
    }

    public void setServiciosAdviser(Set<ServicioXAdviser> serviciosAdviser) {
        this.serviciosAdviser = serviciosAdviser;
    }

}
