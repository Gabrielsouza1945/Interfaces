package mack.lp2;
public class Ferrari extends Automovel{
    
    public void executaComando(int comando) {
    	operacao aux = new operacao(comando, "-");
    	if(this.operacoesPermitida.contains(aux)) {
    		System.out.println("Ferrari - Executando: "+comando);
    	}else System.out.println("Comando invalido");
    }
    
    public String toString(){
        return "sou uma Ferrarizinha";
    }
    
}
