package pe.edu.upc.procv.service;



import pe.edu.upc.procv.model.Adviser;

import java.util.List;

public interface AdviserService {

    Adviser createAdviser(Adviser adviser);

    Adviser updateAdviser(Adviser adviser);

    Adviser getAdviser(int id);

    List<Adviser> getAdvisers();

    void deleteAdviser(int id);

    boolean isAdviserExist(int id);

}
