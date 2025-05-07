package farmacia;

import java.util.InputMismatchException;
import java.util.Scanner;

import farmacia.controller.farmaciacontroller;
import farmacia.model.Cosmeticos;
import farmacia.model.Medicamentos;
import farmacia.model.Produto;
import farmacia.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		farmaciacontroller controller = new farmaciacontroller();
		int opcao = -1;

		while (true) {
			System.out.print(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLUE_BRIGHT);
			System.out.println("╔═════════◇─◇──◇─◇═════════╗");
			System.out.println("                                                     ");
			System.out.println("                💊 PHARMA VIDA 💊                    ");
			System.out.println("                                                     ");
			System.out.println("╚═════════◇─◇──◇─◇═════════╝");
			System.out.println(" ║                                                 ║  ");
			System.out.println(" ║          1 - Cadastrar um produto               ║  ");
			System.out.println(" ║          2 - Visualizar todos os produtos       ║  ");
			System.out.println(" ║          3 - Buscar produtos por ID             ║  ");
			System.out.println(" ║          4 - Atualizar produto                  ║  ");
			System.out.println(" ║          5 - Deletar produto                    ║  ");
			System.out.println(" ║          0 - Sair                               ║  ");
			System.out.println(" ║                                                 ║  ");
			System.out.println(" ╚═════════════════════════════════════════════════╝");
			System.out.println("─◇             Escolha a opção desejada:           ◇─");
			System.out.println(" ╚═════════════════════════════════════════════════╝");
			try {
				opcao = leia.nextInt();
				leia.nextLine(); // consome a quebra de linha
			} catch (InputMismatchException e) {
				System.out.println(Cores.TEXT_RED + "\n⚠️ Entrada inválida! Digite apenas números." + Cores.TEXT_RESET);
				leia.nextLine(); // limpa o buffer
				continue; // volta ao início do while
			}

			switch (opcao) {
			case 1:
				System.out.print("\nInforme o nome do produto: ");
				String nome = leia.nextLine();

				System.out.print("Informe o tipo (1 - Medicamento | 2 - Cosmético): ");
				int tipo = leia.nextInt();
				leia.nextLine(); // limpar buffer

				System.out.print("Informe o preço do produto: ");
				float preco = leia.nextFloat();
				leia.nextLine();

				int id = controller.gerarNumero();

				if (tipo == 1) {
					System.out.print("O medicamento cadastrado é genérico? (Sim/Não): ");
					String generico = leia.nextLine();
					controller.criarProduto(new Medicamentos(id, nome, tipo, preco, generico));
				} else if (tipo == 2) {
					System.out.print("Digite a fragrância do cosmético: ");
					String fragrancia = leia.nextLine();
					controller.criarProduto(new Cosmeticos(id, nome, tipo, preco, fragrancia));
				} else {
					System.out.println("⚠️ Tipo inválido. Produto não cadastrado.");
				}
				break;

			case 2:
				controller.listarTodosProdutos();
				break;

			case 3:
				System.out.print("Digite o ID do produto: ");
				int idConsulta = leia.nextInt();
				leia.nextLine();
				controller.consultarProdutoPorId(idConsulta);
				break;

			case 4:
				System.out.print("Digite o ID do produto que deseja atualizar: ");
				int idAtualizar = leia.nextInt();
				leia.nextLine();

				Produto produtoExistente = controller.buscarNaCollection(idAtualizar);
				if (produtoExistente == null) {
					System.out.println("⚠️ Produto não encontrado!");
					break;
				}

				System.out.print("Novo nome: ");
				String novoNome = leia.nextLine();

				System.out.print("Novo preço: ");
				float novoPreco = leia.nextFloat();
				leia.nextLine();

				if (produtoExistente instanceof Medicamentos) {
					System.out.print("Novo valor para genérico: ");
					String novoGenerico = leia.nextLine();
					controller.atualizarProduto(new Medicamentos(idAtualizar, novoNome, 1, novoPreco, novoGenerico));
				} else if (produtoExistente instanceof Cosmeticos) {
					System.out.print("Nova fragrância: ");
					String novaFragrancia = leia.nextLine();
					controller.atualizarProduto(new Cosmeticos(idAtualizar, novoNome, 2, novoPreco, novaFragrancia));
				}
				break;

			case 5:
				System.out.print("Digite o ID do produto a ser deletado: ");
				int idDeletar = leia.nextInt();
				leia.nextLine();
				controller.deletarProduto(idDeletar);
				break;

			case 0:
				System.out.println("\nEncerrando a aplicação... Até logo!\n");
				sobre(); // Método sobre //
				leia.close(); // Fecha o scanner //
				System.exit(0);
				break;

			default:
				System.out.println("\nOpção inválida! Tente novamente.");
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
		System.out.println(" ░░                                                                ░░");
		System.out.println(" 	 ✦ Projeto desenvolvido por: Fernanda Murched;                  ");
		System.out.println("       ✦ Generation Brasil - fernanda_murched@outlook.com.br;        ");											
		System.out.println("       ✦ GitHub- https://github.com/FernandaMurched.                 ");
		System.out.println(" ░░                                                                ░░");		
		System.out.println(" ░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
				
	}

}