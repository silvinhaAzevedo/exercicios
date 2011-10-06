package br.ufpb.aps.silvia.exercicio;

public class Fachada {
	
		Formulario form;
		Campo campo;
		
		public Fachada(){
			 form = new Formulario("cadastro do usuário");
			 campo = new Campo( );
			

}
		public void inserirNovoCampo(Campo c){
			form.addCampo(c);
			
		}
		
		public int numeroDeCamposCadastrados(){
			return form.getQtdeCampos(3);
		}
		
		public void listarCampos(){
			form.listarCampos();
}
}
		
