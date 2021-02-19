package GFG_MDI_Questions.MD_Math;

public class TrailingZeroesInFactorial {

    public int trailingZeroes(int n){
        int result = 0;
        int i = 1;
        double temp = n/Math.pow(5,i);
        while(temp!=0){
            temp = n/Math.pow(5,i);
            result = result + (int)Math.floor(temp);
            i++;
        }
        return result;
    }

    public void mainTrailingZeroesInFactorial(){
        System.out.println(trailingZeroes(100));
    }
}
