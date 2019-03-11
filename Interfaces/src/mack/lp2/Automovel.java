package mack.lp2;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author p017416
 */
public abstract class Automovel implements Controlavel{
    protected List<operacao> operacoesPermitida;
    public Automovel(){
        this.operacoesPermitida = new ArrayList<operacao>();
        this.operacoesPermitida.add(new operacao(1,"Abrir vidro"));
        this.operacoesPermitida.add(new operacao(2,"Fechar vidro"));
        this.operacoesPermitida.add(new operacao(3,"Piloto automatico"));
        this.operacoesPermitida.add(new operacao(4,"Voar"));
    }
    
    protected boolean verificaOperacao(operacao oper){
        for (operacao operacao : operacoesPermitida) {
            if(operacao.equals(oper))
                return true;
        }
        return false;
    }
}
