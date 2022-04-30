import java.util.ArrayList;

public class AlgorithmTimeAnalysis {
    public static void main(String[] args) {
        ArrayList<Long> resultSumIter = new ArrayList<>();
        ArrayList<Long> resultSumGauss = new ArrayList<>();
        final int NUMMAX = 1000000000;

        for (long i = 100; i <= NUMMAX; i*= 10){
            long startTime = System.nanoTime();
            sumatoria0aN(i);
            long endTime = System.nanoTime();
            resultSumIter.add(endTime - startTime);
        }

        for (long i = 100; i <= NUMMAX; i*= 10){
            long startTime = System.nanoTime();
            gauss(i);
            long endTime = System.nanoTime();
            resultSumGauss.add(endTime - startTime);
        }
        showResult("Sumatoria Iterariva", resultSumIter);
        showResult("\nSumatoria Gauss", resultSumGauss);
    }

    public static long sumatoria0aN(long n){
        long sumatoria = 0;
        for (int i = 0; i <= n; i++)
            sumatoria += i;
        return sumatoria;
    }

    public static long gauss(long n){
        long sumatoria = n * (n + 1) / 2;
        return sumatoria;
    }

    public static void showResult(String methodName, ArrayList<Long> result){
        System.out.println(methodName);
        for (Long r : result)
            System.out.println(r);
    }



}
