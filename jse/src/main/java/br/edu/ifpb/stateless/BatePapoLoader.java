/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.stateless;

import br.edu.ifpb.shared.BatePapo;
import br.edu.ifpb.shared.ServiceLocator;

/**
 *
 * @author ifpb
 */
public class BatePapoLoader {
    
    public static void main(String[] args) {
        
        BatePapo batePapo = (BatePapo) new ServiceLocator()
                .lookup("java:global/core/BatePapoOnline");
        
        batePapo.historico();
        
    }
    
}
