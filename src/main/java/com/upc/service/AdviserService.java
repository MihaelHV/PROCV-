package com.upc.service;

import com.upc.model.Adviser;

import java.util.List;

public interface AdviserService {

    Adviser createAdviser(Adviser adviser);

    void updateAdviser(Adviser adviser);

    Adviser getAdviser(int id);

    List<Adviser> getAdvisers();

    void deleteAdviser(int id);

    boolean isAdviserExist(int id);

}
