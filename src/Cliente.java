public class Cliente {
    //atributos
    String nome;
    String cpf;
    Endereco endereco;
    //metodos
    public String retornarDados () {
        return "NOME: " + nome + " | CPF: " + cpf + endereco.retornarEndereco();
    }

}
