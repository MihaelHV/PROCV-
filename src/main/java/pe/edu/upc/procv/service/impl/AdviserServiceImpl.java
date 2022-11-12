package pe.edu.upc.procv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.procv.model.Adviser;
import pe.edu.upc.procv.repository.AdviserRepository;
import pe.edu.upc.procv.service.AdviserService;

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
    public Adviser updateAdviser(Adviser adviser) {
        return adviserRepository.save(adviser);
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
