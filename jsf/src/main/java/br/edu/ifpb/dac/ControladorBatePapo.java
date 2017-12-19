/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac;

import br.edu.ifpb.shared.BatePapo;
import br.edu.ifpb.shared.ServiceLocator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ifpb
 */
@RequestScoped
@Named
public class ControladorBatePapo {
    
    private BatePapo batePapo;
    private String message;
    
    @PostConstruct
    public void init() {
        batePapo = (BatePapo) new ServiceLocator()
                .lookup("java:global/core/BatePapoOnline");
    }
    
    public String addMessage() {
        batePapo.novaMensagem(message);
        return null;
    }
    
    public List<String> historico() {
        return batePapo.historico();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
