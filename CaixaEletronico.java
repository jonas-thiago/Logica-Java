  import java.util.Scanner; 

public class CaixaEletronico {
    // O atributo principal é o saldo. 
    // Sacar e depositar são AÇÕES que alteram esse saldo.
    private double saldo;

    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para consultar saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor; // soma ao saldo atual
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor; // subtrai do saldo atual
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public static void main(String[] args) {
        // Scanner serve para ler o que o usuário digita no teclado
        Scanner teclado = new Scanner(System.in);
        CaixaEletronico meuCaixa = new CaixaEletronico(500.0); // Começamos com 500 reais
        
        int opcao = 0;

        // Loop para o menu continuar aparecendo até o usuário sair
        while (opcao != 4) {
            System.out.println("\n--- MENU CAIXA ELETRÔNICO ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = teclado.nextInt(); // Lê o número que o usuário digitar

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + meuCaixa.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = teclado.nextDouble();
                    meuCaixa.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = teclado.nextDouble();
                    meuCaixa.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Encerrando sistema... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        teclado.close(); // Sempre feche o scanner para liberar memória
    }
}
