package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidades.Veiculo;


public class Problema {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emFactory.createEntityManager();
		List<Veiculo> listaVeiculos = em.createQuery("FROM Veiculo", Veiculo.class).getResultList();
	}

}
