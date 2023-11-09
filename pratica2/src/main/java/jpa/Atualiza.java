package jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Atualiza {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Id do produto: ");
	    Integer id = scanner.nextInt();
		
		em.getTransaction().begin();
		
		Veiculo x = em.find(Veiculo.class, id);
		
		if(x != null) {
			System.out.println("Novo Fabricante: ");
			scanner.nextLine();
			String novoFabri = scanner.nextLine();
			
			System.out.println("Nova Descrição: ");
			String novoDisc = scanner.nextLine();
			
			System.out.println("Nova Versão: ");
			String novoVer = scanner.nextLine();
			
			System.out.println("Novo Modelo: ");
			String novoModelSTR = scanner.nextLine();
			
			System.out.println("Novo Ano: ");
			String novoAno = scanner.nextLine();
			
			System.out.println("Nova Quantidade: ");
			String NovoQtde = scanner.nextLine();
			
			try {
				int novaCategoria = Integer.parseInt(novaCategoriaStr);
				x.setNome(novoNome);
				x.setCategoria(novaCategoria);
				
				em.merge(x);
				
				em.getTransaction().commit();
				System.out.println("Atualizado com sucesso.");
			} catch(NumberFormatException e) {
				System.out.println("Categoria inválida");
			}
		} else {
			System.out.println("Produto não encontrado.");
		}
		
		em.close();
		
		
	}
}
