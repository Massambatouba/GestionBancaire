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
public class Retrait extends Operation{
    
    public Retrait(int numOperation, Date dateOperation, double montant) {
        super(numOperation, dateOperation, montant);
    }
    
}
