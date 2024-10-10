import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {

        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int maxValue = 0;
        for(int i = 0; i < retailEstimatesTonnesPerYear.length; i++){
            if(retailEstimatesTonnesPerYear[i] > maxValue){
                maxValue = retailEstimatesTonnesPerYear[i];
            }
        }
        return maxValue;
    }

    //maxRetailEstimateTonnesPerYear
    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        // find the countries index
        for(int i = 0; i < countries.length; i ++){
            if(countries[i].equals(country)){
                return(totalWasteKgPerCapitaPerYear[i]);
            }
        }
        return -1;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear) {
        int maxWaste = 0;
        int indexOf = 0;
        for(int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++){
            if(totalWasteKgPerCapitaPerYear[i] > maxWaste){
                maxWaste = totalWasteKgPerCapitaPerYear[i];
                indexOf = i;
            }
        }
        return countries[indexOf];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double maxPov = 0;
        int indexOf = 0;
        int arrayLength = 0;
        int indexing = 0;
        String[] highestC = new String[countries.length];  // length 5
        int z = 0;
            for (int i = 0; i < percentagesShareInPoverty.length; i++) {
                if (percentagesShareInPoverty[i] > maxPov) {
                    maxPov = percentagesShareInPoverty[i];
                    indexOf = i;
                }
            }
            for(int i = 0; i<percentagesShareInPoverty.length; i++){
                if(percentagesShareInPoverty[i] == maxPov){
                    arrayLength++;
                }
            }
            String[] balls = new String[arrayLength];
        for(int i = 0; i<percentagesShareInPoverty.length; i++){
            if(percentagesShareInPoverty[i] == maxPov){
                balls[indexing] = String.valueOf(countries[i]);
                indexing++;
            }
        }
            return balls;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        StringBuilder twoballs = new StringBuilder();
        for(int i = 0; i < countries.length; i ++){
            if(confidences[i].equals("High Confidence")){
                twoballs.append(countries[i]).append("Ben Dover");
            }

        }
        String[] threeballs = twoballs.toString().split("Ben Dover");
        return threeballs;
    }
}
