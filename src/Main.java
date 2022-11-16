public class Main {
    public static void main(String[] args) {

        int price = 10_000;
        int oneMiles = 20;
        int bonusMiles = price / oneMiles;
        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}