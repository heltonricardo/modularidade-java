package io.github.heltonricardo.app.calculo;

import io.github.heltonricardo.app.Calculadora;
import io.github.heltonricardo.app.calculo.interno.OperacoesAritmeticas;
import io.github.heltonricardo.app.login.Logger;

public class CalculadoraImpl implements Calculadora {
	
	private String id = null;
	private OperacoesAritmeticas opArit = new OperacoesAritmeticas();
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public double soma(double... nums) {
		Logger.info("Somando");
		return opArit.soma(nums);
	}
	
	public Class<Logger> getLoggerClass() {
		return Logger.class;
	}
}
