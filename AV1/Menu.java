package av1;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
  private int opcao = 0;
  ArrayList<Produto> produtos = new ArrayList<Produto>();

  public void Processamento() {
    Scanner sc = new Scanner(System.in);

    Produto prod1 = new Produto(1 , "Cenoura", 5.5);
    produtos.add(prod1);
    prod1= new Produto(2 , "Cebola", 2.5);
    produtos.add(prod1);
    prod1 = new Produto(3 , "Arroz", 20.5);
    produtos.add(prod1);
    prod1 = new Produto(4 , "Feijão", 10);
    produtos.add(prod1);


      do {
        System.out.println("Digite a opção:");
        System.out.println("1- Incluir Produto: ");
        System.out.println("2- Listar Produtos: ");
        System.out.println("3- Finalizar Compra ");

        opcao = sc.nextInt();
        System.out.println("opção é: " + opcao);

      	sc.close();

        switch(opcao)
        {
        case 1:
          IncluirProduto();
          break;
        case 2:
          ListarProdutos();
          break;
        case 3:
          FinalizarCompra();
          System.exit(0);
          break;

        default:
          System.out.println("Opção inválida. Tente novamente!");
        }


      } while (opcao != 3);
  }

  public Boolean IncluirProduto() {
    int id;
    int quantidade;
    boolean resp = false;

    Scanner sc = new Scanner(System.in);

    while(!resp){
        System.out.println("Digite o Id do produto que deseja adicionar: ");
        id = sc.nextInt();
        resp = BuscarProduto(id);
    }
    System.out.println("o Id do produto digitado é: " + id);

    System.out.println("Digite a quantidade: ");
    quantidade = sc.nextInt();
    System.out.println("A quantidade digitada é: " + quantidade);

    Carrinho Carinho = new Carrinho(0, null);

    sc.close();

    return true;
  }
  public boolean BuscarProduto(int id){

    for (int i = 0; i < produtos.size(); i++) {
      if (produtos.get(i).getIdProduto() == id) {
        System.out.println("Poduto encontrado com sucesso.\n");
        System.out.println(produtos.get(i).getIdProduto());
        return true;

      }
    }
    System.out.println("Produto não encontrado");
    return false;
  }
  public void ListarProdutos() {

    for (int i = 0; i < produtos.size(); i++) {
      System.out.println("\nProdutos:\n");
      System.out.println(produtos.get(i).getIdProduto());
    }
  }

  public void FinalizarCompra(){

  }
}
