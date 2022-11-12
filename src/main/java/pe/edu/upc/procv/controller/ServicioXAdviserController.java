package pe.edu.upc.procv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.procv.model.ServicioXAdviser;
import pe.edu.upc.procv.service.AdviserService;
import pe.edu.upc.procv.service.ServicioService;
import pe.edu.upc.procv.service.SxaService;

import java.util.List;

@RestController
public class ServicioXAdviserController {

    private SxaService sxaService;

    private ServicioService servicioService;

    private AdviserService adviserService;

@RequestMapping(value = "/adviser/sxa" , method = RequestMethod.GET)
    public ResponseEntity<Object> getSxa(){
    List<ServicioXAdviser> sxaList =sxaService.getSxas();
    return new ResponseEntity<>(sxaList, HttpStatus.OK);
}



}
