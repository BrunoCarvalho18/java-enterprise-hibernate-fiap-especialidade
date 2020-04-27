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
@Table(name = "tb_consulta")
public class Consulta {
	
	public Consulta() {
		
	}
	
	public Consulta(int id, Calendar dtConsulta, Especialidade especialidade, Paciente paciente,
			Agendamento agendamento) {
		super();
		this.id = id;
		this.dtConsulta = dtConsulta;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.agendamento = agendamento;
	}
	
	@Id
	@SequenceGenerator(name = "consulta", sequenceName = "sq_tb_consulta", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consulta")
	@Column(name = "id_consulta")
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_consulta")
	private Calendar dtConsulta;

	@ManyToOne
	@JoinColumn(name = "id_especialidade")
	private Especialidade especialidade;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(Calendar dtConsulta) {
		this.dtConsulta = dtConsulta;
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

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

}
