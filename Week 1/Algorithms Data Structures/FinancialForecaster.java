/*
    Recursive Algorithm
    - Recustion: technique where a function calls itself to solve smaller instances of the same problem
    - Every recursive algorithm relies on a base case (to stop infinite execution) and a recursive step (to break the problem down)

    How it simplifies problems
    - Allows you to express complex, repetitive logic (like compound growth over time) in a clean, declarative way
    - Instead of managing loop counters, you define the direct mathematical relationship between the current state and the previous state
*/

import java.util.HashMap;
import java.util.Map;

public class FinancialForecaster {
    /*
        Calculate Future Value using Standard Recursion
        - Formula: futureValue(n) = futureValue(n-1) * (1 + rate)
        - Base Case: 0 periods into the future means no growth is applied, return initial value
    */
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        if (periods <= 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
    }

    /*
        Memoization Cache
        - Stores previously computed values for complex recursive models to prevent redundant calculations
    */
    private final Map<Integer, Double> cache = new HashMap<>();

    /*
        Calculate future value using optimized recursion (Memoization)
        - Checks if the period has already been calculated
        - If not, calculates it, stores it in the cache, and returns it
    */
    public double calculateFutureValueOptimized(double presentValue, double growthRate, int periods) {
        if (periods <= 0) {
            return presentValue;
        }
        if (cache.containsKey(periods)) {
            return cache.get(periods);
        }
        double result = calculateFutureValueOptimized(presentValue, growthRate, periods - 1) * (1 + growthRate);
        cache.put(periods, result);
        return result;
    }

    public static void main(String[] args) {
        FinancialForecaster forecaster = new FinancialForecaster();
        
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.05;
        int years = 10;
        
        double projectedValue = forecaster.calculateFutureValue(initialInvestment, annualGrowthRate, years);
        System.out.printf("Projected value after %d years (Standard): $%.2f\n", years, projectedValue);

        double projectedValueOpt = forecaster.calculateFutureValueOptimized(initialInvestment, annualGrowthRate, years);
        System.out.printf("Projected value after %d years (Optimized): $%.2f\n", years, projectedValueOpt);
    }
}

/*
    Time and Space Complexity Analysis
    - Standard Recursion Time Complexity: O(n). It makes exactly one recursive call per period, while naive recursion can explode to O(2^n)
    - Standard Recursion Space Complexity: O(n). Each recursive call consumes memory on the call stack

    Optimization
    - Using Memoization (caching) avoids excessive computation. If the tool frequently needs to pull data for overlapping forecast periods, it fetches stored results in O(1) time instead of recalculating the recursive tree
*/