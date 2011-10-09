package br.ufpb.aps.silvia.exercicio;

public class ValidadorCampoSenhaDecorator extends ValidadorCampoDecorator {

	private int tamanhoMax = 100;
	private int tamanhoMin = 8;
	
	public ValidadorCampoSenhaDecorator(ValidadorCampo componente){
		super(componente);
	}
	
	
	public boolean verificarCampo (String txt) throws ValidadorCampoException{
		
		super.validarCampo(txt);
		
			for (int i = 0; i < txt.length(); i++){
				
				if (Character.isDigit(txt.charAt(i)) || (Character.isLetter(txt.charAt(i)))){
					throw new ValidadorCampoException("> ERRO: Deve possuir letras e números.");
				} /*else if (Character.isDigit(txt.charAt(i))
					throw new TextoInvalidoException("> ERRO: Deve possuir ao menos 3 números.");
			}  */
				System.out.println("> OK");
			}
			if (txt.length() >= this.tamanhoMax){
				throw new ValidadorCampoException ("> ERRO: Nome deve ter no máximo 100 caracteres");
			} else if (txt.length() >= this.tamanhoMin){
				throw new ValidadorCampoException ("> ERRO: Nome deve ter no máximo 8 caracteres");
			}
			return true;		
		}
	}


