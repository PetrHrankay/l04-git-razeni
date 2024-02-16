import cz.engeto.ja.Computer;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        Computer computer1 = new Computer("Dell", 2019, BigDecimal.valueOf(15000));
        Computer computer2 = new Computer("HP", 2018, BigDecimal.valueOf(12000));
        Computer computer3 = new Computer("Lenovo", 2017, BigDecimal.valueOf(10000));

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        for (Computer computer : computers) {
            System.out.println(computer.getDescription() + " " + computer.getYearOfProduction() + " " + computer.getPrice());
        }

        computers.sort(Comparator.comparing(Computer::getPrice).reversed());

        System.out.println("\nSorted by highest price:\n");
        computers.forEach(System.out::println);


    }
}