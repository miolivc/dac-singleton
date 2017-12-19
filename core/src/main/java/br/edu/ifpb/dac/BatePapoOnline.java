/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac;

import br.edu.ifpb.shared.BatePapo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author ifpb
 */

@Singleton
@Startup
@Remote(BatePapo.class)
public class BatePapoOnline implements BatePapo {

    private List<String> mensagens = new ArrayList<>();
    
    @Override
    public void novaMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    @Override
    public void removeMensagem(String mensagem) {
        mensagens.add(mensagem);
    }

    @Lock(LockType.READ)
    @Override
    public List<String> historico() {
        return Collections.unmodifiableList(mensagens);
    }
    
}
