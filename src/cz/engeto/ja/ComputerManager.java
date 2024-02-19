package cz.engeto.ja;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComputerManager {

    private final List<Computer> computers; // = new ArrayList<>();

    private int countOfDellComputers = 0;

    public ComputerManager(List<Computer> computers) {
//        this.computers.addAll(computers);  nebo jeste jinak viz dalsi radek
        this.computers = new ArrayList<>(computers);
        for (Computer computer : computers) {
            if (computer.getDescription().equals("Dell")) {
                countOfDellComputers++;

            }
        }
    }

    public int getCountOfDellComputers() {
        return countOfDellComputers;
    }
    public List<Computer> getComputers() {
        return new ArrayList<>(computers);

    }
}


