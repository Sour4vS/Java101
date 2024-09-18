package sour4v.java;

public class SumAvg_Array {
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5};
        int length = array.length;
        int sum = 0;
        for (int i=0;i<length;i++) {
            sum+=array[i];
        }
        System.out.println("sum="+sum);
        float avg =(float) sum/length;
        System.out.println("avg="+avg);
    }
}
