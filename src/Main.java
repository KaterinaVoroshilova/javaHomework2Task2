public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int deposit = 1100;
        int bonus = 100;
        int bonusCash = 0;
        int endBalance = startBalance + deposit;

        if (deposit > 1000) {
            bonusCash = deposit / bonus;
            endBalance = endBalance + bonusCash;
        }

        System.out.println("Количество бонусных рублей: " + bonusCash);
        System.out.println("Итоговый счет: " + endBalance);
    }
}