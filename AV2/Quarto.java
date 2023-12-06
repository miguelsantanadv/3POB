package JAVA_AV2;

public class Quarto {
	private int idQuarto;
	private String nomeQuarto;
	private int qtdeCamas;
	private Boolean temBanheiro;
	private String descricao;
	
	public Quarto(int idQuarto, String nomeQuarto, int qtdeCamas, Boolean temBanheiro, String descricao){
		this.idQuarto = idQuarto;
		this.nomeQuarto = nomeQuarto;
		this.qtdeCamas = qtdeCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public int getQtdeCamas() {
		return qtdeCamas;
	}

	public void setQtdeCamas(int qtdeCamas) {
		this.qtdeCamas = qtdeCamas;
	}

	public Boolean getTemBanheiro() {
		return temBanheiro;
	}

	public void setTemBanheiro(Boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
