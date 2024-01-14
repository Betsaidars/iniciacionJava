import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){


    Scanner scanner = new Scanner(System.in);


    int i, j, k = 0;
    String cadena1, cadena2, cadena3 = "";

        System.out.println("Introduzca la primera cadena");
        cadena1 = scanner.nextLine();
        System.out.println("Introduzca la segunda cadena");
        cadena2 = scanner.nextLine();

        for (i = 0; i < cadena1.length(); i++) {
            cadena3 += cadena1.charAt(i);
            for (j = k; j < cadena2.length(); j++){
                cadena3 += cadena2.charAt(i);
                j = cadena2.length();
                k++;
            }
        }
        System.out.println("La cadena intercalada es: " + cadena3);

    }
}