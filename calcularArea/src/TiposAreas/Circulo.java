package TiposAreas;
import java.lang.Math;
import java.util.Scanner;
public class Circulo {
    Scanner sc = new Scanner(System.in);
    double area,raio;

    public void calculoc(){
        System.out.println("circulo");
        System.out.println("Digite o raio do circulo");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio,2);
        System.out.println("A área do circulo é " + area + "m²");
    }
}
