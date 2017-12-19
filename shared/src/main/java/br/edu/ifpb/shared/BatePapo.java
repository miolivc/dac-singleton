/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.shared;

import java.util.List;

/**
 *
 * @author ifpb
 */
public interface BatePapo {
    
    public void novaMensagem(String mensagem);
    public void removeMensagem(String mensagem);
    public List<String> historico();
    
}
