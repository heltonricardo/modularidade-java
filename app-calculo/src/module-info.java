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
	 * 
	 * Aqui foi usado provides ... with ... pois criamos uma interface em
	 * projeto app-api-publica e queremos que app-calculo dependa apenas dessa
	 * interface e não diretamente de uma implementação específica.
	 * Podemos ler da seguinte maneira: CalculadoraImpl é uma implemetação que
	 * Calculadora está provendo. Esse recurso é bastante utilizado pois como
	 * há dependência apenas da interface, fica muito mais fácil modificar as
	 * implementações feitas, e até mesmo alterar os pacotes que a implementam.
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