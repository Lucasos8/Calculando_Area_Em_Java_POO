package Aplication;
import TiposAreas.Quadrado;
import TiposAreas.Triangulo;
import TiposAreas.Circulo;
import java.util.Scanner;
import java.lang.Math;

public class Calculo_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int escolha = -1;
    while (escolha != 0) {
        System.out.print("Escolha para calcular a área: \n(1)Para Triangulo\n(2)Para quadrado\n(3)Para circulo\n(0)Para encerrar\n");
        escolha = sc.nextInt();
        if (escolha == 1) {
            Triangulo t = new Triangulo();
            t.calculot();
        } else if (escolha == 2) {
            Quadrado q = new Quadrado();
            q.calculoq();
        } else if (escolha == 3) {
            Circulo c = new Circulo();
            c.calculoc();
        } else if (escolha == 0) {
            System.out.println("Adeus!");
        } else {
            System.out.println("Número invalido, tente novamente");
        }


        }
    }
}