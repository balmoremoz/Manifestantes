import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Piquete piquete;

    public Menu() {
        piquete = new Piquete();
    }

    public void mostrarTodo() {
        System.out.println("Ciudad: " + piquete.ciudad);
        System.out.println("Numero de manifestantes: " + piquete.lista.size());
        System.out.println("Numero de ganaderos: " + piquete.numGanaderos());
        System.out.println("Numero de agricultores: " + piquete.numAgricultores());
        System.out.println("Numero de remolques: " + piquete.numRemolques());
    }

    public void mostrarManifestantes() {
        for (Manifestante m : piquete.lista) {
            System.out.println(m);
        }
    }

    public void mostarEstadisticas() {

    }

    public void agregarManifestante() {
        int tipo;
        String nombre;
        String localidad;
        int numero;
        boolean remolque;
        System.out.println("Tipo de manifestante:");
        System.out.println("1. Ganadero");
        System.out.println("2. Agricultor");
        tipo = Integer.parseInt(System.console().readLine());
        System.out.println("Nombre:");
        nombre = System.console().readLine();
        System.out.println("localidad:");
        localidad = System.console().readLine();

        if (tipo == 1) {
            System.out.println("Numero de manifestante:");
            numero = Integer.parseInt(System.console().readLine());
            piquete.anadirManifestante(new Ganadero(nombre, localidad, numero));
        } else {

            System.out.println("Remolque?");
            remolque = Boolean.parseBoolean(System.console().readLine());
            ArrayList<String> cultivos = new ArrayList<>();
            piquete.anadirManifestante(new Agricultor(remolque, cultivos, nombre, localidad));
        }
    }

    public void buscarManifestante() {
        String nombre;
        System.out.println("Nombre:");
        nombre = System.console().readLine();
        System.out.println(piquete.buscarManifestante(nombre));
    }

    public void eliminarManifestante() {
       int numero;
        numero = Integer.parseInt(System.console().readLine());
        piquete.eliminarManifestante(numero);
    }
}
