package ia.contornos;
/*
 * @author Arturo Alvarellos
 */
public class Mostrar {
    
    public Mostrar() {
    }
    public String resposta(String nombre){
        return("Hola "+nombre+" Encantado de conocerte, mi nombre es S1S1");
    }
    public void chiste(int x){
        switch(x){
            case 1: System.out.println("En una agencia de empleo:\n"
                    + "- Hola, ¿tiene algún trabajo para mí?\n"
                    + "\n"
                    + "- Mmm, puede ser, ¿le interesa de jardinero?\n"
                    + "\n"
                    + "- ¿¿¿Dejar dinero??? ¡Pero si yo busco que me lo den!");
            break;
            case 2: System.out.println("- ¿Qué son 50 físicos y 50 químicos juntos?\n"
                    + "- ¡100tíficos!");
            break;
            case 3: System.out.println("- Según su currículum, conoce 20 idiomas.\n"
                    + "- Así es, señor. \n"
                    + "- ¿Y cuál habla mejor? \n"
                    + "- Hablar, hablar, ninguno. Pero sé que existen.");
            break;
            case 4: System.out.println("- Buenas tardes señor, soy el afinador de pianos.\n"
                    + "- Pero yo no lo he llamado... \n"
                    + "\n"
                    + "- Ya, ya, me llamaron sus vecinos.");
            break;
            default: System.out.println("Error en la selección");
        }
    }
}
