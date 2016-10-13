package br.sceweb.teste;


import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;

public class UC05CadastrarConvenio {
	static Convenio convenio;
	static ConvenioDAO convenioDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenioDAO = new ConvenioDAO();
		convenio = new Convenio("81965361000174", "01/01/2016", "13/10/2016");

	}
	
	@Test
	public void CT01UC05CadastrarConvenio_com_sucesso() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Test
	public void CT02UC05A1Cadastrar_convenio_ja_cadastrado_dti() { //com a data inicial ja cadastrada, ou seja a data inicial ta dentro do convenio.
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT03UC05A2Cadastrar_convenio_dti_formato_invalido() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT04UC05A2Cadastrar_convenio_dtf_formato_invalido() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT05UC05A3Cadastrar_convenio_cnpj_invalido() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT06UC05A3Cadastrar_convenio_cnpj_nao_cadastrado() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT07UC05A1Cadastrar_convenio_ja_cadastrado_dtf() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
	@Test
	public void CT08UC05A2Cadastrar_convenio_dti_maior_dtf() {
		assertEquals(1,convenioDAO.adiciona(convenio));
	}
	
}
