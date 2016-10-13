package br.sceweb.modelo;

import org.joda.time.DateTime;

import com.sun.istack.internal.logging.Logger;

public class Convenio {
	private String cnpj;
	private DateTime dataInicio;
	private DateTime dataTermino;
	Logger logger = Logger.getLogger(Convenio.class);
	
	public Convenio(String cnpj, String dataInicio, String dataTermino){
	setCNPJ(cnpj);
	setDataInicio(dataInicio);
	setDataTermino(dataTermino);
	}

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}

	public DateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = new DateTime();
	}

	public DateTime getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = new DateTime();
	}

	
	
	
	
	
}
