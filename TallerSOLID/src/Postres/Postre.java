/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;
import Leche.LecheEntera;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Postre{
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    
    public abstract void cambiarLeche(LecheEntera cambiar_Leche);
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        this.precioParcial = 15.55;
    }
    
    public static void anadirAderezoPostre(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    public double getPrecioParcial() {
    	return precioParcial;
    }
    
    public static void quitarAderezoPostre(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    public String getSabor() {
    	return sabor;
    }
    
    public ArrayList<Aderezo> getAderezo(){
    	return aderezos;
    }
    public void addAderezo(Aderezo aderezo) {
    	this.aderezos.add(aderezo);
    }
    public void deleteAderezo(Aderezo aderezo) {
    	this.aderezos.remove(aderezo);
    }
    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + sabor + ", precioParcial=" + precioParcial + ", aderezos=" + aderezos + '}';
    }
    
    
}

