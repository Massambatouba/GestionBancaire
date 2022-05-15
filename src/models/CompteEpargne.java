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
public class CompteEpargne extends Compte {
    private double taux;
    public CompteEpargne(int code, double solde) {
        super(code, solde);
    }
    
     
    public CompteEpargne(double taux, int code, double solde) {
        super(code, solde);
        this.taux = taux;
    }
    

    @Override
    public void retirer(double mt) {
        if(mt > solde) throw new RuntimeException("solde insuffisant");
        Retrait r = new Retrait(listeOperation.size() + 1, new Date(), mt);
        listeOperation.add(r);
        
        solde  = solde - mt;
        
    }
   


    @Override
    public void updateSolde() {
        solde = solde + (solde*taux/100);
        
    }

    
}
