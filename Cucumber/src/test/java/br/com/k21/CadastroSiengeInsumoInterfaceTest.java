package br.com.k21;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroSiengeInsumoInterfaceTest extends FluentTest {

	@Override
	public WebDriver getDefaultDriver() {
		return new ChromeDriver();
	}
	
	@Test
	public void teste_preencher_insumo_tipo2_sienge() {
		abrirSiengeEFazerLogin("k21cfc", "12345");
		
		continuarMesmoJaEstandoLogado();
		clicarNoMenuEmCriarNovoInsumo();
		
		click("#pbAdicionar");
		
	}
	
	@Test
	public void teste_preencher_insumo_tipo1_sienge() {
		abrirSiengeEFazerLogin("k21cfc", "12345");
		
		continuarMesmoJaEstandoLogado();
		
//		clicarNoMenuEmCriarNovoInsumo();
		
		click("#pbAdicionar");
		
	}

	private void clicarNoMenuEmCriarNovoInsumo() {
		getDriver().navigate().to("https://suportesie.sienge.com.br/sienge/getMenuItens.do");
		alert().accept();
		
		System.out.println(pageSource());
		
		click("modulo_Engenharia > ul:nth-child(1) > div > li");
		click("modulo_Engenharia > ul:nth-child(1) > ul:nth-child(2) > div > li");
		click("modulo_Engenharia > ul:nth-child(1) > ul:nth-child(2) > ul:nth-child(2) > li > a");
		
		//switchTo().$("iframe#idFrameMural");
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
