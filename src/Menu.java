import java.util.ArrayList;

public class Menu {
    private Piquete piquete;

    public Menu(){
        piquete = new Piquete();
    }
    public void mostrarTodo(){

    }
    public void mostrarManifestantes(){
        for(Manifestante m:piquete.lista){
            System.out.println(m);
        }
    }
    public void mostarEstadisticas(){

    }
    public void agregarManifestante(){

    }

    public void eliminarManifestante(){

    }
}
