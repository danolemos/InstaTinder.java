import java.util.ArrayList;

public class Usuario(){
    String login, nome, senha;
    Localidade cidade;

	ArrayList < Usuario > seguindo = newArrayList < >();
	ArrayList < Usuario > seguidores = newArrayList < >() ;
	ArrayList < Pessoa > interessados = newArrayList < >() ;
	ArrayList < Postagem > posts = newArrayList < >() ;

    boolean validarAcesso(String pwd){
        //return true;
        //return false;
    }

    public String toString(){
        return this.nome + this.login;
    }

    void postar(String foto, String legenda, Data hoje, String senha){

        // criar postagem //
        Postagem p = new Postagem;
        foto = foto;
        legenda = legenda;
        d = hoje;

	if (senha == this.senha){

        // inserir na lista de posts //
        posts.add(p);


    }

    void seguir(Usuario u){
	    seguindo.add(u);
    }

    void mostrarPosts( ){
        for (int i = 0; i < length ; i ++) {
            System.out.println(p.get(Postagens[i]));
	}
    }

    void feed( ){
	// O método feed exibe todos os posts de todos os usuário que ele segue //
    }
}
