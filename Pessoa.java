public class Pessoa extends Usuario{
        String cpf, bio;
        char sexo;
        Data nasc;
        Usuario[] interesses;

        String toString(){
            return nome + " (" + login + " - " + cpf + ")";
        };

}
