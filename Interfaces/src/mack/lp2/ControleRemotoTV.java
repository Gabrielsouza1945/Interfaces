
package mack.lp2;

/**
 *
 * @author p017416
 */
public class ControleRemotoTV extends ControleRemoto{

    public ControleRemotoTV() {
    }
    

    public void executarOperacao(int o) {
        System.out.println("Executando a operação: "+o+" Em um equipamento: "+this.equipamento);
        if(this.equipamento instanceof TVLG){
            TV x = new TVLG();
            x.executaComando(o);
        }else if(this.equipamento instanceof TVPhilips){
            TV x = new TVPhilips();
            x.executaComando(o);
        }
    }
}
