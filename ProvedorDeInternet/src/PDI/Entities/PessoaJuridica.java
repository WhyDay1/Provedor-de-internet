package PDI.Entities;

import java.util.Objects;

public class PessoaJuridica extends Cliente{
	
	private String RazaoSocial;
	private String Cnpj;
	
	public PessoaJuridica(String telefone, String email, PDI.Entities.Plano plano, PDI.Entities.Provedor provedor,
			String endereco, String razaoSocial, String cnpj) throws Exception {
		super(telefone, email, plano, provedor, endereco);
		
		if(razaoSocial.isEmpty() || cnpj.isEmpty() || telefone.isEmpty() || email.isEmpty() || plano.equals(null) || provedor.equals(null) || endereco.isEmpty()) {
			throw new Exception("Não é possivel criar um cliente sem todos os dados!");
		}
		
		RazaoSocial = razaoSocial;
		Cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [RazaoSocial=" + RazaoSocial + ", Cnpj=" + Cnpj + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Cnpj, RazaoSocial);
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
		PessoaJuridica other = (PessoaJuridica) obj;
		return Cnpj == other.Cnpj && Objects.equals(RazaoSocial, other.RazaoSocial);
	}
}
