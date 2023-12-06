package JAVA_AV2;

public class Cliente {
	private int idCliente;
	private String nome;
	private String endereco;
	private int postalCode;
	private String pais;
	private int cpf;
	private int passaporte;
	private String email;
	private String dtNascimento;
	
	public Cliente(int idCliente, String nome, String endereco, int postalCode, String pais, int cpf, int passaporte, String email, String dtNascimento){
		this.idCliente = idCliente;
		this.nome = nome;
		this.endereco = endereco;
		this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dtNascimento = dtNascimento;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getPassaporte() {
		return passaporte;
	}

	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}
