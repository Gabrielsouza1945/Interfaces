
package mack.lp2;

/**
 *
 * @author p017416
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TV TV = new TVLG();
        Automovel x = new Ferrari();
        ControleRemoto controle = new ControleRemotoTV();
        controle.adicionarEquipamento(TV);
        controle.executarOperacao(1);
        controle = new ControleRemotoCarro();
        controle.adicionarEquipamento(x);
        controle.executarOperacao(3);
        controle.executarOperacao(6);
       
       
       
        
    }
    
}
