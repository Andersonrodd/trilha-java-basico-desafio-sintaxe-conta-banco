import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner de texto simples.
        Scanner scan = new Scanner(System.in);

        // Tipo e Atributos
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação dos dados
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta!");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o Nome Do Cliente!");
        nomeCliente = scan.next();

        System.out.println("Por favor, digite o Saldo!");
        saldo = scan.nextDouble();

        // Imprime uma String com todos os dados informados.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque.");
        // Fecha o Scanner
        scan.close();
    }
}
