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
    
}
