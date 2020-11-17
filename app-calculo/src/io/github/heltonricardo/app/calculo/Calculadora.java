package io.github.heltonricardo.app.calculo;

import io.github.heltonricardo.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	// M�todo Delegate (delega a funcionalidade para um m�todo j� implementado)
	public double soma(double... nums) {
		return opArit.soma(nums);
	}
}
