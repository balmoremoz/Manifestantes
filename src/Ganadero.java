/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Balmore
 */
public class Ganadero extends Manifestante{
    private int numEjes;
    private static final int EJESMAX = 10;

    // Constructor por defecto
    public Ganadero() {
        super();
        numEjes = 0;
    }

    // Constructor con parámetros
    public Ganadero(String nombre, String localidad, int numEjes) {
        super(nombre,localidad);
        this.numEjes=numEjes;
        // Agrega la implementación para usar 'nombre' y 'localidad' según tus requisitos.
    }

    // Método toString para devolver una representación en cadena del objeto

    @Override
    public String toString() {
        return super.toString()+"Ganadero{" + "numEjes=" + numEjes + '}';
    }

}

