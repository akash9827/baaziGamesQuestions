public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(10,5, "Akash");
        Account account2 = new Account(5,10, "Vikas");

        System.out.println("Account1 monthly cost " + account1.monthlyCost());
        System.out.println("Account2 monthly cost " + account2.monthlyCost());
        System.out.println("Account1 compared to Account2: " + account1.compareTo(account2));
        System.out.println("Account1 : " + account1.toString());
        System.out.println("Account2 : " + account2.toString());




    }
}