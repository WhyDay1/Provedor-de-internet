package PDI.Entities;

import java.util.Objects;

public class PessoaFisica extends Cliente{

	private String Nome;
	private String Cpf;
	
	public PessoaFisica(String telefone, String email, Plano plano, Provedor provedor,
			String endereco, String nome, String cpf) throws Exception {
		
		super(telefone, email, plano, provedor, endereco);
		if(nome.isEmpty() || cpf.isEmpty() || telefone.isEmpty() || email.isEmpty() || plano.equals(null) || provedor.equals(null) || endereco.isEmpty()) {
			throw new Exception("Não é possivel criar um cliente sem todos os dados!");
		}
		
		Nome = nome;
		Cpf = cpf;
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

	@Override
	public String toString() {
		return "PessoaFisica [Nome=" + Nome + ", Cpf=" + Cpf + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Cpf, Nome);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		return Cpf == other.Cpf && Objects.equals(Nome, other.Nome);
	}	
}
