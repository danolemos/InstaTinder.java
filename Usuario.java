import java.util.ArrayList;

public class Usuario(){
    String login, nome, senha;
    Localidade cidade;
    Usuario[] seguindo, seguidores;
    Pessoa[] interessados;
    Postagem[] posts;

    boolean validarAcesso(pwd : String){
        return true;
        return false;
    }

    String toString(){
        return this.nome + this.login;
    }

    void postar(foto : String, legenda : String, hoje : Data, senha : String){
        String foto, legenda, senha;
        Data hoje;

        // criar postagem //
        Postagem p = new Postagem;
        foto = this.foto;
        legenda = this.legenda;
        hoje = this.hoje;
        senha = this.senha;

        // inserir na lista de posts //
        posts.add(p);


    }

    void seguir(u : Usuario){
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
