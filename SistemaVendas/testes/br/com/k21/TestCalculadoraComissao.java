package br.com.k21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculadoraComissao {
	
	@Test
	public void teste_10001_retorno_600_06() {
		double entrada = 10001.00;
		double esperado = 600.06;
		double entrada2 = 100001.00;
		double esperado2 = 6000.06;
	
		
		double retorno = CalculadoraComissao.calcular(entrada);

		double retorno2 = CalculadoraComissao.calcular(entrada2);
		
		assertEquals(esperado, retorno, 0);
		assertEquals(esperado2, retorno2, 0);
	}
	
	@Test
	public void teste_inteiro_menor_10000_retorno_valor_decimal() {
		double entrada = 1000.00;
		double esperado = 50.00;
		
		double retorno = CalculadoraComissao.calcular(entrada);
		
		assertEquals(esperado, retorno, 0);
	}
	@Test
	public void teste_inteiro_igual_10000_retorno_valor_decimal() {
		double entrada = 10000.00;
		double esperado = 500.00;
		
		double retorno = CalculadoraComissao.calcular(entrada);
		
		assertEquals(esperado, retorno, 0);
	}
	
	@Test
	public void teste_decimal_10000_reais_e_01_centavos_retorno_valor_decimal() {
		double entrada = 10000.01;
		double esperado = 600.00;
		
		double retorno = CalculadoraComissao.calcular(entrada);
		
		assertEquals(esperado, retorno, 0);
	}
	
	
}




