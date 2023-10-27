package av1;

import java.util.ArrayList;

public class Carrinho {
    private int idCarrinho;
    ArrayList<Itens> itens;
    private double total;

    public Carrinho(int idCarrinho, ArrayList<Itens> itens, double total) {
        super();
        this.idCarrinho = idCarrinho;
        this.itens =  new ArrayList<Itens>();
        this.total = total;
    }

    public int getIdCarrinho() {
        return idCarrinho;
      }
    
      public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
      }
      
      public ArrayList<Itens> getItens() {
          return itens;
      }

      public void adicionarItem(Itens item) {
          itens.add(item);
      }
      
      public double getTotal() {
          return total;
        }
      
        public void setTotal(double total) {
          this.total = total;
        }
}
