package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.produto.Produto;

public class TesteProduto {
	public static void main(String[] args) {

		Produto p1 = new Produto(null, "Arroz", 23.00);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		// parte III
		// Produto p = new Produto(2, null, null); // não consegue remover pq a entidade
		// não está monitorada!
		// Pessoa p = em.find(Produto.class, 2); // não excluiu ainda: falta uma
		// transação...

		// em.getTransaction().begin();
		// em.remove(p);
		// em.getTransaction().commit();

		// parte II
		// Produto p = em.find(Pessoa.class, 2);
		// System.out.println(p);

		/*
		 * //parte I em.getTransaction().begin(); // há a necessidade de se fazer uma
		 * transação ao inserir algo no bd em.persist(p1); em.getTransaction().commit();
		 */

		System.out.println("pronto!");
		em.close(); // fechando...
		emf.close();

	}

}
