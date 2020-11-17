package io.github.heltonricardo.app.calculo;

import io.github.heltonricardo.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	// Método Delegate (delega a funcionalidade para um método já implementado)
	public double soma(double... nums) {
		return opArit.soma(nums);
	}
}
