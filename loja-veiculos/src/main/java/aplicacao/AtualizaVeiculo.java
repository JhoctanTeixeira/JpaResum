package aplicacao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Veiculo;

public class AtualizaVeiculo {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculo");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Veiculo veiculo = em.find(Veiculo.class, 1L);
//		em.remove(veiculo);
		
		System.out.println("Valor atual : " + veiculo.getValor());
		veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
		System.out.println("Novo valor: " + veiculo.getValor());
		
		System.out.println("Pronto ......... !");
		em.close();
		emf.close();
	}

}
