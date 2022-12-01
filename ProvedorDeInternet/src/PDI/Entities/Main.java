package PDI.Entities;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			File arquivo = new File("dados.txt");
			if(!arquivo.exists()) {
				arquivo.createNewFile();
			}			
			
			FileWriter fw = new FileWriter(arquivo, true);
			BufferedWriter bw = new BufferedWriter(fw);
				
			
			// Instancia de Provedor
			Provedor provedor = new Provedor("DiegoTech", "25468980000182", "diegotech@provedor.com.br", 999999999, "Rua JK");
			
			// Instancia de Plano
			Plano plano = new Plano("Basic", 50, 73.99);
			provedor.AddPlano(plano);
			String lP = provedor.ListaPlano();
			bw.append(lP + "\n");
			
			
			// Instancia de Cliente do tipo PessoaFisica
			Cliente pf = new PessoaFisica("123", "gatech@gmail.com", plano, provedor, "Rua JK", "Gatech", "1231231231233");
			provedor.AddPessoaFisica( (PessoaFisica) pf);
			String lPf = provedor.listaPessoaFisica();
			bw.append(lPf + "\n");
			
			// Instancia de Cliente do tipo PessoaJuridica
			Cliente pj = new PessoaJuridica("9999999999", "mercadinho@gmail.com", plano, provedor, "Rua JK", "Mercadinho Dali", "25468980000182");
			provedor.AddPessoaJuridica((PessoaJuridica) pj);
			String lPj = provedor.listaPessoaJuridica();
			bw.append(lPj + "\n");
			
			//Instancia de Funcionario
			Funcionario funcionario = new Funcionario("Roger", "12345678910", "roger@gmail.com", "40028922", "Rua Melo", "Tec. Redes", provedor);
			provedor.AddFuncionario(funcionario);
			String lF = provedor.ListaFuncionario();
			bw.append(lP + "\n");
			
			System.out.println(lP);
			System.out.println(lPf);
			System.out.println(lPj);
			System.out.println(lP);
			
			bw.close();
			fw.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
