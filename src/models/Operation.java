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
public class Operation {
    private int numOperation;
    private Date dateOperation;
    private double montant;

    public Operation(int numOperation, Date dateOperation, double montant) {
        this.numOperation = numOperation;
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public int getNumOperation() {
        return numOperation;
    }

    public void setNumOperation(int numOperation) {
        this.numOperation = numOperation;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    
    
}
