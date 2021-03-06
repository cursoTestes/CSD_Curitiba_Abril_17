package br.com.k21;

import junit.framework.Assert;

import org.fluentlenium.adapter.FluentTest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CadastroDeUmaVendaInterfaceTest extends FluentTest {

	@Override
	public WebDriver getDefaultDriver() {
		return new ChromeDriver();
	}
	
	
	
	@Test
	public void teste_venda_com_sucesso() {
		fazerLogin();
		clicarNaUnidade();
		buscarPeloNome("abbas praim");
		
		//			
	}



	private void buscarPeloNome(String nome) {
		goTo("http://cro-checklist.implantadev.net.br/siscaf/#Cadastro/Pessoas");
		
		fill("#valorFiltroPrincipal").with(nome);
		click(".btnBuscar");
	}



	private void clicarNaUnidade() {
		click(".btnVerde");
	}



	private void fazerLogin() {
		goTo("http://cro-checklist.implantadev.net.br/siscaf/");
		fill("#MainContent_txtUsuario").with("lilian");
		fill("#MainContent_txtSenha").with("1");
		
		click("#MainContent_btnLogin");
	}	
}
