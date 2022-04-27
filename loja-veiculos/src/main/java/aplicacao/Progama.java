package aplicacao;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Veiculo;

//import dominio.Veiculo;

public class Progama {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculo");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.setFabricante("Honda");
		veiculo1.setModelo("Civic");
		veiculo1.setAnoFabricacao(2020);
		veiculo1.setAnoModelo(2020);
		veiculo1.setValor(new BigDecimal(90500));
		
		em.persist(veiculo1);
		em.getTransaction().commit();
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}
}
