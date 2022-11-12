package pe.edu.upc.procv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.procv.model.Servicio;
import pe.edu.upc.procv.repository.ServicioRepository;
import pe.edu.upc.procv.service.ServicioService;

import java.util.List;
import java.util.Optional;

public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public Servicio createServicio(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public void updateServicio(Servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public Servicio getServicio(int id) {
        Optional<Servicio> optional=servicioRepository.findById(id);
        Servicio servicio=optional.get();
        return servicio;
    }

    @Override
    public List<Servicio> getServicios() {
        return (List<Servicio>)servicioRepository.findAll();
    }

    @Override
    public void deleteServicio(int id) {
        servicioRepository.deleteById(id);
    }

    @Override
    public boolean isServicioExist(int id) {
        return servicioRepository.existsById(id);
    }
}
