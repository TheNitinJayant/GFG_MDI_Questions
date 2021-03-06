package GFG_MDI_Questions.MD_Arrays;

import java.util.Arrays;

public class SortArrayOf012 {

    public void sort012(int a[], int n)
    {
        if(n==1){
            return;
        }

        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i=0;i<n;i++){
            if(a[i]==0){
                zero++;
            }
            else if(a[i]==1){
                one++;
            }
            else if(a[i]==2){
                two++;
            }
        }

//        Arrays.fill(a, 0, zero, 0);
//        Arrays.fill(a, zero, zero+one, 1);
//        Arrays.fill(a, zero+one, zero+one+two, 2);

        for (int i=0;i<zero;i++){
            a[i]=0;
        }
        for (int i=zero;i<one+zero;i++){
            a[i]=1;
        }
        for (int i=one+zero;i<zero+one+two;i++){
            a[i]=2;
        }

    }

    public void mainSortArrayOf012(){

        int[] x = {1,0,1,2,1,2,2,0,0};

        sort012(x, x.length);

        for (int i: x){
            System.out.print(i+" ");
        }

    }
}
