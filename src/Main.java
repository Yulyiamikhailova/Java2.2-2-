public class Main {
    public static void main(String[] args) {
        System.out.println("Мобильный кошелек");

        int amount = 100;
        int add = 1100;
        int total = amount + add;
        int bonus = add / 100;
        if (add > 1000) {
            add = 1000;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + (total + bonus) + " руб");
    }
}
