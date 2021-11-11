public class Main {

    public static void main(String[] args) {
        Users.addThreeUsers();
        BankMachine.updateCurrencyList();

        BankMachine.selectUser();
        BankMachine.authorization();
        BankMachine.setCurrency();
        BankMachine.work();
    }
}
