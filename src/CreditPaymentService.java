public class CreditPaymentService {
    public double calculate(double creditAmount, double creditRateForYear, int creditMonths) {
        double monthlyRate = creditRateForYear / 12 / 100;
        double annuityCoefficient = (monthlyRate * Math.pow(1 + monthlyRate, creditMonths)) /
                (Math.pow(1 + monthlyRate, creditMonths) - 1);
        return creditAmount * annuityCoefficient;
    }
}