package com.upc.service;

import com.upc.model.Servicio;
import com.upc.model.Student;

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
