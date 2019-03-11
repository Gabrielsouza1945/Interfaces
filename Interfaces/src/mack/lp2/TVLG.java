/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mack.lp2;

/**
 *
 * @author p017416
 */
public class TVLG extends TV{

    public void executaComando(int comando) {
    	operacao aux = new operacao(comando, "-");
    	if(this.operacoesPermitida.contains(aux)) {
    		System.out.println("TVLG - Executando: "+comando);
    	}else System.out.println("Comando invalido");
    }
    
    public String toString(){
        return "sou uma TV LG";
    }
    
}
