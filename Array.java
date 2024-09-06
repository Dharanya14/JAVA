import java.util.Arrays;

public class Array{
    public static void main(String[] args){
        int[] a={2,9,1,7,8,8};
        int n=a.length;
        if(n<2){
            System.out.println("enter more than 2 elements");
        }
        Arrays.sort(a);
        System.out.println("first largest: "+a[n-1]);
        if(a[n-1]==a[n-2]){
            System.out.println("no second largest elem");
        }
        else{
            System.out.println("second largest: "+a[n-2]);
        }

        System.out.println("first smallestL :"+a[0]);
        if(a[0]==a[1]){
            System.out.println("no second smallest elem");
        }
        else{
            System.out.println("second largest: "+a[1]);
        }
    
    }
}