package GFG_MDI_Questions.MD_Arrays;

import java.util.*;

public class PlusOne {

    public ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here

        if(arr.get(0)==0){
            arr = new ArrayList<>();
            arr.add(1);
            return arr;
        }

        String numberString = "";

        int zeroCount = 0;

        for(int i=0;i<N;i++){
            if(arr.get(i)==0 && numberString.equals("")){
                zeroCount++;
            }
            else {
                numberString=numberString+arr.get(i);
            }
        }

        int correctionFactionInitial = numberString.length();

        numberString = String.valueOf( Integer.parseInt(numberString) + 1 );

        int correctionFactorFinal = numberString.length();
        int correctionFactor = correctionFactorFinal - correctionFactionInitial;

        arr = new ArrayList<>();

        for (int i=0;i<zeroCount-correctionFactor;i++){
            arr.add(0);
        }

        for (int i=0;i<numberString.length();i++){
            Character ch = numberString.charAt(i);
            Integer temp = Integer.parseInt(ch.toString());
            arr.add(temp);
        }

        return arr;
    }

    public void mainPlusOne(){

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(9);
        arr.add(9);

        ArrayList<Integer> al = increment(arr, arr.size());

        System.out.println(al);
    }

}
