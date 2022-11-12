package pe.edu.upc.procv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.procv.model.Adviser;
import pe.edu.upc.procv.model.Student;
import pe.edu.upc.procv.service.AdviserService;

import java.net.ResponseCache;
import java.util.List;

@RestController
@RequestMapping("/advisers")
public class AdviserController {


    private AdviserService adviserService;


    @GetMapping
    public ResponseEntity<?> listAll(){
        try {
            List<Adviser> advisers = adviserService.getAdvisers();
            return ResponseEntity.ok(advisers);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }

    }
    @GetMapping("/{idAdviser}")
    public ResponseEntity<?> listById(@PathVariable int idAdviser) {
        try {
            Adviser adviser = adviserService.getAdviser(idAdviser);
            return ResponseEntity.ok(adviser);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Adviser adviser) {
        try {
            Adviser adviserSave = adviserService.createAdviser(adviser);
            return ResponseEntity.ok(adviserSave);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }
    }
    @PutMapping("/{idAdviser}")
    public ResponseEntity<?> update(@PathVariable int idAdviser, @RequestBody Adviser adviser) {
        try {
            adviser.setIdAdviser(idAdviser);
            Adviser adviserSave = adviserService.updateAdviser(adviser);
            return ResponseEntity.ok(adviserSave);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }
    }
    @DeleteMapping("/{idAdviser}")
    public ResponseEntity<?> deleteById(@PathVariable int idAdviser) {
        try {
            adviserService.deleteAdviser(idAdviser);
            return ResponseEntity.ok(null);
        } catch(Exception e) {
            return ResponseEntity.internalServerError().body(e);
        }
    }







}
