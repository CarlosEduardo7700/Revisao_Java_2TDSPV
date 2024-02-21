import java.util.*;

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
        Map<String, String> estadosBrasileiros = new HashMap<>();

        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("MG", "Minas Gerais");

        System.out.println("\nMap de estados:");
        System.out.println(estadosBrasileiros);;
    }
}
