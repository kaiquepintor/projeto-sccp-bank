public class Endereco {
    //Atributos
    String logradouro = "Rua Gabriel de Souza";
    int numero = 139;
    String complemento = "Casa";
    String cep = "09812-210";
    //Metodos
    String retornarEndereco(){
        return " | ENDEREÇO: " + logradouro + ", " + numero + " | CEP: " + cep + " | COMPLEMENTO: " + complemento;
    }
}
