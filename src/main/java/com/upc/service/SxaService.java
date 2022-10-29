package com.upc.service;

import com.upc.model.ServicioXAdviser;
import com.upc.model.Student;

import java.util.List;

public interface SxaService {

    ServicioXAdviser createSxaService(ServicioXAdviser sxa);

    void updateServicioXAdviser(ServicioXAdviser sxa);

    ServicioXAdviser getSxa(int id);

    List<ServicioXAdviser> getSxas();

    void deleteSxa(int id);

    boolean isSxaExist(int id);
}
