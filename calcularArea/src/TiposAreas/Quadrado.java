package TiposAreas;
import java.util.Scanner;
public class Quadrado {
    Scanner sc = new Scanner(System.in);
   public double base, altura, resultado;

    public void calculoq() {
        System.out.println("quadrado");
        System.out.println("Digite o tamanho da base do quadrado");
        base = sc.nextDouble();
        System.out.println("Digite o tamanho da altura do quadrado");
        altura = sc.nextDouble();
        resultado = base * altura;
        System.out.println("O resultado do quadrado é " + resultado +"²");
    }



}
