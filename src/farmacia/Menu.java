package farmacia;

import java.util.InputMismatchException;
import java.util.Scanner;

import farmacia.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao = -1;
		
		while (true) {
			System.out.print(Cores.ANSI_WHITE_BACKGROUND + Cores.TEXT_BLUE_BRIGHT);
			System.out.println("╔═════════◇─◇──◇─◇═════════╗");
			System.out.println("                                                     ");
			System.out.println("                 💊 MENU PRINCIPAL                   ");
			System.out.println("                                                     ");
			System.out.println("╚═════════◇─◇──◇─◇═════════╝");
			System.out.println("                                                    ");
			System.out.println("           1 - Cadastrar um produto                 ");
			System.out.println("           2 - Visualizar todos os produto          ");
			System.out.println("           3 - Buscar produtos por ID               ");
			System.out.println("           4 - Atualizar produto                    ");
			System.out.println("           5 - Deletar produto                      ");
			System.out.println("           6 - Sair                                 ");
			System.out.println("                                                    ");
			System.out.println(" ═══════════════════════════════════════════════════ ");
			System.out.println("─◇             Escolha a opção desejada:           ◇─");
			System.out.println(" ╚══════════════════════════════════════════════════╝");

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
				System.out.println("\n Cadastrar um produto");
			
				break;

			case 2:
				System.out.println("\nVisualizar todos os produtos");
				break;

			case 3:
				System.out.println("\nBuscar produtos por ID");
				break;

			case 4:
				System.out.println("\nAtualizar produto");
				break;

			case 5:
				System.out.println("\nDeletar produto");
				break;

			case 0:
				System.out.println("\nSair do sistema. Até logo!");
				leia.close();
				System.exit(0);
				break;

			default:
				System.out.println("\nOpção inválida. Tente novamente.");
				break;
			}
			
		}

	}

}


