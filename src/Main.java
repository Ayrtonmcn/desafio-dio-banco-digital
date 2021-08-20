import java.rmi.ConnectIOException;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Tio Patinhas");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(.01);
        cc.transferir(0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}
