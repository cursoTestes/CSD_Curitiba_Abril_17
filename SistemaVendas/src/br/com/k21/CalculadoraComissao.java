package br.com.k21;

public class CalculadoraComissao {

	private static final double PERCENTUAL_COMISSAO_FAIXA_1 = 0.05;
	private static final double PERCENTUAL_COMISSAO_FAIXA_2 = 0.06;
	private static final int VALOR_LIMITE_FAIXA_COMISSAO = 10000;

	public static double calcular(double valor_venda) {
		double comissao  = 0.00;
		
		if(valor_venda > VALOR_LIMITE_FAIXA_COMISSAO){
			
			comissao = valor_venda * PERCENTUAL_COMISSAO_FAIXA_2;
			
		} else {
			
			comissao = valor_venda * PERCENTUAL_COMISSAO_FAIXA_1;
			
		}
		
		return arredondarParaBaixo(comissao);
	}

	private static double arredondarParaBaixo(double comissao) {
		return Math.floor(comissao*100.00)/100.00;
	}

}
