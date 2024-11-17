import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x = 1;
        System.out.println("Digite a opção: ");
        leri();
        while (x != 0) {
            System.out.println("1-Dar a descrição de uma reta na forma de equações paramétricas");
            System.out.println("2-");
            System.out.println("3-");
            System.out.println("4-");
            System.out.println("5-");
            System.out.println("6-");
            System.out.println("Digite a opção: (0 para encerrar)");
            int op = leri();
            switch (op) {
                case 1:
                item1();
                    break;
                case 2:
                item2();
                    break;
                case 3:
                    item3();
                    break;
                case 4:
                    item4();
                    break;
                case 5:
                    item5();
                    break;
                case 6:
                    item6();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }



    public static int leri() {
        Scanner leri = new Scanner(System.in);
        return leri.nextInt();
    }
    public static double lerd() {
        Scanner lerd = new Scanner(System.in);
        return lerd.nextDouble();
    }
    public static double item1() {
        double aux = 0;
        double equaparame = 0;
        System.out.println("Diga o vetor diretor: ");
        double vetord = lerd();
        System.out.println("Diga o ponto da reta: ");
        double pontor = lerd();

        return equaparame;


        // equaparame = equações paramétricas da reta;
    }
    public static double item2() {
        double aux = 0;
        double equageralp = 0;
        System.out.println("Diga o vetor normal: ");
        double vetorn = lerd();
        System.out.println("Diga o ponto do plano: ");
        double pontop = lerd();

        return equageralp;


        //equageralp = equação geral do plano
    }
    public static double item3() {
        double aux = 0;
        double distancia = 0;
        System.out.println("Diga a equação geral do plano: ");
        double equageralp = lerd();
        System.out.println("Diga as coordenadas do plano: ");
        double coordenadasplano = lerd();

        return distancia;

    }
    public static double item4() {
        double aux = 0;
        double distanciaponto = 0;
        System.out.println("Diga a equação paramétrica da reta: ");
        double equapara = lerd();
        System.out.println("Diga as coordenadas do plano");
        double coordenadasplano = lerd();

        return distanciaponto;


        //equapara = equação paramétrica da reta

    }
    public static double item5() {
        double aux = 0;
        double distanciaplano = 0;
        System.out.println("Diga as equações gerais dos planos : ");
        double equageralp = lerd();


        //equageralp = equações gerais dos planos
        return distanciaplano;

    }
    public static double item6() {
        double aux = 0;
        double distanciareta = 0;
        System.out.println("Diga as equações paramétricas das retas: ");
        double equapara = lerd();

        //equapara = equações paramétricas das retas
        return distanciareta;

    }

}