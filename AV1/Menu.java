package av1;

import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
  private int opcao = 0;
  ArrayList<Produto> produtos = new ArrayList<Produto>();
  Carrinho carrinho = new Carrinho(0, null, 0);

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
    
    ListarProdutos();


      do {
        System.out.println("\nDigite a opção:");
        System.out.println("1- Incluir Produto ");
        System.out.println("2- Listar Carrinho ");
        System.out.println("3- Finalizar Compra ");

        opcao = sc.nextInt();
        System.out.println("opção é: " + opcao);

        switch(opcao)
        {
        case 1:
          IncluirProduto();
          break;
        case 2:
          ListarCarrinho();
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
    int id =-1;
    int quantidade;
    boolean resp = false;

    Scanner sc = new Scanner(System.in);

    while(!resp){
        System.out.println("Digite o Id do produto que deseja adicionar: ");
        id = sc.nextInt();
        resp = VerificarProduto(id);
    }
    System.out.println("o Id do produto digitado é: " + id);

    System.out.println("Digite a quantidade: ");
    quantidade = sc.nextInt();
    System.out.println("A quantidade digitada é: " + quantidade);
    
    BucarProdutoCarrinho(id,quantidade);
    
    return true;
  }
  
  public boolean BucarProdutoCarrinho(int id, int quantidade){
	  
	  for (int i = 0; i < carrinho.itens.size(); i++) {
	      if (carrinho.itens.get(i).getIdProduto() == id) {
	    	  int quantidadeTotal = quantidade + carrinho.itens.get(i).getQuantidade();
	    	  carrinho.itens.get(i).setQuantidade(quantidadeTotal);
	        System.out.println("Produto Adicionado ao Carrinho.\n");
	        return true;
	      }
	    }
	    
	    Itens item = new Itens(id, quantidade);
	    carrinho.adicionarItem(item);
	    
	    System.out.println("Produto Adicionado ao Carrinho.\n");
	    return true;
	  }
  
  public boolean VerificarProduto(int id){

    for (int i = 0; i < produtos.size(); i++) {
      if (produtos.get(i).getIdProduto() == id) {
        System.out.println("Poduto encontrado com sucesso.\n");
        return true;

      }
    }
    System.out.println("Produto não encontrado");
    return false;
  }
  public void ListarProdutos() {

    for (int i = 0; i < produtos.size(); i++) {
      System.out.print("\nProduto:");
      System.out.println(produtos.get(i).getIdProduto());
      System.out.print("Nome:");
      System.out.println(produtos.get(i).getNome());
      System.out.print("Valor:");
      System.out.println(produtos.get(i).getValor());
    }
  }
  
  public void ListarCarrinho() {
	  
	  if(carrinho.itens.size() !=0 ) {

	      System.out.print("\nNúmero do Carrinho:");
	      System.out.println(carrinho.getIdCarrinho());

	      for (int i = 0; i < carrinho.itens.size(); i++) {
	      System.out.print("\nNúmero Produto:");
	      System.out.print(carrinho.itens.get(i).getIdProduto());
	      System.out.print("\nQuantidade do Produto:");
	      System.out.println(carrinho.itens.get(i).getQuantidade());
	    }
	      System.out.print("\n");
	  }
	  else {
		  System.out.println("\nCarrinho Vazio!!\n");
	  }
  }

  public void FinalizarCompra(){
	  double total = 0;
       for (int i = 0; i < produtos.size(); i++){

           for (int j = 0; j < carrinho.itens.size(); j++){

               if(produtos.get(i).getIdProduto() == carrinho.itens.get(j).getIdProduto()){
                   total += (produtos.get(i).getValor()*carrinho.itens.get(j).getQuantidade());
               }
           }
       }
       carrinho.setTotal(total);
       
       System.out.print("\nSUBTOTAL:");
       System.out.println(carrinho.getTotal());
       
  }
}
