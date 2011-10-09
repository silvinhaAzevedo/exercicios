package br.ufpb.aps.silvia.exercicio;

//teste
class CampoDecorator {
	private String nome;
	private String email;
	private String idade;
	private ValidadorCampo vc;
	private String erro;
	private String msg;
	private String login;
	private String senha;

	public CampoDecorator() {
		

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		vc = new ValidadorCampoTexto(nome);
		if (vc.validarCampo(nome))
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		vc = new ValidadorCampoEmailDecorator(null);
		if (vc.validarCampo(email))
			this.email = email;

	}

	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) throws Exception {
		vc = new ValidadorCampoIdade(0, 0);
		if (vc.validarCampo(idade))
			this.idade = idade;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) throws Exception{
		vc = new ValidadorCampoTexto(login);
		if (vc.validarCampo(login))
			this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) throws Exception {
		vc = new ValidadorCampoTexto(senha);
		if (vc.validarCampo(senha))
			this.senha = senha;
	}

	public String toString() {
		return "Nome:" +  this.nome + "\n" + "Email:" + this.email + "\n" +  "Idade:" + this.idade;
	}

	public boolean validar(String msg) throws Exception {
		try {
			vc.validarCampo(this.msg);
			return true;
		} catch (ValidadorCampoException e) {
			this.erro = e.getMessage();
			return false;
		}
		
		

		
			
	}

}
