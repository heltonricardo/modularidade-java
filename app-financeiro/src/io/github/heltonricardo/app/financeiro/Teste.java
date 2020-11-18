package io.github.heltonricardo.app.financeiro;

import java.lang.reflect.Field;

import io.github.heltonricardo.app.calculo.Calculadora;
import io.github.heltonricardo.app.calculo.interno.OperacoesAritmeticas;

/*
 * Em Java � poss�vel alterar dados privados de classes e objetos! Basta
 * usar um recurso chamado Reflex�o, que permite que acessemos os metadados.
 * Por�m s� � poss�vel faz�-lo quando o pacote importado que cont�m a classe
 * que quero alterar est� "aberto" no module-info do projeto que o exporta.
 * Nesse caso, verifique o arquivo do projeto app-calculo.
 */

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma(1.1, 2.2, 3.3, 4.4, 5.5));
		
		System.out.println(calc.getLoggerClass());
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(6, 7, 8, 9));
		
		calc.setId("meu_id");
		System.out.println(calc.getId());
		
		try {
			// fildId "aponta" para o id da classe Calculadora:			
			Field fildId = Calculadora.class.getDeclaredFields()[0];
			
			// Torna o atributo pass�vel de altera��o / visualiza��o:
			fildId.setAccessible(true);
			
			// Altera valor do atributo de um objeto:
			fildId.set(calc, "id_alterado");
			
			// Retira os acessos:
			fildId.setAccessible(false);
			
		} catch (Exception e) {}
		
		System.out.println(calc.getId());
		
	}
}
