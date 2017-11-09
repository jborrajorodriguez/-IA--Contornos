package ia.contornos;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez Nº5937 y Arturo Alvarellos Nº 6037
 */
public class IAContornos {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dígame su nombre:");
        String nombre=teclado.nextLine();
        PedirNombre nom=new PedirNombre(nombre);

    }

}
