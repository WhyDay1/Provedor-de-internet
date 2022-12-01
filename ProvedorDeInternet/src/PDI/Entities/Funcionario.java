package PDI.Entities;

import java.util.Objects;

public class Funcionario {

	private String Nome;
	private String Cpf;
	private String Email;
	private String Telefone;
	private String Endereco;
	private String Funcao;
	private Provedor Provedor;
	
	
	public Funcionario(String nome, String cpf, String email, String telefone, String endereco, String funcao, Provedor provedor) throws Exception {
		if(nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || funcao.isEmpty() || provedor.equals(null)) {
			throw new Exception("Não é possivel criar um funcionário sem todos os dados!");
		}
		
		Nome = nome;
		Cpf = cpf;
		Email = email;
		Telefone = telefone;
		Endereco = endereco;
		Funcao = funcao;
		Provedor = provedor;	
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setFuncao(String funcao) {
		Funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [Nome=" + Nome + ", Cpf=" + Cpf + ", Email=" + Email + ", Telefone=" + Telefone
				+ ", Endereco=" + Endereco + ", Funcao=" + Funcao + ", Provedor=" + Provedor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Cpf, Email, Endereco, Funcao, Nome, Provedor, Telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Cpf == other.Cpf && Objects.equals(Email, other.Email) && Objects.equals(Endereco, other.Endereco)
				&& Objects.equals(Funcao, other.Funcao) && Objects.equals(Nome, other.Nome)
				&& Objects.equals(Provedor, other.Provedor) && Telefone == other.Telefone;
	}	
}
