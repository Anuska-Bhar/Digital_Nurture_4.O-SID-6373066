package forecast;

import java.util.HashMap;
import java.util.Map;
public class FinancialForecast {

    // recursive method
    public static double forecastRecursive(double currentValue, double growthRate, int periods) {
        if (periods == 0)
            return currentValue;
        return forecastRecursive(currentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    //top-down DP
    private static final Map<Integer, Double> memo = new HashMap<>();

    public static double forecastMemo(double initialValue, double growthRate, int periods) {
        if (periods == 0) return initialValue;
        if (memo.containsKey(periods)) return memo.get(periods);
        double result = forecastMemo(initialValue, growthRate, periods - 1) * (1 + growthRate);
        memo.put(periods, result);
        return result;
    }

    // bottom-up approach
    public static double forecastIterative(double initialValue, double growthRate, int periods) {
        double value = initialValue;
        for (int i = 0; i < periods; i++) {
            value *= (1 + growthRate);
        }
        return value;
    }
}