public class ArrayUtilities {


    public String findAverage(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        double result = Double.valueOf(sum) / a.length;
        result = Math.round(result);
        return Double.toString(result);
    }
    public double[] findDiffer(int a[]){
        Double average = Double.parseDouble(findAverage(a));
        double[] differArray = new double[a.length];
        for (int i = 0; i < a.length; i++){
            differArray[i] = a[i] - average;
        }
        return differArray;
    }


    public static int min(int[] a)
    {
        int minValue = a[0];
        for (int n : a)
        {
            if (n < minValue)
            {
                minValue = n;
            }
        }
        return minValue;
    }

    public static int max(int[] a)
    {
        int maxValue = a[0];
        for (int n : a)
        {
            if (n < maxValue)
            {
                maxValue = n;
            }
        }
        return maxValue;
    }
    
}
