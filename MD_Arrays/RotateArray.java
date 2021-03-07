package GFG_MDI_Questions.MD_Arrays;

public class RotateArray {

    public void rotateArrayByOneAntiClockwise(int[] arr, int n){
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    public void rotateArrayByNAntiClockwise(int[] arr, int n){


    }

    public void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        for (int i=0;i<d;i++){
            rotateArrayByOneAntiClockwise(arr, n);
        }
    }

    public void mainRotateArray(){

        int[] x = {1,2,3,4,5};

        rotateArr(x, 2, x.length);
        for(int i: x){
            System.out.print(i+" ");
        }

    }

}
