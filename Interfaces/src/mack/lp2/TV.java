/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.lp2;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author p017416
 */
public abstract class TV implements Controlavel{
    protected List<operacao> operacoesPermitida;
    public TV(){
        this.operacoesPermitida = new ArrayList<operacao>();
        this.operacoesPermitida.add(new operacao(1,"Trocar Resolucao de tela"));
        this.operacoesPermitida.add(new operacao(2,"Acionar Funcao Smart"));
        this.operacoesPermitida.add(new operacao(3,"Acionar Funcao Futebol"));
        this.operacoesPermitida.add(new operacao(4,"Re-channel"));
    }
    
    protected boolean verificaOperacao(operacao oper){
        for (operacao operacao : operacoesPermitida) {
            if(operacao.equals(oper))
                return true;
        }
        return false;
    }

}
