package GFG_MDI_Questions.MD_Arrays;


import  java.util.*;

public class MajorityElement {

    public int majorityElementUsingHashmap(int[] arr, int n){

        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0;i<n;i++){
            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i])+1;
                if(count>(n/2)){
                    return arr[i];
                }
                else {
                    hashMap.put(arr[i], count);
                }
            }
            else {
                hashMap.put(arr[i], 1);
            }
        }

        return -1;
    }

    public int majorityElement(int a[], int size)
    {
        // your code here

        if(size==0){
            return -1;
        }

        if(size==1){
            return a[0];
        }

        return majorityElementUsingHashmap(a, size);
    }

    public void mainMajorityElement(){

        int[] x = {3,12, 5,3,2};

        System.out.println(majorityElement(x, x.length));
    }
}
