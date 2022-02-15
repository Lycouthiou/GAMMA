public class fizzbuzz {
        public static int dizaine(int i){
                return i/10;
        }
        public static int unite(int i){
                return i%10;
        }
        public static void fizzbuzz(int n){

                if (n > 100){}
                else if (n%3 ==0 || (unite(n) - 3 == 0) || (dizaine(n) -3 == 0) || n%5 ==0  || (unite(n) - 5 == 0) || (dizaine(n) - 5 == 0)) {
                        if (((n % 3 == 0)   || (unite(n) - 3 == 0) || (dizaine(n) -3 == 0)) &&  ((n % 5 == 0) || (unite(n) - 5 == 0) || (dizaine(n) -5 == 0))){
                                System.out.println("FizzBuzz");
                        }
                        else if ((n % 3 == 0) || (unite(n) -3 == 0) || (dizaine(n) -3 == 0)) {
                                System.out.println("Fizz");
                        }
                        else {
                                System.out.println("Buzz");
                        }
                       fizzbuzz(n+1);
                }
                else {
                        System.out.println(n);
                       fizzbuzz(n+1);
                }
        }
        public static void main(String args[] ){
               fizzbuzz(1);
        }

}
