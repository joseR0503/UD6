import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tamano = 0;
        String respuesta = null;

        do {
            try {

                System.out.println("Introduce un numero ENTERO entre 1 y 6");
                tamano = teclado.nextInt();

            } catch (InputMismatchException e) {
            } finally {
                teclado.nextLine();
            }

        } while (tamano < 1 || tamano > 6);

        Amigo[] listado = new Amigo[tamano];
        System.out.println();
        System.out.println();
        System.out.println("*** Introducion de nombres***");
        System.out.println();
        String frase;
        boolean asistencia;
        for (int i = 0; i < listado.length; i++) {
            listado[i] = new Amigo();
            System.out.println("Amigo" +(i+1));
            System.out.print("    "  + "->Nombre:");
            frase = teclado.nextLine();
            listado[i].setNombre(frase);
            System.out.print("    "  + "->Telefono:");
            frase = teclado.nextLine();
            listado[i].setTelefono(frase);
            System.out.print("    "  + "->Asistencia:");
            asistencia = teclado.nextBoolean();
            teclado.nextLine();
            listado[i].setAsistencia(asistencia);
        }
        System.out.println();
        System.out.println();
        System.out.println("*** Listado de amigos***");
        System.out.println();
        for (int i = 0; i < listado.length; i++) {
            System.out.println(listado[i].toString());
        }

        do {
            System.out.println("Introduce un numero ENTERO entre 1 y 6");
            respuesta = teclado.nextLine();
            if (respuesta.length() == 1) {
                tamano = respuesta.charAt(0) - 48;
            }
            System.out.println(tamano);

        } while (tamano < 1 || tamano > 6);

        // Amigo amigo1= new Amigo();
        // Amigo amigo2= new Amigo("Pedro", "952123456", false);

        // System.out.println(amigo1);
        // System.out.println(amigo2);

        // amigo1.setNombre("Luis");
        // amigo1.setTelefono("952292929");
        // amigo1.setAsistencia(true);

        // System.out.println(amigo1);

        // System.out.println("***");
        // amigo1.setTelefono("1234567890");
        // System.out.println(amigo1);
        // amigo1.setTelefono("123");
        // System.out.println(amigo1);
        // amigo1.setTelefono("123");
        // System.out.println(amigo1);
        // amigo1.setTelefono("");
        // System.out.println(amigo1);
        // amigo1.setTelefono("a12345678");
        // System.out.println(amigo1);
        // amigo1.setTelefono("123s456");
        // System.out.println(amigo1);
        // amigo1.setTelefono("12345678a");
        // System.out.println(amigo1);

        teclado.close();
    }

}
