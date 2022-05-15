/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author samnd
 */
public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(int code, double solde) {
        super(code, solde);
    }

    @Override
    public void retirer(double mt) {
        if(mt > solde + decouvert) throw new RuntimeException("solde insuffisant");
        Retrait r = new Retrait(listeOperation.size() + 1, new Date(), mt);
        listeOperation.add(r);
        
    }

    @Override
    public void updateSolde() {
       
    }

    public CompteCourant(double decouvert, int code, double solde) {
        super(code, solde);
        this.decouvert = decouvert;
    }
    
    
}
