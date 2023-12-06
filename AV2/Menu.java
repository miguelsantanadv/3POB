package JAVA_AV2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private int opcao = 0;
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	ArrayList<Cama> camas = new ArrayList<Cama>();
	ArrayList<Quarto> quartos = new ArrayList<Quarto>();
	Scanner sc = new Scanner(System.in);
	
	
	public void Processamento(){
		
		
		  do {
		        System.out.println("\nDigite a opção de acordo com o que deseja:");
		        System.out.println("1- Cliente ");
		        System.out.println("2- Quarto ");
		        System.out.println("3- Reserva ");
		        System.out.println("4- Cama ");
		        System.out.println("5- Sair ");

		        opcao = sc.nextInt();

		        switch(opcao)
		        {
		        case 1:
		        	menuCliente();
		        	break;
		        case 2:
		        	menuQuarto();
		        	break;
		        case 3:
		        	menuReserva();
		        	break;
		        case 4:
		        	menuCama();
		        	break;
			    case 5:
			    	System.exit(0);
				    break;

		        default:
		          System.out.println("Opção inválida. Tente novamente!");
		        }


		      } while (opcao != 3);
	}
	
	public void menuCliente() {
		
		do {
	        System.out.println("\nDigite a opção de acordo com o que deseja:");
	        System.out.println("1- Inserir ");
	        System.out.println("2- Alterar ");
	        System.out.println("3- Excluir ");
	        System.out.println("4- Listar ");
	        System.out.println("5- Retornar ao menu principal ");

	        opcao = sc.nextInt();

	        switch(opcao)
	        {
	        case 1:
	        	inserirCliente();
	        	break;
	        case 2:
	        	alterarCliente();
	        	break;
	        case 3:
	        	excluirCliente();
	        	break;
	        case 4:
	        	listarCliente();
	        	break;
		    case 5:
		    	Processamento();
			    break;

	        default:
	          System.out.println("Opção inválida. Tente novamente!");
	        }


	      } while (opcao != 5);
	}
	
	public void inserirCliente() {
		int idCliente;
		String nome;
		String endereco;
		int postalCode;
		String pais;
		int cpf;
		int passaporte;
		String email;
		String data;
		
		System.out.println("Digite o id do cliente:");
		idCliente = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do cliente:");
		nome = sc.nextLine();
		System.out.println("Digite o endereco do cliente:");
		endereco = sc.nextLine();
		System.out.println("Digite o cep do cliente:");
		postalCode = sc.nextInt();
		System.out.println("Digite o pais do cliente:");
		pais = sc.next();
		System.out.println("Digite o cpf do cliente:");
		cpf = sc.nextInt();
		System.out.println("Digite o passaporte do cliente:");
		passaporte = sc.nextInt();
		System.out.println("Digite o email do cliente:");
		email = sc.next();
		System.out.println("Digite a data de nascimento do cliente(dd/mm/aaaa):");
		data = sc.next();
		
		Cliente cliente = new Cliente(idCliente, nome, endereco, postalCode, pais, cpf, passaporte, email, data);
		clientes.add(cliente);
		System.out.println("\nCliente inserido com sucesso.");
	}
	
	
	public void alterarCliente() {
		int idCliente;
		String nome;
		String endereco;
		int postalCode;
		String pais;
		int cpf;
		int passaporte;
		String email;
		String data;
		int resp;
		
		if(clientes.size()==0) {
			System.out.println("\nNenhum cliente cadastrado.");
		}
		else {
			System.out.println("Digite o id do cliente que deseja alterar:");
			idCliente = sc.nextInt();
			
			while(VerificarCliente(idCliente)==-1) {
				System.out.println("Digite o id do cliente novamente:");
				idCliente = sc.nextInt();
			}
			
			resp = VerificarCliente(idCliente);
			
			sc.nextLine();
			System.out.println("Digite o nome do cliente:");
			nome = sc.nextLine();
			System.out.println("Digite o endereco do cliente:");
			endereco = sc.nextLine();
			System.out.println("Digite o cep do cliente:");
			postalCode = sc.nextInt();
			System.out.println("Digite o pais do cliente:");
			pais = sc.next();
			System.out.println("Digite o cpf do cliente:");
			cpf = sc.nextInt();
			System.out.println("Digite o passaporte do cliente:");
			passaporte = sc.nextInt();
			System.out.println("Digite o email do cliente:");
			email = sc.next();
			System.out.println("Digite a data de nascimento do cliente(dd/mm/aaaa):");
			data = sc.next();
				
			clientes.get(resp).setNome(nome);
			clientes.get(resp).setEndereco(endereco);
			clientes.get(resp).setPostalCode(postalCode);
			clientes.get(resp).setPais(pais);
			clientes.get(resp).setCpf(cpf);
			clientes.get(resp).setPassaporte(passaporte);
			clientes.get(resp).setEmail(email);
			clientes.get(resp).setDtNascimento(data);
			
			System.out.println("\nCliente alterado com sucesso.");
		}
	}
	
	public void excluirCliente() {
		int idCliente;
		int resp;
		
		if(clientes.size()==0) {
			System.out.println("\nNenhum cliente cadastrado.");
		}
		else {
			System.out.println("Digite o id do cliente que deseja exluir:");
			idCliente = sc.nextInt();
			
			
			while(VerificarCliente(idCliente)==-1) {
				System.out.println("Digite o id do cliente novamente:");
				idCliente = sc.nextInt();
			}
			
			resp = VerificarCliente(idCliente);
			clientes.remove(resp);
			System.out.println("\nCliente excluido com sucesso.");
		}
	}
	
	public void listarCliente() {
		
		if(clientes.size()==0) {
			System.out.println("\nNenhum cliente cadastrado.");
		}
		else {
			for(int i=0;i < clientes.size(); i++) {
				System.out.println("\nCliente:"+ i);
				System.out.print("Id:");
			    System.out.println(clientes.get(i).getIdCliente());
			    
			    System.out.print("Nome:");
			    System.out.println(clientes.get(i).getNome());
			    
			    System.out.print("Endereco:");
			    System.out.println(clientes.get(i).getEndereco());
			    
			    System.out.print("CEP:");
			    System.out.println(clientes.get(i).getPostalCode());
			    
			    System.out.print("Pais:");
			    System.out.println(clientes.get(i).getPais());
			    
			    System.out.print("CPF:");
			    System.out.println(clientes.get(i).getCpf());
			    
			    System.out.print("Passaporte:");
			    System.out.println(clientes.get(i).getPassaporte());
			    
			    System.out.print("Email:");
			    System.out.println(clientes.get(i).getEmail());
			    
			    System.out.print("Data de nascimento:");
			    System.out.println(clientes.get(i).getDtNascimento());		    
			}
		}
	}
	
	public int VerificarCliente(int id){

	    for (int i = 0; i < clientes.size(); i++) {
	      if (clientes.get(i).getIdCliente() == id) {
	        return i;
	      }
	    }
	    System.out.println("\nCliente não encontrado");
	    return -1;
	  }
	
	public void menuQuarto() {
		
		do {
	        System.out.println("\nDigite a opção de acordo com o que deseja:");
	        System.out.println("1- Inserir ");
	        System.out.println("2- Alterar ");
	        System.out.println("3- Excluir ");
	        System.out.println("4- Listar ");
	        System.out.println("5- Retornar ao menu principal ");

	        opcao = sc.nextInt();

	        switch(opcao)
	        {
	        case 1:
	        	inserirQuarto();
	        	break;
	        case 2:
	        	alterarQuarto();
	        	break;
	        case 3:
	        	excluirQuarto();
	        	break;
	        case 4:
	        	listarQuarto();
	        	break;
		    case 5:
		    	Processamento();
			    break;

	        default:
	          System.out.println("Opção inválida. Tente novamente!");
	        }


	      } while (opcao != 5);
		
	}
	
	public void inserirQuarto() {
		int idQuarto;
		String nomeQuarto;
		int qtdeCamas;
		Boolean temBanheiro;
		String descricao;
		
		System.out.println("Digite o id do quarto:");
		idQuarto = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do quarto:");
		nomeQuarto = sc.nextLine();
		System.out.println("Digite a quantidade de camas:");
		qtdeCamas = sc.nextInt();
		System.out.println("Digite se o quarto possui banheiro(true-Sim, false-Nao):");
		temBanheiro = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Digite a descricao do quarto:");
		descricao = sc.nextLine();
		
		Quarto quarto = new Quarto(idQuarto, nomeQuarto, qtdeCamas, temBanheiro, descricao);
		quartos.add(quarto);
		System.out.println("\nQuarto inserido com sucesso.");
		
	}
	
	public void alterarQuarto() {
		int idQuarto;
		String nomeQuarto;
		int qtdeCamas;
		Boolean temBanheiro;
		String descricao;
		int resp;
		
		if(quartos.size()==0) {
			System.out.println("\nNenhum quarto cadastrado.");
		}
		else {
			System.out.println("Digite o id do quarto que deseja alterar:");
			idQuarto = sc.nextInt();
			
			while(VerificarQuarto(idQuarto)==-1) {
				System.out.println("Digite o id do Quarto novamente:");
				idQuarto = sc.nextInt();
			}
			
			resp = VerificarQuarto(idQuarto);
			
			sc.nextLine();
			System.out.println("Digite o nome do quarto:");
			nomeQuarto = sc.next();
			System.out.println("Digite a quantidade de camas:");
			qtdeCamas = sc.nextInt();
			System.out.println("Digite se o quarto possui banheiro(true-Sim, false-Nao):");
			temBanheiro = sc.nextBoolean();
			sc.nextLine();
			System.out.println("Digite a descricao do quarto:");
			descricao = sc.nextLine();
				
			quartos.get(resp).setNomeQuarto(nomeQuarto);
			quartos.get(resp).setQtdeCamas(qtdeCamas);
			quartos.get(resp).setTemBanheiro(temBanheiro);
			quartos.get(resp).setDescricao(descricao);
			
			System.out.println("\nQuarto alterado com sucesso.");
		}
		
	}
	
	public void excluirQuarto() {
		
		int idQuarto;
		int resp;
		
		if(quartos.size()==0) {
			System.out.println("\nNenhum quarto cadastrado.");
		}
		else {
			System.out.println("Digite o id do quarto que deseja excluir:");
			idQuarto = sc.nextInt();
			
			while(VerificarQuarto(idQuarto)==-1) {
				System.out.println("Digite o id do Quarto novamente:");
				idQuarto = sc.nextInt();
			}
			
			resp = VerificarQuarto(idQuarto);
			quartos.remove(resp);
			System.out.println("\nQuarto excluido com sucesso.");
		}
	}
	
	public void listarQuarto() {
		
		if(quartos.size()==0) {
			System.out.println("\nNenhum quarto cadastrado.");
		}
		else {
			for(int i=0;i < quartos.size(); i++) {
				System.out.println("\nQuarto:"+ i);
				System.out.print("Id:");
			    System.out.println(quartos.get(i).getIdQuarto());
			    
			    System.out.print("Nome:");
			    System.out.println(quartos.get(i).getNomeQuarto());
			    
			    System.out.print("Quantidade de camas:");
			    System.out.println(quartos.get(i).getQtdeCamas());
			    
			    System.out.print("Tem banheiro:");
			    System.out.println(quartos.get(i).getTemBanheiro());
			    
			    System.out.print("Descricao:");
			    System.out.println(quartos.get(i).getDescricao());    
			}
		}
	}
	
	public int VerificarQuarto(int id){

	    for (int i = 0; i < quartos.size(); i++) {
	      if (quartos.get(i).getIdQuarto() == id) {
	        return i;
	      }
	    }
	    System.out.println("\nQuarto não encontrado");
	    return -1;
	  }
	
	public void menuReserva(){
		do {
	        System.out.println("\nDigite a opção de acordo com o que deseja:");
	        System.out.println("1- Inserir ");
	        System.out.println("2- Alterar ");
	        System.out.println("3- Excluir ");
	        System.out.println("4- Listar ");
	        System.out.println("5- Retornar ao menu principal ");

	        opcao = sc.nextInt();

	        switch(opcao)
	        {
	        case 1:
	        	inserirReserva();
	        	break;
	        case 2:
	        	alterarReserva();
	        	break;
	        case 3:
	        	excluirReserva();
	        	break;
	        case 4:
	        	listarReserva();
	        	break;
		    case 5:
		    	Processamento();
			    break;

	        default:
	          System.out.println("Opção inválida. Tente novamente!");
	        }


	      } while (opcao != 5);
		
	}
	
	public void inserirReserva() {
		int idReserva;
		int idQuarto;
		int idCama;
		int idCliente;
		String dtEntrada;
		String dtSaida;
		
		System.out.println("Digite o id da reserva:");
		idReserva = sc.nextInt();
		System.out.println("Digite o id do quarto:");
		idQuarto = sc.nextInt();
		System.out.println("Digite o id da cama:");
		idCama = sc.nextInt();
		System.out.println("Digite o id do cliente:");
		idCliente = sc.nextInt();
		System.out.println("Digite a data de entrada(dd/mm/aaaa):");
		dtEntrada = sc.next();
		System.out.println("Digite a data de saida(dd/mm/aaaa):");
		dtSaida = sc.next();
		
		
		Reserva reserva = new Reserva(idReserva, idQuarto, idCama, idCliente, dtEntrada, dtSaida);
		reservas.add(reserva);
		System.out.println("\nReserva inserida com sucesso.");
	}
	
	public void alterarReserva() {
		int idReserva;
		int idQuarto;
		int idCama;
		int idCliente;
		String dtEntrada;
		String dtSaida;
		int resp;
		
		if(reservas.size()==0) {
			System.out.println("\nNenhuma reserva cadastrada.");
		}
		else {
			System.out.println("Digite o id da reserva que deseja alterar:");
			idReserva = sc.nextInt();
			
			while(VerificarReserva(idReserva)==-1) {
				System.out.println("Digite o id da reserva novamente:");
				idReserva = sc.nextInt();
			}
			
			resp = VerificarReserva(idReserva);
			
			System.out.println("Digite o id do quarto:");
			idQuarto = sc.nextInt();
			System.out.println("Digite o id da cama:");
			idCama = sc.nextInt();
			System.out.println("Digite o id do cliente:");
			idCliente = sc.nextInt();
			System.out.println("Digite a data de entrada(dd/mm/aaaa):");
			dtEntrada = sc.next();
			System.out.println("Digite a data de saida(dd/mm/aaaa):");
			dtSaida = sc.next();
			
			reservas.get(resp).setIdQuarto(idQuarto);
			reservas.get(resp).setIdCama(idCama);
			reservas.get(resp).setIdCliente(idCliente);
			reservas.get(resp).setDtEntrada(dtEntrada);
			reservas.get(resp).setDtSaida(dtSaida);
			
			System.out.println("\nReserva alterada com sucesso.");
		}
	}
	
	public void excluirReserva() {
		int idReserva;
		int resp;
		
		if(reservas.size()==0) {
			System.out.println("\nNenhuma reserva cadastrada.");
		}
		else {
			System.out.println("Digite o id da reserva que deseja alterar:");
			idReserva = sc.nextInt();
			
			while(VerificarReserva(idReserva)==-1) {
				System.out.println("Digite o id da reserva novamente:");
				idReserva = sc.nextInt();
			}
			
			resp = VerificarReserva(idReserva);
			reservas.remove(resp);
			System.out.println("\nReserva excluida com sucesso.");
		}
	}
	
	public void listarReserva() {
		
		if(reservas.size()==0) {
			System.out.println("\nNenhuma reserva cadastrada.");
		}
		else {
			for(int i=0;i < reservas.size(); i++) {
				System.out.println("\nReserva:"+ i);
				System.out.print("Id da reserva:");
			    System.out.println(reservas.get(i).getIdReserva());
		
			    System.out.print("Id do quarto:");
			    System.out.println(reservas.get(i).getIdQuarto());
			    
			    System.out.print("Id da cama:");
			    System.out.println(reservas.get(i).getIdCama());
			    
			    System.out.print("Id do cliente:");
			    System.out.println(reservas.get(i).getIdCliente());
			    
			    System.out.print("Data de entrada(dd/mm/aaaa):");
			    System.out.println(reservas.get(i).getDtEntrada());
			    
			    System.out.print("Data de saida:(dd/mm/aaaa)");
			    System.out.println(reservas.get(i).getDtSaida());
			}
		}
	}
	
	public int VerificarReserva(int id){

	    for (int i = 0; i < reservas.size(); i++) {
	      if (reservas.get(i).getIdReserva() == id) {
	        return i;
	      }
	    }
	    System.out.println("\nReserva não encontrada");
	    return -1;
	  }
	
	public void menuCama() {
		
		do {
	        System.out.println("\nDigite a opção de acordo com o que deseja:");
	        System.out.println("1- Inserir ");
	        System.out.println("2- Alterar ");
	        System.out.println("3- Excluir ");
	        System.out.println("4- Listar ");
	        System.out.println("5- Retornar ao menu principal ");

	        opcao = sc.nextInt();

	        switch(opcao)
	        {
	        case 1:
	        	inserirCama();
	        	break;
	        case 2:
	        	alterarCama();
	        	break;
	        case 3:
	        	excluirCama();
	        	break;
	        case 4:
	        	listarCama();
	        	break;
		    case 5:
		    	Processamento();
			    break;

	        default:
	          System.out.println("Opção inválida. Tente novamente!");
	        }


	      } while (opcao != 5);
	}
	
	public void inserirCama() {
		int idCama;
		String codCama;
		Boolean ehBeliche;
		String posicao;
		String descricao;
		
		System.out.println("Digite o id da cama:");
		idCama = sc.nextInt();
		System.out.println("Digite o codigo da cama:");
		codCama = sc.next();
		System.out.println("O tipo da cama eh beliche (true-Sim, false-Nao):");
		ehBeliche = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Digite a posicao da cama:");
		posicao = sc.nextLine();
		System.out.println("Digite a descricao da cama:");
		descricao = sc.nextLine();
		
		Cama cama = new Cama(idCama, codCama, ehBeliche, posicao, descricao);
		camas.add(cama);
		System.out.println("\nCama inserida com sucesso.");
	}
	
	public void alterarCama() {
		int idCama;
		String codCama;
		Boolean ehBeliche;
		String posicao;
		String descricao;
		int resp;
		
		if(camas.size()==0) {
			System.out.println("\nNenhuma cama cadastrada.");
		}
		else {
			System.out.println("Digite o id da cama que deseja alterar:");
			idCama = sc.nextInt();
			
			while(VerificarCama(idCama)==-1) {
				System.out.println("Digite o id da cama novamente:");
				idCama = sc.nextInt();
			}
			
			resp = VerificarReserva(idCama);
			
			System.out.println("Digite o codigo da cama:");
			codCama = sc.next();
			System.out.println("O tipo da cama eh beliche (true-Sim, false-Nao):");
			ehBeliche = sc.nextBoolean();
			sc.nextLine();
			System.out.println("Digite a posicao da cama:");
			posicao = sc.nextLine();
			System.out.println("Digite a descricao da cama:");
			descricao = sc.nextLine();
			
			
			
			camas.get(resp).setIdCama(idCama);
			camas.get(resp).setCodCama(codCama);
			camas.get(resp).setEhBeliche(ehBeliche);
			camas.get(resp).setPosicao(posicao);
			camas.get(resp).setDescricao(descricao);
			
			System.out.println("\nCama alterada com sucesso.");
		}
	}
	
	public void excluirCama() {
		int idCama;
		int resp;
		
		if(camas.size()==0) {
			System.out.println("\nNenhuma cama cadastrada.");
		}
		else {
			System.out.println("Digite o id da cama que deseja alterar:");
			idCama = sc.nextInt();
			
			while(VerificarCama(idCama)==-1) {
				System.out.println("Digite o id da cama novamente:");
				idCama = sc.nextInt();
			}
			
			resp = VerificarCama(idCama);
			camas.remove(resp);
			System.out.println("\nCama excluida com sucesso.");
		}
	}
	
	public void listarCama() {
		
		if(camas.size()==0) {
			System.out.println("\nNenhuma cama cadastrada.");
		}
		else {
			for(int i=0;i < camas.size(); i++) {
				System.out.println("\nCama:"+ i);
				System.out.print("Id da cama:");
			    System.out.println(camas.get(i).getIdCama());
			    
			    System.out.print("Codigo da cama:");
			    System.out.println(camas.get(i).getCodCama());
			    
			    System.out.print("Eh beliche:");
			    System.out.println(camas.get(i).getEhBeliche());
			    
			    System.out.print("Posicao da cama:");
			    System.out.println(camas.get(i).getPosicao());
			    
			    System.out.print("Descricao da cama:");
			    System.out.println(camas.get(i).getDescricao());
		
			}
		}
	}
	
	public int VerificarCama(int id){

	    for (int i = 0; i < camas.size(); i++) {
	      if (camas.get(i).getIdCama() == id) {
	        return i;
	      }
	    }
	    System.out.println("\nCama não encontrada");
	    return -1;
	  }
}
