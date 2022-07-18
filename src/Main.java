public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else { bonus = 0;

        }
        int finalbalance = balance + amount + bonus;

        System.out.println("Итого рублей на счету: " + finalbalance);
        System.out.println("Итого бонусов: = " + bonus);
    }
}
