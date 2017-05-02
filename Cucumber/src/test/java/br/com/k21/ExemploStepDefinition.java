package br.com.k21;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ExemploStepDefinition {

	@Dado("^que estou na tela de Login$")
	public void que_estou_na_tela_de_Login() throws Throwable {
		  System.out.println("entrei no given");
	}

	@Quando("^digitar credenciais validas clicando no botao de login$")
	public void digitar_credenciais_validas_clicando_no_botao_de_login() throws Throwable {
		  System.out.println("entrei no when");
	}

	@Entao("^devo acessar a Home do sistema$")
	public void devo_acessar_a_Home_do_sistema() throws Throwable {
		  System.out.println("entrei no then");

	}

}
