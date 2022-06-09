/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Leche.LecheDeslactosada;
import Leche.LecheDescremada;
import Leche.LecheEntera;
import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class ManejadorDeLeche {
    
   protected LecheEntera cambio_leche;
   
   public ManejadorDeLeche(LecheEntera cambio_leche) {
	   this.cambio_leche = cambio_leche;
   }
   public void cambiarLeche(Postre postre) {
	   postre.cambiarLeche(cambio_leche);
   }
    
}
