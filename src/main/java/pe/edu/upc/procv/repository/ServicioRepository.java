package pe.edu.upc.procv.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.procv.model.Servicio;

@Repository
public interface ServicioRepository extends CrudRepository<Servicio, Integer> {


}
