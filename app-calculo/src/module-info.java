module app.calculo {
	
	/*
	 * Lista de pacotes que serão exportados (podem ser usados fora do projeto)
	 * Os pacotes internos não são exportados por padrão, todos os pacotes
	 * devem ser descritos aqui para que sejam visíveis para outros projetos.
	 * 
	 * Usamos o transitive quando queremos que quem importar esse projeto
	 * também importe o transitivo, pois há uma dependência de códigos que
	 * estão no projeto que esse projeto importou.
	 */
	
	requires transitive app.login;
	exports io.github.heltonricardo.app.calculo;
}