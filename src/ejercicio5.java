import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ini, con = 0;
        String texto, nueva ="", mensaje = "";

        System.out.println("Introduzc el texto a evaluar");
        texto = scanner.nextLine();

        for (ini = 0; ini < texto.length() ; ini++) {
            if (texto.charAt(ini) != ' '){
                nueva = nueva + texto.charAt(ini);
            }
        }
        nueva = nueva.toLowerCase();
        for (char caracter = 'a'; caracter <= 'z'; caracter++){
            for (ini = 0; ini < nueva.length(); ini++){
                if (caracter == nueva.charAt(ini)){
                    con++;
                }
            }
            if (con == 0){
                mensaje += caracter + " ";
            }
            con = 0;
        }
        System.out.println("\nLos carateres que faltan son: \n" + mensaje);


}
    }