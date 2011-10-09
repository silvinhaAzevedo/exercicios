package br.ufpb.aps.silvia.exercicio;

public class Fachada {
	
		Formulario form;
		CampoDecorator campo;
		
		public Fachada(){
			 form = new Formulario("cadastro do usuário");
			 campo = new CampoDecorator( );
			

}
		public void inserirNovoCampo(CampoDecorator c){
			form.addCampo(c);
			
		}
		
		public int numeroDeCamposCadastrados(){
			return form.getQtdeCampos(3);
		}
		
		public void listarCampos(){
			form.listarCamposDecorator();
}
}
		
