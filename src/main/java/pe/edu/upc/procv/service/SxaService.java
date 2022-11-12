package pe.edu.upc.procv.service;


import pe.edu.upc.procv.model.ServicioXAdviser;

import java.util.List;

public interface SxaService {

    ServicioXAdviser createSxaService(ServicioXAdviser sxa);

    void updateServicioXAdviser(ServicioXAdviser sxa);

    ServicioXAdviser getSxa(int id);

    List<ServicioXAdviser> getSxas();

    void deleteSxa(int id);

    boolean isSxaExist(int id);
}
