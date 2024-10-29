
public class Main {

    public static void main(String[] args) {
        Cliente dio = new Cliente();
        dio.setNome("DIO");

        Conta cc = new ContaCorrente(dio);
        Conta poupanca = new ContaPoupanca(dio);

        cc.depositar(100);
        cc.transferir(11100, poupanca);
        cc.sacar(200);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }

}