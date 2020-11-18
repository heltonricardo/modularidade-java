/* Usando:
 * open module app.calculo {
 * Esse pacote será aberto para todos os que o importarem, tornando possível
 * alterar classes e objetos via metadados (consulte Teste.java de
 * app-financeiro). Também é possível abrí-lo somente para um projeto
 * específico, usando o opens, que aceita mais de um nome de projeto separado
 * por vírgulas.
 */

module app.calculo {
	
	/*
	 * Lista de pacotes que serão exportados (podem ser usados fora do projeto)
	 * Os pacotes internos não são exportados por padrão, todos os pacotes
	 * devem ser descritos aqui para que sejam visíveis para outros projetos.
	 * 
	 * Usamos o transitive quando queremos que quem importar esse projeto
	 * também importe o transitivo, pois há uma dependência de códigos que
	 * estão no projeto que esse projeto importou.
	 * 
	 * Exports ... to ... exporta pacotes somente para projetos específicos.
	 * É possível separar os nomes dos projetos por vírgula.
	 */
	
	requires transitive app.login;
	exports io.github.heltonricardo.app.calculo;
	
	exports io.github.heltonricardo.app.calculo.interno
		 to app.financeiro;
	
	// opens io.github.heltonricardo.app.calculo; para todos ou:
	opens io.github.heltonricardo.app.calculo
	   to app.financeiro;
}