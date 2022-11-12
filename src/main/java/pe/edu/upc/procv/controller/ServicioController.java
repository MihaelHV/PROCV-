package pe.edu.upc.procv.controller;

import com.upc.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.procv.model.Servicio;
import pe.edu.upc.procv.service.ServicioService;

import java.util.List;

@RestController
@RequestMapping("/adviser/servicios")
public class ServicioController {

    private ServicioService servicioService;

    @RequestMapping(value = "/adviser/servicios", method = RequestMethod.POST)
    public ResponseEntity<Object> createServicio(@RequestBody Servicio servicio)
    {
        servicio = servicioService.createServicio(servicio);
        return new ResponseEntity<>("Created successfully with id = " +servicio.getIdServicio(), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/adviser/servicios/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateServicio(@PathVariable("id") int id,
                                                 @RequestBody Servicio servicio)
    {
        boolean isServicioExist = servicioService.isServicioExist(id);
        if (isServicioExist)
        {
            servicio.setIdServicio(id);
            servicioService.updateServicio(servicio);
            return new ResponseEntity<>("Updated successsfully", HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }

    @RequestMapping(value = "/adviser/servicios/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getServicio(@PathVariable("id") int id)
    {
        boolean isServicioExist = servicioService.isServicioExist(id);
        if (isServicioExist)
        {
            Servicio servicio =servicioService.getServicio(id);
            return new ResponseEntity<>(servicio, HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }

    @RequestMapping(value = "/adviser/servicios", method = RequestMethod.GET)
    public ResponseEntity<Object> getServicios()
    {
        List<Servicio> servicioList = servicioService.getServicios();
        return new ResponseEntity<>(servicioList, HttpStatus.OK);
    }

    @RequestMapping(value = "/adviser/servicios/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteServicio(@PathVariable("id") int id)
    {
        boolean isServicioExist = servicioService.isServicioExist(id);
        if (isServicioExist)
        {
          servicioService.deleteServicio(id);
            return new ResponseEntity<>("Deleted successsfully", HttpStatus.OK);
        }
        else
        {
            throw new StudentNotFoundException();
        }

    }


}
