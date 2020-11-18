package io.github.heltonricardo.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import io.github.heltonricardo.app.Calculadora;

/*
 * Em Java é possível alterar dados privados de classes e objetos! Basta
 * usar um recurso chamado Reflexão, que permite que acessemos os metadados.
 * Porém só é possível fazê-lo quando o pacote importado que contém a classe
 * que quero alterar está "aberto" no module-info do projeto que o exporta.
 * Nesse caso, verifique o arquivo do projeto app-calculo.
 * 
 * Possuímos a importação de uma interface, e usamos o ServiceLoader para
 * procurar, em todos os projetos que estão na Build Path, todas as classes que
 * implementam a interface. Ele pode voltar nenhuma ou muitas. Nesse caso
 * consideramos que ele encontra mais de zero implementações e pegamos a
 * primeira delas. Devemos usar o .class nos objetos pois não é possível saber
 * o nome da classe que implementou a interface.
 */

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst()
				.get();
		
		System.out.println(calc.soma(1.1, 2.2, 3.3, 4.4, 5.5));
	
		calc.setId("meu_id");
		System.out.println(calc.getId());
		
		try {
			// fildId "aponta" para o id da classe Calculadora:			
			Field fildId = calc.getClass().getDeclaredFields()[0];
			
			// Torna o atributo passível de alteração / visualização:
			fildId.setAccessible(true);
			
			// Altera valor do atributo de um objeto:
			fildId.set(calc, "id_alterado");
			
			// Retira os acessos:
			fildId.setAccessible(false);
			
		} catch (Exception e) {}
		
		System.out.println(calc.getId());
		
	}
}
