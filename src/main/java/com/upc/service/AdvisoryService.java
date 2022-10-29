package com.upc.service;

import com.upc.model.Advisory;
import com.upc.model.Servicio;

import java.util.List;

public interface AdvisoryService {

    Advisory createAdvisory(Advisory advisory);

    void updateAdvisory(Advisory advisory);

    Advisory getAdvisory(int id);

    List<Advisory> getAdvisorys();

    void deleteAdvisory(int id);

    boolean isAdvisoryExist(int id);

}
