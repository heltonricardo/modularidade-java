module app.financeiro {
	
	/*
	 * Listagem dos pacotes exportados por outros projetos que ser�o usados
	 * nesse projeto. Por padr�o o pacote java.base j� � importado. Para
	 * usar o requires � necess�rio adicionar o outro projeto em Build Path:
	 * Bot�o direito no projeto > Build Path > Configure Build Path... > Aba
	 * Projects > Selecione modulepath > Add > Selecione o projeto para
	 * importar > Ok > Apply and Close. Em seguida j� ser� poss�vel usar o
	 * requires aqui dos pacotes exportados pelo projeto adicionado.
	 * 
	 * N�o precisamos importar app.calculo aqui pois j� importamos app.api, que
	 * � o que possui a interface que precisamos. Mesmo assim precisamos manter
	 * em Build Path o projeto app-calculo, pois nele possui uma implementa��o
	 * para a interface usada.
	 * 
	 * O "uses" declara qual servi�o ser� usado dentro da aplica��o. Ent�o al�m
	 * de importar o pacote de projeto, deve-se informar que o servi�o
	 * Calculadora ser� usado. � chamado de servi�o pois � apenas trata-se
	 * apenas de uma interface, e n�o da pr�pria implementa��o, como j� dito.
	 */
	
	requires app.login;
	
	requires app.api;
	uses io.github.heltonricardo.app.Calculadora;
}