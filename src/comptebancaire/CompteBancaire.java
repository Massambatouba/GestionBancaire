/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comptebancaire;


import java.util.List;
import models.Compte;
import models.CompteCourant;
import models.CompteEpargne;
import models.Operation;


/**
 *
 * @author samnd
 */
public class CompteBancaire {

    public static void main(String[] args) {
        try{
      
        Compte cp1 = new CompteCourant(5000, 1, 8000);
        Compte cp2 = new CompteEpargne(5.5, 2, 30000);
        
        cp1.verser(50000);
        cp1.retirer(3000);
        cp1.virement(400, cp2);
        cp1.verser(4000);
        cp1.retirer(7000);
        
        //ArrayList<Operation> lestOperation = new ArrayList<>();
        //for (Operation operation : lestOperation) {
            
            
            
        //}
        System.out.println("***********************************");
        System.out.println("Compte cp2");
        System.out.println("Solde: " + cp1.consulterSolde() );
        System.out.println("Total des versement cp1" + " " + cp1.totalVersement());
        System.out.println("Total des retrait cp1" + " " + cp1.totalRetrait());
       
        
        
        System.out.println("***********************************");
        System.out.println("Compte cp2");
        System.out.println("Solde: " + cp2.consulterSolde() );
        System.out.println("Total des versement cp2" + " " + cp2.totalVersement());
        System.out.println("Total des retrait cp2" + " " + cp2.totalRetrait());
       
        List<Operation> listOperations = cp1.getOperations();
        for (Operation listOperation : listOperations) {
            System.out.println( listOperation.getClass().getSimpleName()+"---" +listOperation.getDateOperation()+ "--"+ listOperation.getNumOperation()+ "---" + listOperation.getMontant());
         
        }
        //cp1.retirer(800000000);
            System.out.println("Mettre à jour le sole");
            cp1.updateSolde();
            cp2.updateSolde();
            
            System.out.println("Solde du compte cp1 = "+cp1.consulterSolde());
            System.out.println("Solde du compte cp1 = "+cp2.consulterSolde());
            
       
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
 
    
}
