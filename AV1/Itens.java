package av1;

public class Itens {
    private int idProduto;
    private int quantidade;

public Itens(int idProduto, int quantidade) {
    super();
    this.idProduto = idProduto;
    this.quantidade = quantidade;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
}
