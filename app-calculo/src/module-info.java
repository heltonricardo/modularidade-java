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
	 */
	
	requires transitive app.login;
	exports io.github.heltonricardo.app.calculo;
	
	exports io.github.heltonricardo.app.calculo.interno
		 to app.financeiro;
	
	// opens io.github.heltonricardo.app.calculo; para todos ou:
	opens io.github.heltonricardo.app.calculo
	   to app.financeiro;
}