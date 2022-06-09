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
        postre.aderezos().add(aderezo);
    }
    
    public static void quitarAderezoPostre(Postre postre,Aderezo aderezo){
        postre.aderezos().remove(aderezo);
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    public String getSabor() {
    	return sabor;
    }
    public double getPrecioParcial() {
    	return precioParcial;
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
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
}

