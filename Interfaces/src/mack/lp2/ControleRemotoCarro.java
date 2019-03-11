package mack.lp2;
public class ControleRemotoCarro extends ControleRemoto{
    
    public ControleRemotoCarro() {
    }
    
    

    public void executarOperacao(int o) {
        System.out.println("Executando a operação: "+o+" Em um equipamento: "+this.equipamento);
        if(this.equipamento instanceof Fusca){
            Automovel x = new Fusca();
            x.executaComando(o);
        }else if(this.equipamento instanceof Ferrari){
            Automovel x = new Ferrari();
            x.executaComando(o);
        }
    }
}



