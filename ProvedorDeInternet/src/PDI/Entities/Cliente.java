package PDI.Entities;

import java.util.Objects;

public abstract class Cliente {

		private String Telefone;
		private String Email;
		private Plano Plano;
		private Provedor Provedor;
		private String Endereco;
		
		public Cliente(String telefone, String email, Plano plano, Provedor provedor, String endereco) {
			Telefone = telefone;
			Email = email;
			Plano = plano;
			Provedor = provedor;
			Endereco = endereco;
		}
		
		public String getTelefone() {
			return Telefone;
		}

		public void setTelefone(String telefone){
			Telefone = telefone;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public Plano getPlano() {
			return Plano;
		}

		public void setPlano(Plano plano) {
			Plano = plano;
		}

		public Provedor getProvedor() {
			return Provedor;
		}

		public void setProvedor(Provedor provedor) {
			Provedor = provedor;
		}

		public String getEndereco() {
			return Endereco;
		}

		public void setEndereco(String endereco) {
			Endereco = endereco;
		}

		@Override
		public String toString() {
			return "Cliente [Telefone=" + Telefone + ", Email=" + Email + ", Plano=" + Plano + ", Provedor=" + Provedor
					+ ", Endereco=" + Endereco + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(Email, Endereco, Plano, Provedor, Telefone);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			return Objects.equals(Email, other.Email) && Objects.equals(Endereco, other.Endereco)
					&& Objects.equals(Plano, other.Plano) && Objects.equals(Provedor, other.Provedor)
					&& Objects.equals(Telefone, other.Telefone);
		}
		
		
		
		
}
