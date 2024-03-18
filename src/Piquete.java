import java.util.ArrayList;

public class Piquete {

    ArrayList<Manifestante> lista;
    String ciudad;

    public Piquete() {
        lista = new ArrayList<>();
        ciudad = "";
    }

    public Piquete(String ciudad) {
        this.lista = new ArrayList<>();
        this.ciudad = ciudad;
    }

    public boolean anadirManifestante(Manifestante m) {
        return lista.add(m);
    }

    public boolean eliminarManifestante(int numero) {
        for (Manifestante m : lista) {
            if (m.getNumero() == numero) {
                return lista.remove(m);
            }
        }
        return false;
    }

    public Manifestante buscarManifestante(String nombre) {
        for (Manifestante m : lista) {
            if (m.getNombre().equals(nombre)) {
                return m;
            }
        }
        return null;
    }

    public int numGanaderos(){
        int contador=0;
        for(Manifestante m:lista){
            if(m instanceof Ganadero){
                contador++;
            }
        }
        return contador;
    }

    public int numAgricultores(){
        int contador=0;
        for(Manifestante m:lista){
            if(m instanceof Agricultor){
                contador++;
            }
        }
        return contador;
    }

    public int numRemolques(){
        int contador=0;
        for(Manifestante agricultor:lista){
            if(agricultor instanceof Agricultor){
                if(((Agricultor) agricultor).getRemolque()){
                    contador++;
                }
            }
        }
        return contador;
    }

    public int manifestantesTotales(){
        return lista.size();
    }

    public String ToString(){
        return "Piquete{" + "lista=" + lista + ", ciudad=" + ciudad + '}';
    }
}
