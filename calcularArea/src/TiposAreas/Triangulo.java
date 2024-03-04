package TiposAreas;
import java.util.Scanner;
public class Triangulo {
    Scanner sc = new Scanner(System.in);
    public double area, base, altura;

    public void calculot(){
        System.out.println("Triangulo");
        System.out.println("Digite a base do triangulo");
        base = sc.nextDouble();
        System.out.println("Digite a altura do triangulo");
        altura = sc.nextDouble();
        area = base * altura / 2;
        System.out.println("A área do triangulo é " + area + "²");


    }

}
