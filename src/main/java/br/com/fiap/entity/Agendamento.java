package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {
	
	public Agendamento() {
		
	}

	public Agendamento(int id, Paciente paciente, Calendar dataAgendamento, Calendar dataConsultaMedica,
			Especialidade especialidade) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.dataAgendamento = dataAgendamento;
		this.dataConsultaMedica = dataConsultaMedica;
		this.especialidade = especialidade;
	}

	@Id
	@SequenceGenerator(name = "agendamento", sequenceName = "sq_tb_agendamento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agendamento")
	@Column(name = "id_agendamento")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_agendamento")
	private Calendar dataAgendamento;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_consulta_prevista")
	private Calendar dataConsultaMedica;

	@ManyToOne
	@JoinColumn(name = "id_especialidade")
	private Especialidade especialidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Calendar dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public Calendar getDataConsultaMedica() {
		return dataConsultaMedica;
	}

	public void setDataConsultaMedica(Calendar dataConsultaMedica) {
		this.dataConsultaMedica = dataConsultaMedica;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



}
