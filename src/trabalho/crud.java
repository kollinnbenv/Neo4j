package trabalho;

import javax.swing.JOptionPane;

import org.neo4j.driver.v1.*;

public class crud {
	public static void main(String[] args) {

		// conecao banco
		Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "123vai"));

		int opcao;

		// switch case crud
		do {
			String b = JOptionPane.showInputDialog("O que você deseja fazer?" + "\n1 - Create" + "\n2 - Read"
					+ "\n3 - Update" + "\n4 - Delete" + "\n5 - LISTAR TODOS" + "\n" + "\n6 - Sair");
			opcao = Integer.parseInt(b);

			switch (opcao) {
			
			//create
			case 1:
				String nome = JOptionPane.showInputDialog("Qual Pessoa você deseja criar?");
				String nacionalidade = JOptionPane.showInputDialog("Qual nacionalidade?");
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual idade?"));

				String cypher = "CREATE (ee:Pessoa { nome: \"" + nome + "\", nacionalidade: \"" + nacionalidade
						+ "\", idade: " + idade + " });";
				System.out.println("CYPHER: " + cypher);
				System.out.println("");
				try (Session session = driver.session()) {
					session.run(cypher);
				}
				break;

			//read
			case 2: 
				String resposta2 = JOptionPane.showInputDialog("Qual o nome que deseja consultar?");
				try (Session session = driver.session()) {
					String cypher2 = "MATCH (ee:Pessoa) WHERE ee.nome = \"" + resposta2
							+ "\" RETURN ee.nome, ee.nacionalidade, ee.idade;";

					System.out.println("CYPHER: " + cypher2);
					StatementResult s = session.run(cypher2);
					Record nodo = s.next();
					
					String nomeNodo = String.valueOf(nodo.get("ee.nome"));
					String nacionalidadeNodo = String.valueOf(nodo.get("ee.nacionalidade"));
					String idadeNodo = String.valueOf(nodo.get("ee.idade")); 
					
					System.out.println("Nome: " + nomeNodo + "  |  Nacionalidade: " + nacionalidadeNodo + "  |  Idade: "
							+ idadeNodo); 

					System.out.println("");

				}
				break;
				
			//update
			case 3: 
				String resposta3 = JOptionPane.showInputDialog("Qual pessoa atualizar?");
				int opcao2 = Integer.parseInt(
						JOptionPane.showInputDialog("O que gostaria de atualizar? \n1 - Nacionalidade \n2 - Idade"));
				
				//switch case atualizar informação 
				switch (opcao2) { 
				case 1: 
					String novaNacionalidade = JOptionPane.showInputDialog("Informe a nova nacionalidade");
					
					try (Session session = driver.session()) { 
						String cypher3 = "MATCH (n { nome: '" + resposta3 + "' }) SET n.nacionalidade = '"
								+ novaNacionalidade + "'"; 
						System.out.println("CYPHER: " + cypher3); 
						System.out.println("");
						session.run(cypher3);
					}
					break;
					
				case 2: 
					String novaIdade = JOptionPane.showInputDialog("Informe a nova idade");
					try (Session session = driver.session()) {
						String cypher4 = "MATCH (n { nome: '" + resposta3 + "' }) SET n.idade = '" + novaIdade + "'"; 
						
						System.out.println("CYPHER: " + cypher4); 
						System.out.println("");
						session.run(cypher4); 
					}
					break;
				}
				break;

			//delete
			case 4: 
				String resposta4 = JOptionPane.showInputDialog("Qual pessoa deletar?");
				try (Session session = driver.session()) { 
					String cypher5 = "MATCH (ee:Pessoa) WHERE ee.nome = \"" + resposta4 + "\" DELETE ee;";
					System.out.println("CYPHER: " + cypher5); 
					System.out.println("");
					session.run(cypher5);
				}
				break;

			//listar todos 
			case 5: 
				int contador = 0;
				try (Session session = driver.session()) { 

					String cypher2 = "MATCH (ee:Pessoa) RETURN ee.nome, ee.nacionalidade, ee.idade;";
					System.out.println("CYPHER: " + cypher2); 
					System.out.println("====================================================================");
					StatementResult s = session.run(cypher2); 
					while (s.hasNext()) {
						contador++;
						Record nodo = s.next();
						String nomeNodo = String.valueOf(nodo.get("ee.nome")); 
						String nacionalidadeNodo = String.valueOf(nodo.get("ee.nacionalidade")); 
						String idadeNodo = String.valueOf(nodo.get("ee.idade")); 
						System.out.println("Nome: " + nomeNodo + "  |  Nacionalidade: " + nacionalidadeNodo
								+ "  |  Idade: " + idadeNodo); 
					}
				}
				System.out.println("====================================================================");
				System.out.println("Total de registros: " + contador); 
				break;

			default:
				break;
			}
		} while (opcao != 6);
		driver.close();
	}
}