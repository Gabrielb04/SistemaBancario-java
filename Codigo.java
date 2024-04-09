import java.util.Scanner;
public class SistemaBancario {
    private String nomeCliente;
    private double saldo;

    public SistemaBancario(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }


	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o nome do cliente: ");
	        String nomeCliente = scanner.nextLine();

	        SistemaBancario conta = new SistemaBancario(nomeCliente);

	        int opcao;
	        do {
	            System.out.println("\nEscolha uma opção:");
	            System.out.println("1. Depositar");
	            System.out.println("2. Sacar");
	            System.out.println("3. Verificar Saldo");
	            System.out.println("4. Sair");
	            System.out.print("Opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o valor para depósito: ");
	                    double valorDeposito = scanner.nextDouble();
	                    conta.depositar(valorDeposito);
	                    break;
	                case 2:
	                    System.out.print("Digite o valor para saque: ");
	                    double valorSaque = scanner.nextDouble();
	                    conta.sacar(valorSaque);
	                    break;
	                case 3:
	                    conta.verificarSaldo();
	                    break;
	                case 4:
	                    System.out.println("Saindo...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 4);

	        scanner.close();
		
	}

}
