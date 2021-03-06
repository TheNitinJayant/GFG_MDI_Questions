package GFG_MDI_Questions.MD_Arrays;

import java.util.*;

public class LeadersInAnArray {

    public ArrayList<Integer> leaders(int arr[], int n){

        int maxToRight = arr[n-1];
        ArrayList<Integer> result = new ArrayList<>();
        result.add(maxToRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxToRight){
                result.add(arr[i]);
                maxToRight = arr[i];
            }
        }

        Collections.reverse(result);
        return result;
    }

    public void mainLeadersInAnArray(){
        int[] x = {1,2,3,4,0};

        System.out.println(leaders(x, x.length));
    }
}
