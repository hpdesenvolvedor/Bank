package bank.henrique.nunes;

public class Main {
    public static void main(String[] args) {


    Account account = new Account("0001", "1234", "Joao Pedro");

    boolean succeed = account.sacar(200.00);
    if (!succeed){
        System.out.println("Você não tem saldo suficiente para sacar!");
    }

    account.deposit(100);
    account.deposit(100);
    account.deposit(100);

    if (!account.sacar(200)){
        System.out.println("Você não tem saldo suficiente para sacar!");
    }


        // criar uma conta (agencia, conta, nome)
        // limite o nome = 12 caracteres
        // sacar valores
        // não pode sacar mais do que disponível
        // depositar
        // informar para o usuario as operações (saque, deposito)



        System.out.println(account);
    }
}