package GFG_MDI_Questions.MD_Math;
import java.util.*;

public class MissingNumberInArray {
    public int missingNumber(int[] C){
        for(int i=0;i<C.length;i++){
            if(C[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
    public void mainMissingNumberInArray(){
        Scanner r = new Scanner(System.in);

        int t = r.nextInt();
        int[] results = new int[t];

        for(int i=0;i<t;i++){
            int s = r.nextInt();
            int[] temp = new int[s-1];

            for(int j=0;j<s-1;j++){
                temp[j]=r.nextInt();
            }

            results[i] = missingNumber(temp);
        }

        for (int i=0;i<t;i++){
            System.out.println(results[i]);
        }
    }
}
