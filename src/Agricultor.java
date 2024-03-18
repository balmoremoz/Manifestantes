
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balmore
 */
public class Agricultor extends Manifestante {
    private boolean remolque;
    private ArrayList<String> cultivos;

    public Agricultor() {
        super();
        this.cultivos=new ArrayList<>();
        this.remolque=false;
    }
    

    public Agricultor(boolean remolque, ArrayList<String> cultivos, String nombre, String localidad) {
        super(nombre, localidad);
        this.remolque = remolque;
        this.cultivos = cultivos;
    }

 
    
    public boolean anadirCultivo(String cultivo){
        cultivos.add(cultivo);
        return true;
    }
    
    public boolean eliminarCultivo(String cultivoEliminar){
        for(String cultivo:cultivos){
            if(cultivoEliminar.equals(cultivo)){
                cultivos.remove(cultivo);
                break;
            }
        }
        return true;
    }
    
    public boolean cambiarRemolque(){
        if (this.remolque){
            this.remolque=false;
        }else{
            this.remolque=true;
        }
        return true;
    }
}
