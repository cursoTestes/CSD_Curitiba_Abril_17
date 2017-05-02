package br.com.k21;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class EnderecadorStepDef {

	@Dado("^que estou na tela do enderecador$")
	public void que_estou_na_tela_do_enderecador() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		abrirPaginaDoEnderecador();

	}

	@Quando("^informo o cep do remetente como \"([^\"]*)\"$")
	public void informo_o_cep_do_remetente_como(String cep) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		preencherCEP_Remetente(cep);
	}

	@Quando("^nome do remetente como \"([^\"]*)\"$")
	public void nome_do_remetente_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^promocao do remetente  como \"([^\"]*)\"$")
	public void promocao_do_remetente_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^numero do remetente como \"([^\"]*)\"$")
	public void numero_do_remetente_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^informo o cep do destinatario como \"([^\"]*)\"$")
	public void informo_o_cep_do_destinatario_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^nome do destinatario como \"([^\"]*)\"$")
	public void nome_do_destinatario_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^promocao do destinatario  como \"([^\"]*)\"$")
	public void promocao_do_destinatario_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^numero do destinatario como \"([^\"]*)\"$")
	public void numero_do_destinatario_como(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Quando("^clico em gerar etiqueta$")
	public void clico_em_gerar_etiqueta() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^deve aparecer o pdf da etiqueta$")
	public void deve_aparecer_o_pdf_da_etiqueta() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
