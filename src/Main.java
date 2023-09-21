public class Main {
    public static void main(String[] args) {

        int Balance = 10000;
        int Refill = 1000;

        int Bonus = 0;
        if (Refill > 1000) {
            Bonus = Refill / 100;
        }
        //int Bonus = Refill>1000 ? Refill / 100 : 0;

        int BonusBalance = Balance + Refill + Bonus;
        System.out.println("Итоговый счет: " + BonusBalance);
        System.out.println("Бонус: " + Bonus);
    }
}