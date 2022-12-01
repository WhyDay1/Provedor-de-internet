package PDI.Entities;

import java.util.Objects;

public class Plano{

	private String Nome;
	private int QuantidadeMB;
	private double Preco;

	public Plano(String nome, int quantidadeMB, double preco) throws Exception {
		super();
		if(nome.isBlank() || nome.isEmpty()) {
			throw new Exception("Não é permitido campo 'nome' vazio em Plano.");
		}
		Nome = nome;
		QuantidadeMB = quantidadeMB;
		Preco = preco;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getQuantidadeMB() {
		return QuantidadeMB;
	}

	public void setQuantidadeMB(int quantidadeMB) {
		QuantidadeMB = quantidadeMB;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return "Plano [Nome=" + Nome + ", QuantidadeMB=" + QuantidadeMB + ", Preco=" + Preco + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Nome, Preco, QuantidadeMB);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plano other = (Plano) obj;
		return Objects.equals(Nome, other.Nome)
				&& Double.doubleToLongBits(Preco) == Double.doubleToLongBits(other.Preco)
				&& QuantidadeMB == other.QuantidadeMB;
	}	
	
	
}
