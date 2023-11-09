package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo(null,"Ford","Fiesta","1.0","Hatch","2022",5);
		Veiculo v2 = new Veiculo(null,"Chevrolet","Fiesta","2.0","Hatch","2022",5);
		Veiculo v3 = new Veiculo(null,"VW","Fiesta","1.0","Hatch","2022",5);
		Veiculo v4 = new Veiculo(null,"Fiat","Fiesta","1.0","Hatch","2022",5);
		Veiculo v5 = new Veiculo(null,"Renan","Fiesta","1.0","Hatch","2022",5);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(v1);
		em.persist(v2);
		em.persist(v3);
		em.persist(v4);
		em.persist(v5);
		
		em.getTransaction().commit();
		
		em.close();

		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}
}
