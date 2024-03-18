/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balmore
 */
public class Manifestante {
    private String nombre;
    private final int  numero;
    private static int contador=0;
    private String localidad;
    
    public Manifestante(){
        this.nombre="";
        this.numero=0;
        this.localidad="";
    }
    
    public Manifestante(String nombre,String localidad){
        this.nombre=nombre;
        this.localidad=localidad;
        this.numero=contador;
        contador++;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNumero(){
        return this.numero;
    }
    @Override
    public String toString(){
        return this.nombre+" "+this.numero+" "+this.localidad;
    }
}
