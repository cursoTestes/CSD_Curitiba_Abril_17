package br.com.k21;

import org.fluentlenium.adapter.FluentTest;
import org.junit.BeforeClass;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroInsumoStepDefinition extends FluentTest{
	
	@Before
	public void setUp(){
		abrirSiengeEFazerLogin("k21cfc", "12345");
		continuarMesmoJaEstandoLogado();
	}

	@Dado("^que logado na tela de cadastro de insumo$")
	public void que_logado_na_tela_de_cadastro_de_insumo() throws Throwable {
	    
		throw new PendingException();
	}

	@Quando("^informo descricao \"([^\"]*)\"$")
	public void informo_descricao(String descricao) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^unidade de medida \"([^\"]*)\"$")
	public void unidade_de_medida(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^grupo insumo do tipo Material de Consumo \"([^\"]*)\" \\(Aglomerantes\\)$")
	public void grupo_insumo_do_tipo_Material_de_Consumo_Aglomerantes(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Quando("^salvo$")
	public void salvo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Entao("^cadastro com sucesso$")
	public void cadastro_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	private void continuarMesmoJaEstandoLogado() {
		click("#botaoEsqueciMinhaSenha > a:nth-child(1)");
	}
	
	private void abrirSiengeEFazerLogin(String usuario, String senha) {
		goTo("https://suportesie.sienge.com.br/sienge/");
		fill("#j_username").with(usuario);
		fill("#j_password").with(senha);
		submit("input[type=\"submit\"]");
	}

}
