module app.financeiro {
	
	/*
	 * Listagem dos pacotes exportados por outros projetos que ser�o usados
	 * nesse projeto. Por padr�o o pacote java.base j� � importado. Para
	 * usar o requires � necess�rio adicionar o outro projeto em Build Path:
	 * Bot�o direito no projeto > Build Path > Configure Build Path... > Aba
	 * Projects > Selecione modulepath > Add > Selecione o projeto para
	 * importar > Ok > Apply and Close. Em seguida j� ser� poss�vel usar o
	 * requires aqui dos pacotes exportados pelo projeto adicionado.
	 */
	
	requires app.calculo;
	requires app.login;
}