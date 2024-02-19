package cz.engeto.ja;

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {

    private List<Computer> computers = new ArrayList<>();
    private int countOfDellComputers = 0;


    public ComputerManager(List<Computer> computers) {
        this.computers = computers;
    }
}
