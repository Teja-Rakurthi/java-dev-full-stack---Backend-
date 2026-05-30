public class Fibnac {

    static int Fib(int n){

        if(n <= 1){
            return n;
        }

        return Fib(n-1) + Fib(n-2);
    }

    public static void main(String[] args){

        int num = 5;

        for(int i = 0; i <= num; i++){
            System.out.print(Fib(i) + " ");
        }
    }
}