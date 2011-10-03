package br.ufpb.aps.silvia.exercicio;
//teste
class Campo {
	private String nome;
	private String email;
	private int idade;
	private ValidadorCampo vc;
	private String erro;
	private String msg;
	
	public Campo(String nome, ValidadorCampo vc){
		this.nome =nome;
		this.vc = vc;
	}
	
	public Campo(String nome, String email,int idade, ValidadorCampo vc){
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.vc =vc;
		
		
	}
	
	public String getNome(){
		return nome;
	}
	
	public boolean validar(String msg) throws Exception{
		try {
				vc.validarCampo(this.msg);
				return true;
		}catch(ValorInvalidoException e){
			this.erro = e.getMessage();
			return false;
		}
		
		
		  
		}  
	
		}

	
	
	


