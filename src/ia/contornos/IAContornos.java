package ia.contornos;

import java.util.Scanner;

/**
 * @author Juan Borrajo Rodriguez 5937
 */
public class IAContornos {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//Se crea el objecto Scanner.
        System.out.println("Dígame su nombre:");//muestra en pantalla un mensaje.
        String nombre=teclado.nextLine();//Se crea la variable nombre de tipo String.
        PedirNombre nom=new PedirNombre(nombre);//Se instancia la clase PedirNombre con el objecto nom.
        Mostrar IA=new Mostrar();                           //Creamos un objeto de la clase mostrar para usar la IA
        System.out.println(IA.resposta(nom.getNombre()));   //Esta linea muestra la respuesta de la IA
        System.out.println("¿quieres que te cuente un chiste?");
        System.out.println("Selecciona un numero del 1 al 4");
        IA.chiste(teclado.nextInt());
    }

}
