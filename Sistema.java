import java.util.ArrayList;

public class Sistema(){

	private ArrayList < Pessoa > pessoas = newArrayList < >() ;
	private ArrayList < Empresa > empresas = newArrayList < >() ;
	
	public buscarUsuario(String login){
		for (int i = 0; i < pessoas.size(); i++){
			if (Pessoa.login == login){
				return Pessoa;
			}
		}
		
		for (int i = 0; i < empresas.size(); i++){
			if (Empresa.login == login){
				return Empresa;
		}
	}
	
	public void novaPessoa(Pessoa p){
		pessoas.add(new Pessoa (p) );
	}
	
	public void novaEmpresa(Empresa e){
		empresas.add(new Empresa (e) );
	}
	
	public void listarUsuarios(){
		for (int i = 0; i < Pessoa.length; i++){
			System.out.println("Lista de pessoas: ");
			System.out.println(Pessoa[i].nome + "\n");
			System.out.println(Pessoa[i].cidade + "\n"); // ??????????????????????????
			}
		}
		
		for (int i = 0; i < Empresa.length; i++){
			System.out.println("Lista de empresas: ");
			System.out.println(Empresa[i].nome + "\n");
			System.out.println(Empresa[i].cidade + "\n"); // ?????????????????????????????
		}
	}
}
