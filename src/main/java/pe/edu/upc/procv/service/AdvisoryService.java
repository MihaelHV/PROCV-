package pe.edu.upc.procv.service;


import pe.edu.upc.procv.model.Advisory;

import java.util.List;

public interface AdvisoryService {

    Advisory createAdvisory(Advisory advisory);

    void updateAdvisory(Advisory advisory);

    Advisory getAdvisory(int id);

    List<Advisory> getAdvisorys();

    void deleteAdvisory(int id);

    boolean isAdvisoryExist(int id);

}
