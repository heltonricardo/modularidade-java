module app.financeiro {
	
	/*
	 * Listagem dos pacotes exportados por outros projetos que serão usados
	 * nesse projeto. Por padrão o pacote java.base já é importado. Para
	 * usar o requires é necessário adicionar o outro projeto em Build Path:
	 * Botão direito no projeto > Build Path > Configure Build Path... > Aba
	 * Projects > Selecione modulepath > Add > Selecione o projeto para
	 * importar > Ok > Apply and Close. Em seguida já será possível usar o
	 * requires aqui dos pacotes exportados pelo projeto adicionado.
	 * 
	 * Não precisamos importar app.calculo aqui pois já importamos app.api, que
	 * é o que possui a interface que precisamos. Mesmo assim precisamos manter
	 * em Build Path o projeto app-calculo, pois nele possui uma implementação
	 * para a interface usada.
	 * 
	 * O "uses" declara qual serviço será usado dentro da aplicação. Então além
	 * de importar o pacote de projeto, deve-se informar que o serviço
	 * Calculadora será usado. É chamado de serviço pois é apenas trata-se
	 * apenas de uma interface, e não da própria implementação, como já dito.
	 */
	
	requires app.login;
	
	requires app.api;
	uses io.github.heltonricardo.app.Calculadora;
}