package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

	public Paciente() {

	}

	public Paciente(int id, String nomePaciente, String dsEmailPaciente, Calendar dtNascPaciente,
			char dtGeneroPaciente) {
		super();
		this.id = id;
		this.nomePaciente = nomePaciente;
		this.dsEmailPaciente = dsEmailPaciente;
		this.dtNascPaciente = dtNascPaciente;
		this.dtGeneroPaciente = dtGeneroPaciente;
	}

	@Id
	@SequenceGenerator(name = "paciente", sequenceName = "sq_tb_paciente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente")
	@Column(name = "id_paciente")
	private int id;

	@Column(name = "nm_paciente")
	private String nomePaciente;

	@Column(name = "ds_email_paciente")
	private String dsEmailPaciente;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nasc_paciente")
	private Calendar dtNascPaciente;

	@Column(name = "dt_genero_paciente")
	private char dtGeneroPaciente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getDsEmailPaciente() {
		return dsEmailPaciente;
	}

	public void setDsEmailPaciente(String dsEmailPaciente) {
		this.dsEmailPaciente = dsEmailPaciente;
	}

	public Calendar getDtNascPaciente() {
		return dtNascPaciente;
	}

	public void setDtNascPaciente(Calendar dtNascPaciente) {
		this.dtNascPaciente = dtNascPaciente;
	}

	public char getDtGeneroPaciente() {
		return dtGeneroPaciente;
	}

	public void setDtGeneroPaciente(char dtGeneroPaciente) {
		this.dtGeneroPaciente = dtGeneroPaciente;
	}

}
