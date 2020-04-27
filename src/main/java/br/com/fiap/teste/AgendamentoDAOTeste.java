package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.AgendamentoDAO;

public class AgendamentoDAOTeste {

	public static void main(String[] args) {

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("especialidademedica-orm");
		EntityManager em = fabrica.createEntityManager();

		AgendamentoDAO dao = new AgendamentoDAO(em);

		Calendar origem = new GregorianCalendar(2017,Calendar.MARCH,24);
		Calendar nova = new GregorianCalendar(2018,Calendar.MARCH,24);
		int total = dao.atualizarDataPrevista(origem, nova);
		System.out.println("Total "+ total);

		em.close();
		fabrica.close();
	}

}
