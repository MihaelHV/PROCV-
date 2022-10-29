package com.upc.controller;

import com.upc.model.ServicioXAdviser;
import com.upc.service.AdviserService;
import com.upc.service.ServicioService;
import com.upc.service.SxaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicioXAdviserController {
@Autowired
 private SxaService sxaService;

@Autowired
    private ServicioService servicioService;

@Autowired
    private AdviserService adviserService;

@RequestMapping(value = "/adviser/sxa" , method = RequestMethod.GET)
    public ResponseEntity<Object> getSxa(){
    List<ServicioXAdviser> sxaList =sxaService.getSxas();
    return new ResponseEntity<>(sxaList, HttpStatus.OK);
}



}
