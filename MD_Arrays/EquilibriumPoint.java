package GFG_MDI_Questions.MD_Arrays;

public class EquilibriumPoint {

    public int equilibriumPoint(long arr[], int n) {

        if(n==1){
            return 1;
        }

        long sumOfArray = 0;

        for(int i=0;i<n;i++){
            sumOfArray+=arr[i];
        }

        if(sumOfArray-arr[0]==0){
            return 1;
        }

        long leftSum = 0;
        long rightSum = sumOfArray;

        for(int i=0;i<n-1;i++){
            leftSum = leftSum+arr[i];
            rightSum = sumOfArray - leftSum - arr[i+1];

            if(leftSum==rightSum){
                return i+2;
            }
        }

        return -1;
    }

    public void mainEquilibriumPoint(){

        long[] x = {-1,2,1,0,-5,7};

        System.out.println(equilibriumPoint(x, x.length));
    }
}