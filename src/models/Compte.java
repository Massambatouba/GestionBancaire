/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author samnd
 */
public abstract class Compte {
    protected int code;
    protected double solde;
    protected List<Operation> listeOperation = new ArrayList<>();

    public Compte(int code, double solde) {
        this.code = code;
        this.solde = solde;
    }
    public void verser(double mt){
       Versement v =new Versement(listeOperation.size()+1, new Date(), mt);
       listeOperation.add(v);
       solde = solde + mt;
       
       
    }
    public abstract void retirer (double mt);
    
    public void virement(double mt, Compte cp2){
        retirer(mt);
        cp2.verser(mt);
 
    }
    public double consulterSolde(){
        return solde;
    }
    public abstract void updateSolde();
    
    public List<Operation> getOperations(){
      return listeOperation;
     }
    public double totalVersement(){
        double somme = 0;
        for (Operation operation : listeOperation) {
            if(operation instanceof Versement)
            somme = somme + operation.getMontant();
           
        }
        return somme;
    }
    public double totalRetrait(){
        double somme =0;
        
        for (Operation operation : listeOperation) {
            if(operation instanceof Retrait)
                
            somme = somme + operation.getMontant();
            
        }
        return somme;
    }
}
