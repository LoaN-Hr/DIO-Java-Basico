package ExerciciosStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaNumerosPares {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public static void main(String[] args) {
        // Cria uma lista de números
        List<Integer> numeros = Arrays.asList(5, 2, 4, 1, 3);

        // Filtra os números pares da lista
        List<Integer> numerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        // Soma os números pares
        int soma = numerosPares.stream()
                .mapToInt(Integer::valueOf)
                .sum();

        // Exibe a soma dos números pares no console
        System.out.println("Soma dos números pares: " + soma);
    }
}