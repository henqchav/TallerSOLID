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
public class Helado extends Postre{
    public Helado(String sabor){
        super(sabor);
    }
    
    @Override
    public String toString() {
    	return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getPrecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
    
    @Override
    public void cambiarLeche(LecheEntera cambiar_Leche) {
    	cambiar_Leche.leche();
    }
    
    
}
