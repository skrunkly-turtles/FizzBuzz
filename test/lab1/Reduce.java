package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    private static int reduce(int n) {
        int steps = 0;
        while(n > 0){
            if(n % 2 == 1){
                n -= 1;
            }
            else{
                n /= 2;
            }
            steps += 1;
        }
        return steps;
    }
}
