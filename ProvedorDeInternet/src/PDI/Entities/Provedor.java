package PDI.Entities;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class Provedor implements IFuncionario, IPlano, IPessoaFisica, IPessoaJuridica  {
	
	private String RazaoSocial;
	private String Cnpj;
	private String Email;
	private int Telefone;
	private String Endereco;
	
	private ArrayList<PessoaFisica> PessoaFisica = new ArrayList<PessoaFisica>();
	private ArrayList<PessoaJuridica> PessoaJuridica = new ArrayList<PessoaJuridica>();
	private ArrayList<Funcionario> Funcionario = new ArrayList<Funcionario>();
	private ArrayList<Plano> Plano = new ArrayList<Plano>();
	
	public Provedor() {
		
	}
	
	public Provedor(String razaoSocial, String cnpj, String email, int telefone, String endereco) throws Exception{
		
		if(razaoSocial.isEmpty() || cnpj.isEmpty() || email.isEmpty() || telefone == 0 || endereco.isEmpty() ) {
			throw new Exception("Não é possivel criar um provedor sem todos os dados!");
		}
		
		RazaoSocial = razaoSocial;
		Cnpj = cnpj;
		Email = email;
		Telefone = telefone;
		Endereco = endereco;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String listaPessoaFisica() {
		StringBuilder sb = new StringBuilder();
		sb.append("Clientes: \n");
		
		for(PessoaFisica item : PessoaFisica) {
			sb.append("Nome: " + item.getNome() + "\n");
			sb.append("CPF: " + item.getCpf() + "\n");
			sb.append("Endereço: " + item.getEndereco() + "\n");
			sb.append("Telefone: " +item.getTelefone() + "\n");
			sb.append("Plano: " +item.getPlano().getNome() + "\n");
		}
		
		return sb.toString();
	}
	
	public String listaPessoaJuridica() {
		StringBuilder sb = new StringBuilder();
		sb.append("Clientes: \n");
		
		for(PessoaJuridica item : PessoaJuridica) {
			sb.append("Razao social: " + item.getRazaoSocial() + "\n");
			sb.append("CNPJ: " + item.getCnpj() + "\n");
			sb.append("Endereço: " + item.getEndereco() + "\n");
			sb.append("Telefone: " + item.getTelefone() + "\n");
			sb.append("Plano: " +item.getPlano().getNome() + "\n");
		}
		
		return sb.toString();
	}
	
	public String ListaFuncionario() {
		StringBuilder sb = new StringBuilder();
		sb.append("Funcionarios: \n");
		
		for(Funcionario item : Funcionario) {
			sb.append("Nome: " + item.getNome() + "\n");
			sb.append("Telefone: " + item.getTelefone() + "\n");
			sb.append("Endereço: " + item.getEndereco() + "\n");
			sb.append("Função: " + item.getFuncao() + "\n");
		}
		return sb.toString();
	}
	
	public String ListaPlano() {
		StringBuilder sb = new StringBuilder();
		sb.append("Planos : \n");
		for(Plano item : Plano) {
			sb.append("Nome: " + item.getNome() + "\n");
			sb.append("Preço: R$" + item.getPreco() + "\n");
			sb.append("Quantidade de MegaBytes: " + item.getQuantidadeMB() + " mgbs\n");
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "Provedor [RazaoSocial=" + RazaoSocial + ", Cnpj=" + Cnpj + ", Email=" + Email + ", Telefone=" + Telefone
				+ ", Endereco=" + Endereco + "]";
	}


	@Override
	public void AddPlano(Plano plano) {
		Plano.add(plano);
	}

	@Override
	public void RemoverPlano(Plano plano) {
		Plano.remove(plano);		
	}

	@Override
	public void AddFuncionario(Funcionario funcionario) {
		Funcionario.add(funcionario);		
	}

	@Override
	public void RemoverFuncionario(Funcionario funcionario) {
		Funcionario.remove(funcionario);
	}

	@Override
	public void AddPessoaJuridica(PessoaJuridica pessoaJuridica) {
		PessoaJuridica.add(pessoaJuridica);	
	}

	@Override
	public void RemovePessoaJuridica(PessoaJuridica pessoaJuridica) {
		PessoaJuridica.remove(pessoaJuridica);
	}

	@Override
	public void AddPessoaFisica(PessoaFisica pessoaFisica) {
		PessoaFisica.add(pessoaFisica);
	}

	@Override
	public void RemovePessoa(PessoaFisica pessoaFisica) {
		PessoaFisica.remove(pessoaFisica);
	}

	
}
