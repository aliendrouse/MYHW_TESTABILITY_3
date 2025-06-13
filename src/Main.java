public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();

        // Скриншот 1: сумма 1_000_000 ₽, ставка 9.99 %, срок 1 год (12 месяцев)
        double payment1 = calculator.calculate(1_000_000, 9.99, 12);
        System.out.println("Ежемесячный платёж: " + (int) payment1 + " ₽");


        // Скриншот 2: сумма 1_000_000 ₽, ставка 9.99 %, срок 2 года (24 месяца)
        double payment2 = calculator.calculate(1_000_000, 9.99, 24);
        System.out.println("Ежемесячный платёж: " + (int) payment2 + " ₽");


        // Скриншот 3: сумма 1_000_000 ₽, ставка 9.99 %, срок 3 года (36 месяцев)
        double payment3 = calculator.calculate(1_000_000, 9.99, 36);
        System.out.println("Ежемесячный платёж: " + (int) payment3 + " ₽");
    }
}