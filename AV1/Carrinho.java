package av1;

import java.util.ArrayList;

public class Carrinho {
    private int idCarrinho;
    private ArrayList<Itens> itens;

    public Carrinho(int idCarrinho, ArrayList<Itens> itens) {
        super();
        this.idCarrinho = idCarrinho;
        this.itens =  new ArrayList();
    }

    public int getIdCarrinho() {
        return idCarrinho;
      }
    
      public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
      }
}
