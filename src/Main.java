import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        Cliente cliente = new Cliente();


        System.out.println("===============================================================");
        System.out.println("                   Bem vindo ao SCCP Bank!                     ");
        System.out.println("===============================================================");

        Scanner scanner = new Scanner(System.in);

        //Area de login
        System.out.println("Insira seu nome: ");
        String nomeAdicionar = scanner.nextLine();
        cliente.nome = nomeAdicionar;
        System.out.println("Insira seu cpf: ");
        String adicionarCpf = scanner.nextLine();
        cliente.cpf = adicionarCpf;

        //Area de deposito
        System.out.println("===============================================================");
        System.out.println("Digite aqui quando deseja depositar:");
        float valorAdicionar = scanner.nextFloat();
        conta.depositar(valorAdicionar);
        System.out.println("Saldo atual: R$" + conta.retornarSaldo());

        //Area de retirada
        System.out.println("===============================================================");
        System.out.println("Digite quanto você deseja retirar: ");
        float valorRetirar = scanner.nextFloat();
        conta.retirar(valorRetirar);
        System.out.println("Saldo atual: R$" + conta.retornarSaldo());

        //Area de dados
        System.out.println("===============================================================");
        System.out.println("Seus dados: ");
        System.out.println(cliente.retornarDados());












    }
}