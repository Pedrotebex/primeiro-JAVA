import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldo = 2500;
        String senhaCorreta = "1234"; // Defina a senha correta
        String nomeCliente = "Pedro Augusto";
        String tipoConta = "Corrente";

        // Solicitar senha
        System.out.print("Digite a senha para acessar: ");
        String senhaDigitada = scanner.next();

        // Verificar se a senha está correta
        if (!senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta. Encerrando o programa.");
            return; // Encerrar o programa se a senha estiver incorreta
        }

        System.out.println("Bem-vindo, " + nomeCliente + "!");

        // Loop principal do programa
        while (true) {
            System.out.println("\nEscolha uma Operação:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor a ser recebido?");
                double recibo = scanner.nextDouble();
                saldo += recibo;
                System.out.println("Seu saldo atual é de R$" + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o valor a ser transferido?");
                double transferencia = scanner.nextDouble();
                if (transferencia <= saldo) {
                    saldo -= transferencia;
                    System.out.println("Transferência realizada. Seu saldo atual é de R$" + saldo);
                } else {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                }
            } else if (opcao == 4) {
                System.out.println("Muito obrigado! Tenha um ótimo dia!");
                break; // Encerrar o programa se a opção for 4
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
