import java.util.*;

public class principal {
	static ArrayList<String> jogos = new ArrayList();
	static Scanner scanner = new Scanner(System.in);
	static String valor = digita();
	static int indice;
	public static void main(String[] args) {
		String menu = "\n";
		menu += "\nMenu da lista de jogos";
		menu += "\n==========================";
		menu += "\n1- Cadastra Jogo(Primeira/última/Especifica posição)";
		menu += "\n2- Altera/Ver lista/Remove jogo(Primeira/última/Especifica posição)";
		menu += "\n- Escolha: ";
		char op;
		while(true) {
			System.out.println(menu);
			switch(digita().charAt(0)) {
			case '1': cadastrajogos();
			break;
			case '2': removejogos();
			break;
			}
		}

	}
	
	private static void removejogos() {
		System.out.println("1- Remove na primeira"
				+ "/n2- Remove na última"
				+ "/n3- Lista"
				+ "/n4- Altera/Remove em espeficica");
		switch(digita().charAt(0)) {
		case'1': jogos.remove(0);
		break;
		case'2': indice =  jogos.size()-1;
				 jogos.remove(indice);
		break;
		
		case'3': System.out.println(Arrays.toString(jogos.toArray()));
		break;
		
		case'4': System.out.println("Forneça o indice que deseja alterar/remove");
				indice = scanner.nextInt();
				System.out.println("Deseja alterar(1) ou remover(2)");
				int escolha = scanner.nextInt();
				if(escolha == 1) {
					System.out.println(" "+jogos.get(indice)+" Alterar para:");
					String element;
					jogos.set(indice, element = scanner.nextLine());
				}
				else
				{
					if( escolha == 2){
						jogos.remove(indice);
						System.out.println("Remoção feita com sucesso!");
					}
				}
				
		break;
		}
		
	}

	private static void cadastrajogos() {
		System.out.println("1- Cadasta na primeira"
				+ "/n2- Cadastra na última"
				+ "/n3- Cadastra em espeficica");
		switch(digita().charAt(0)) {
		case'1': System.out.println("Forneça o nome");
				insereInicio(valor);
		break;
		case'2': System.out.println("Forneça o nome");
				inserefinal(valor);
		break;
		case'3': System.out.println("Forneça o o indice e o nome");
			insere(indice = scanner.nextInt(), valor);
		break;
		}
		
	}

	private static void insere(int indice, String valor) {
		if(indice > 0 && indice < jogos.size() )  {
		jogos.add(indice, valor);
		}
		else {
			System.out.println(jogos.get(indice));
		}
	}

	private static void inserefinal(String valor) {
		jogos.add(valor);
		
	}

	private static void insereInicio(String valor) {
		jogos.add(0, valor);
		
	}

	private static String digita() {
		
		return scanner.next();
	}		
}	