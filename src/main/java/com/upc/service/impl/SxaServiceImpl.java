package com.upc.service.impl;

import com.upc.model.ServicioXAdviser;
import com.upc.repository.ServicioXAdviserRepository;
import com.upc.service.SxaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SxaServiceImpl implements SxaService {

    @Autowired
    private ServicioXAdviserRepository sxaRepository;
    @Override
    public ServicioXAdviser createSxaService(ServicioXAdviser sxa) {
        return sxaRepository.save(sxa);
    }

    @Override
    public void updateServicioXAdviser(ServicioXAdviser sxa) {
        sxaRepository.save(sxa);
    }

    @Override
    public ServicioXAdviser getSxa(int id) {
        Optional<ServicioXAdviser> optional=sxaRepository.findById(id);
        ServicioXAdviser sxa=optional.get();
        return sxa;
    }

    @Override
    public List<ServicioXAdviser> getSxas() {
        return  (List<ServicioXAdviser>)sxaRepository.findAll();
    }

    @Override
    public void deleteSxa(int id) {
        sxaRepository.deleteById(id);
    }

    @Override
    public boolean isSxaExist(int id) {
        return sxaRepository.existsById(id);
    }
}
