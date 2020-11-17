module app.financeiro {
	
	/*
	 * Listagem dos pacotes exportados por outros projetos que serão usados
	 * nesse projeto. Por padrão o pacote java.base já é importado. Para
	 * usar o requires é necessário adicionar o outro projeto em Build Path:
	 * Botão direito no projeto > Build Path > Configure Build Path... > Aba
	 * Projects > Selecione modulepath > Add > Selecione o projeto para
	 * importar > Ok > Apply and Close. Em seguida já será possível usar o
	 * requires aqui dos pacotes exportados pelo projeto adicionado.
	 */
	
	requires app.calculo;
	requires app.login;
}