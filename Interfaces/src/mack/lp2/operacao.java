package mack.lp2;
public class operacao {
	private int id;
	private String descricao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public operacao(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	@Override
	public boolean equals(Object obj) {
		operacao other = (operacao) obj;
		if(this.id!=other.id) {
			return false;
		}else {return true;}
	}
}
