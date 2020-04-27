package br.com.fiap.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Agendamento;

public class AgendamentoDAO extends GenericDAO<Agendamento,Integer> {

	public AgendamentoDAO(EntityManager em) {
		super(em);
	}
	
	public int atualizarDataPrevista(Calendar origem, Calendar nova) {
		em.getTransaction().begin();
		int total = em.createQuery("update Agendamento a set a.dataConsultaMedica = :nova "
				+ "where a.dataConsultaMedica = :origem")
		   .setParameter("nova", nova).setParameter("origem", origem)
		   .executeUpdate();
		em.getTransaction().commit();
		return total;
		
	}
	
	public List<Agendamento> buscarPorData(Calendar data){
		return em.createQuery("from Agendamento a where a.dataAgendamento= :d",Agendamento.class)
				.setParameter("d", data).getResultList();
	}

}
