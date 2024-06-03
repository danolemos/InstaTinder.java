public class Empresa extends Usuario(){
        String cnpj, site, descricao, endereco;
        Area area;

        String toString(){
            return nome + " (" + login + " - " + cnpj + ")";
        };
}
