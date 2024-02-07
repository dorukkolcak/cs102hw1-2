public class ArrayUtilities {

    public static int[] createRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i ++)
        {
            arr[i] = (int)(Math.random()* 100);
        }
        return arr;
    }

    public static String findAverage(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        double result = Double.valueOf(sum) / a.length;
        result = Math.round(result);
        return Double.toString(result);
    }
    public static double[] findDiffer(int a[]){
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
            if (n > maxValue)
            {
                maxValue = n;
            }
        }
        return maxValue;
    }

    public static int sumOfOdds(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 1){
                sum += arr[i];
            }
        }
        return sum;
    }    

    public static int sumOfEvens(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }   
}
