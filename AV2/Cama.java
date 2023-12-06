package JAVA_AV2;

public class Cama {
	private int idCama;
	private String codCama;
	private Boolean ehBeliche;
	private String posicao;
	private String descricao;
	
	public Cama(int idCama, String codCama, Boolean ehBeliche, String posicao, String descricao){
		this.idCama= idCama;
		this.codCama = codCama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}
	
	public int getIdCama() {
		return idCama;
	}
	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}
	public String getCodCama() {
		return codCama;
	}
	public void setCodCama(String codCama) {
		this.codCama = codCama;
	}
	public Boolean getEhBeliche() {
		return ehBeliche;
	}
	public void setEhBeliche(Boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
