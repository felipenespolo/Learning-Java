package modulo11Listas;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //nao aceita tipos primitivos, somente wrapper classes (tipo Integer, Double, etc, nao int, double, etc)
        list.add("Maria"); 
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); //adiciona o elemento na posicao 2, e os outros elementos a partir disso sao deslocados para a direita
        System.out.println("List size: " + list.size());
        
        for (String x : list) {
            System.out.println(x);
        } 
        System.out.println("------------------------------------");
        //list.remove(3); //remove o elemento da posicao 3, e os outros elementos a partir disso sao deslocados para a esquerda

        list.removeIf(x -> x.charAt(0) == 'M'); //remove os elementos que comecam com a letra M
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob")); //retorna a posicao do elemento, ou -1 se o elemento nao for encontrado
        System.out.println("Index of Marco: " + list.indexOf("Marco")); //retorna -1, pois o elemento foi removido

        System.out.println("------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList(); //filtra os elementos que comecam com a letra A e retorna uma nova lista
        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); //filtra os elementos que comecam com a letra A e retorna o primeiro elemento encontrado, ou null se nenhum elemento for encontrado
        System.out.println("Name: " + name);
    }
}
