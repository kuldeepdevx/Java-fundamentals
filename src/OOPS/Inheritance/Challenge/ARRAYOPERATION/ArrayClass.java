package OOPS.Inheritance.Challenge.ARRAYOPERATION;
import java.util.Arrays;

public class ArrayClass{
    private int[] data;
    private final Statistics stats = new Statistics();

    public ArrayClass(int[] data){
        this.data=data;
    }

    void printArray(){
        System.out.println(Arrays.toString(data));
    }

    public double median(){
        return stats.median();
    }

    public double mean(){
        return stats.mean();
    }

    private class Statistics{

         private double median(){
             int[] sorted=data.clone();
            Arrays.sort(sorted);
            if(sorted.length%2!=0) {
                int mid = sorted.length / 2;
                return sorted[mid];
            }
            int mid=sorted.length/2;
            return (sorted[mid]+sorted[mid-1])/2.0;
        }

        private double mean(){

             double sum=0;
             for(int x: data){
                 sum+=x;
             }
             return sum/data.length;
        }
    }
}