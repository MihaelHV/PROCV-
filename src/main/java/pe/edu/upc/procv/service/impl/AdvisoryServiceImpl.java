package pe.edu.upc.procv.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.upc.procv.model.Advisory;
import pe.edu.upc.procv.repository.AdvisoryRepository;
import pe.edu.upc.procv.service.AdvisoryService;

import java.util.List;
import java.util.Optional;

public class AdvisoryServiceImpl implements AdvisoryService {
@Autowired
private AdvisoryRepository advisoryRepository;

    @Override
    public Advisory createAdvisory(Advisory advisory) {
        return advisoryRepository.save(advisory);
    }

    @Override
    public void updateAdvisory(Advisory advisory) {
        advisoryRepository.save(advisory);
    }

    @Override
    public Advisory getAdvisory(int id) {
        Optional<Advisory> optional = advisoryRepository.findById(id);
        Advisory advisory = optional.get();
        return advisory;
    }

    @Override
    public List<Advisory> getAdvisorys() {
        return (List<Advisory>)advisoryRepository.findAll();
    }

    @Override
    public void deleteAdvisory(int id) {
        advisoryRepository.deleteById(id);
    }

    @Override
    public boolean isAdvisoryExist(int id) {
        return advisoryRepository.existsById(id);
    }
}
