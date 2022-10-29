package com.upc.service.impl;

import com.upc.model.Adviser;
import com.upc.repository.AdviserRepository;
import com.upc.service.AdviserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AdviserServiceImpl implements AdviserService {
@Autowired
private AdviserRepository adviserRepository;

    @Override
    public Adviser createAdviser(Adviser adviser) {
        return adviserRepository.save(adviser);
    }

    @Override
    public void updateAdviser(Adviser adviser) {
        adviserRepository.save(adviser);
    }

    @Override
    public Adviser getAdviser(int id) {
        Optional<Adviser> optional = adviserRepository.findById(id);
        Adviser adviser = optional.get();
        return adviser;
    }

    @Override
    public List<Adviser> getAdvisers() {
        return (List<Adviser>)adviserRepository.findAll();
    }

    @Override
    public void deleteAdviser(int id) {
        adviserRepository.deleteById(id);
    }

    @Override
    public boolean isAdviserExist(int id) {
        return adviserRepository.existsById(id);
    }
}
