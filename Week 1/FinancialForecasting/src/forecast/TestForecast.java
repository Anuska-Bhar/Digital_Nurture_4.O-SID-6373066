package forecast;

public class TestForecast {
    public static void main(String[] args) {
        double initial = 10000.0;
        double rate = 0.07; //annual growth
        int years = 10;

        double result1 = FinancialForecast.forecastRecursive(initial, rate, years);
        double result2 = FinancialForecast.forecastMemo(initial, rate, years);
        double result3 = FinancialForecast.forecastIterative(initial, rate, years);

        System.out.printf("Recursive Forecast after %d years: %.2f%n", years, result1);
        System.out.printf("Memoized Forecast after %d years: %.2f%n", years, result2);
        System.out.printf("Iterative Forecast after %d years: %.2f%n", years, result3);

        System.out.println("\n[Analysis]");
        System.out.println("Recursive Time Complexity: O(n), with repeated calls");
        System.out.println("Memoized Time Complexity: O(n), optimized with cache");
        System.out.println("Iterative Time Complexity: O(n), most efficient for large n");
    }
}