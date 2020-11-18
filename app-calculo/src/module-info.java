/* Usando:
 * open module app.calculo {
 * Esse pacote ser� aberto para todos os que o importarem, tornando poss�vel
 * alterar classes e objetos via metadados (consulte Teste.java de
 * app-financeiro). Tamb�m � poss�vel abr�-lo somente para um projeto
 * espec�fico, usando o opens, que aceita mais de um nome de projeto separado
 * por v�rgulas.
 */

module app.calculo {
	
	/*
	 * Lista de pacotes que ser�o exportados (podem ser usados fora do projeto)
	 * Os pacotes internos n�o s�o exportados por padr�o, todos os pacotes
	 * devem ser descritos aqui para que sejam vis�veis para outros projetos.
	 * 
	 * Usamos o transitive quando queremos que quem importar esse projeto
	 * tamb�m importe o transitivo, pois h� uma depend�ncia de c�digos que
	 * est�o no projeto que esse projeto importou.
	 * 
	 * Exports ... to ... exporta pacotes somente para projetos espec�ficos.
	 * � poss�vel separar os nomes dos projetos por v�rgula.
	 * 
	 * Aqui foi usado provides ... with ... pois criamos uma interface em
	 * projeto app-api-publica e queremos que app-calculo dependa apenas dessa
	 * interface e n�o diretamente de uma implementa��o espec�fica.
	 * Podemos ler da seguinte maneira: CalculadoraImpl � uma implemeta��o que
	 * Calculadora est� provendo. Esse recurso � bastante utilizado pois como
	 * h� depend�ncia apenas da interface, fica muito mais f�cil modificar as
	 * implementa��es feitas, e at� mesmo alterar os pacotes que a implementam.
	 */
	
	requires transitive app.login;
	
	requires app.api;
	
	provides io.github.heltonricardo.app.Calculadora
	    with io.github.heltonricardo.app.calculo.CalculadoraImpl;
	
	exports io.github.heltonricardo.app.calculo
	     to app.financeiro;
	
	// opens io.github.heltonricardo.app.calculo; para todos ou:
	opens io.github.heltonricardo.app.calculo
	   to app.financeiro;
}