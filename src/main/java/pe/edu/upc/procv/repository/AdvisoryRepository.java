package pe.edu.upc.procv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.procv.model.Advisory;


@Repository
public interface AdvisoryRepository extends CrudRepository<Advisory, Integer> {

}
