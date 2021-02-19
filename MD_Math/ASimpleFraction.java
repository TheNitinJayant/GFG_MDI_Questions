package GFG_MDI_Questions.MD_Math;

import java.util.HashMap;
import java.util.Map;

public class ASimpleFraction {

    public String fractionToDecimal(int numerator, int denominator)
    {
        StringBuilder answer = new StringBuilder();
        if (numerator < 0 || denominator < 0){
            answer.append("-");
        }

        int q = numerator/denominator;
        int r = numerator % denominator;

        answer.append(q);

        if(r==0){
            return answer.toString();
        }
        else {
            answer.append(".");
        }

        Map<Integer, Integer> hashMap = new HashMap<>();

        while (r!=0){
            if(hashMap.containsKey(r)){
                int len = hashMap.get(r);
                answer.insert(len,"(");
                answer.append(")");
                break;
            }
            else {
                hashMap.put(r, answer.length());
                r = r * 10;
                q = r / denominator;
                r = r % denominator;
                answer.append(q);
            }
        }

        return answer.toString();
    }

    public void mainASimpleFraction(){
        int n = 14;
        int d = 3;

        System.out.println(fractionToDecimal(14,3));
    }
}
