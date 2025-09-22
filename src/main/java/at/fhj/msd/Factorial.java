package at.fhj.msd;

public class Factorial {

    public static int findFactorial(int x){
        if(x<0)
            return -1;
        if (x==0)
            return 1;
        int result = 1;

        for (int i=0; i<= x;i++){
            result *= i;
        
        }
        return result;
    }
}