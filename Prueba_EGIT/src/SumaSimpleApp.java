import java.util.Scanner;

public class SumaSimpleApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double primerNumero = 0;
    double segundoNumero = 0;
    boolean valorCorrecto = false;

    do {
      try {
        System.out.print("Introduce el primer número: ");
        primerNumero = Double.parseDouble(sc.nextLine());
        System.out.print("Introduce el segundo número: ");
        segundoNumero = Double.parseDouble(sc.nextLine());
        valorCorrecto = true;
      } catch (NumberFormatException e) {
        System.out.println("Lo que has introducido no es un número.");
      }
    } while (!valorCorrecto);

    double suma = primerNumero + segundoNumero;

    System.out.println("Resultado: " + suma);

  }

}
