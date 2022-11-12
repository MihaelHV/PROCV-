package pe.edu.upc.procv.service;


import pe.edu.upc.procv.model.Servicio;

import java.util.List;

public interface ServicioService
{
    Servicio createServicio(Servicio servicio);

    void updateServicio(Servicio servicio);

    Servicio getServicio(int id);

    List<Servicio> getServicios();

    void deleteServicio(int id);

    boolean isServicioExist(int id);

}
