/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
<<<<<<< HEAD
    public String nombre;
    
    public abstract void setNombre();
    
    @Override
    public String toString() {
    	return nombre.toUpperCase();
=======
    String nombre;
    public abstract void setNombre();

    public String toString(){
        return this.nombre.toUpperCase();
>>>>>>> 8f3d3aac3a0259f5ae274dcfb6d7e904f0c44061
    }
    
}

