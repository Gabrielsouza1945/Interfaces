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
public abstract class ControleRemoto {
    protected Controlavel equipamento;
    
    public abstract void executarOperacao(int op);
    public void adicionarEquipamento(Controlavel equipamento){
        this.equipamento = equipamento;
    }
}