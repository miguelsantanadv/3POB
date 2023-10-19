package av1;

public class Produto {
    private int idProduto;
    private String nome;
    private double valor;

public Produto(int idProduto,String nome,double valor) {
    super();
    this.idProduto = idProduto;
    this.valor = valor;
    this.nome = nome;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
