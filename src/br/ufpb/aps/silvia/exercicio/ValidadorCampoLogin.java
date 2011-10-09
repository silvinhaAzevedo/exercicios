package br.ufpb.aps.silvia.exercicio;



public class ValidadorCampoLogin extends ValidadorCampoDecorator {
	private int tamanhoMax;
	
	public ValidadorCampoLogin (int max){
		super(null);
		this.tamanhoMax = max;
	}
	
	//public  ValidadorCampoLogin() {
		
		//this.tamanhoMax = 20;
	//}
	
	
	public boolean validarCampoDecorator (String txt) throws ValidadorCampoException{
		
			
			for (int i = 0; i < txt.length(); i++){
				
				if (Character.isDigit(txt.charAt(i))){
					throw new ValidadorCampoException("ERRO: O Nome � um campo texto. N�o deve conter numeros.");
				}else if (Character.isDigit(txt.charAt(0))){
					throw new ValidadorCampoException("ERRO: N�o pode iniciar com um n�mero");
				}if (txt.length() == 0){
					throw new ValidadorCampoException ("ERRO: N�o pode ser vazio");
				}
			}  
				System.out.println("> OK");
			
			if (txt.length() >= this.tamanhoMax){
				throw new ValidadorCampoException ("ERRO: Nome deve ter no m�ximo 20 caracteres");
			} 
			return true;
			
		}

	
	
	

}
