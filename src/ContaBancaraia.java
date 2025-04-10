import java.util.Scanner;

public class ContaBancaraia {
    public static void main(String[] args) {

        // ContaBancaria
        int opcao = 0;
        String nome = "Luiz Eduardo Ramirez";
        String tipoConta = "Conta Corrente";
        double saldo = 2000.00;

        System.out.println("**********************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n**********************");

        String menu = """
                1 - Consultar Saldo
                2 - Transferir
                3 - Sacar
                4 - Depositar
                5 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 2:
                    Scanner transfScanner = new Scanner(System.in);
                    System.out.println("Digite o valor da transferência: ");
                    double valorTransferencia = transfScanner.nextDouble();
                    if (saldo < valorTransferencia) {
                        System.out.println("Saldo insuficiente!");
                        break;
                    } else {
                        saldo -= valorTransferencia;
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.println("Saldo: R$" + saldo);
                        break;
                    }
                case 3:
                    Scanner saqueScanner = new Scanner(System.in);
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = saqueScanner.nextDouble();
                    if (saldo < valorSaque) {
                        System.out.println("Saldo insuficiente!");
                        break;
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo: R$" + saldo);
                        break;
                    }

                case 4:
                    Scanner depositoScanner = new Scanner(System.in);
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = depositoScanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}
