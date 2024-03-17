public class ContaCorrente {
    //atributos
    float saldo;
    Cliente titular;

    //metodos
    public void depositar (float valor){
        saldo += valor;
    }
    public float retornarSaldo (){
        return saldo;
    }
    public void retirar (float valor){
        saldo -= valor;
    }
}