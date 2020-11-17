package io.github.heltonricardo.app.financeiro;

import io.github.heltonricardo.app.calculo.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma(1.1, 2.2, 3.3, 4.4, 5.5));
		
		System.out.println(calc.getLoggerClass());
	}
}
