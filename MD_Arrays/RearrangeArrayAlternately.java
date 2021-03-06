package GFG_MDI_Questions.MD_Arrays;

public class RearrangeArrayAlternately {

    //  dividend = quotient * divisor + remainder

    // dividend / divisor = quotient
    // dividend % divisor = remainder

    // using these formulas we will store 2 values at the same index by letting quotient to be the new value and remainder to be the old value.



    public static void rearrange(int arr[], int n){

        int max = arr[n-1] + 1; // making max +1 so that we can get the elements as it is if we module it with max

        int maxIndex = n-1;
        int minIndex = 0;

        for(int i=0;i<n;i++){

            if(i%2==0){
                arr[i] = ( arr[maxIndex] % max ) * max + arr[i];
                //              dividend     *   divisor + remainder
                maxIndex--;
            }

            else if(i%2!=0){
                arr[i] = ( arr[minIndex] % max ) * max + arr[i];
                //              dividend     *   divisor + remainder
                minIndex++;
            }
        }

        for(int i=0;i<n;i++){
            arr[i]/=max;
        }

    }

    public void mainRearrangeArrayAlternately(){
        int[] x = {10,20,30,40,50,60,70,80,90,100,110};

        rearrange(x, x.length);

        for(int i:x){
            System.out.print(i+" ");
        }
    }
}