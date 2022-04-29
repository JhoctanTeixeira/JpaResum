package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Veiculo;

public class RemoveVeiculo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculo");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		Veiculo veiculo = em.find(Veiculo.class, 1L);
		em.remove(veiculo);
		
		em.getTransaction().commit();

		System.out.println("Pronto ......... !");
		em.close();
		emf.close();
	}
}
