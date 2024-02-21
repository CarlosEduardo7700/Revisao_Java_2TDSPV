import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecoesTestes {

    public static void main(String[] args) {

        //LIST
        List<String> carros = new ArrayList<>();

        carros.add("Gol");
        carros.add("Astra");
        carros.add("Uno");

        System.out.println("\nUm carro: " + carros.get(0));

        System.out.println("\nList de carros:");
        carros.forEach(System.out::println);

        // SET
        Set<String> cores = new HashSet<>();

        cores.add("preto");
        cores.add("branco");

        System.out.println("\nSet de cores:");
        cores.forEach(System.out::println);

        //MAPS
    }
}
