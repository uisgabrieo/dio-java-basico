import java.util.Scanner;

class Conta {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public Conta() {}
    public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente  = nomeCliente;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}

public class ContaTerminal{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao banco DIO");
        System.out.println("Por favor, digite o Número da Conta!");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o Código da Agência!");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite seu Nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite seu Saldo!");
        double saldo = sc.nextDouble();

        var conta = new Conta(numero, agencia, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n"
                ,conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());

        sc.close();

    }
}
