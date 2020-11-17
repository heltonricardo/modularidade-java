module app.calculo {
	
	/*
	 * Lista de pacotes que ser�o exportados (podem ser usados fora do projeto)
	 * Os pacotes internos n�o s�o exportados por padr�o, todos os pacotes
	 * devem ser descritos aqui para que sejam vis�veis para outros projetos.
	 * 
	 * Usamos o transitive quando queremos que quem importar esse projeto
	 * tamb�m importe o transitivo, pois h� uma depend�ncia de c�digos que
	 * est�o no projeto que esse projeto importou.
	 */
	
	requires transitive app.login;
	exports io.github.heltonricardo.app.calculo;
}