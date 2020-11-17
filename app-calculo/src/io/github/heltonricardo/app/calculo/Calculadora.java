package io.github.heltonricardo.app.calculo;

import io.github.heltonricardo.app.calculo.interno.OperacoesAritmeticas;
import io.github.heltonricardo.app.login.Logger;

public class Calculadora {

	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return opArit.soma(nums);
	}
	
	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}
}
