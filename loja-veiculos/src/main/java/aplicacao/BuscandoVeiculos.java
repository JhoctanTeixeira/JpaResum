package aplicacao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import dominio.Veiculo;

public class BuscandoVeiculos {
public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja-veiculo");
		EntityManager em = emf.createEntityManager();
		
		Veiculo veiculo = em.find(Veiculo.class, 1L);
		System.out.println("Veiculo de código" + veiculo.getCodigo() + " é um " + veiculo.getModelo());
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		
	}
}
