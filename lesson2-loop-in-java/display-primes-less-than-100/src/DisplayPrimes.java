public class DisplayPrimes {
    public static void main(String[] args) {
        int i= 0;
            while (i<= 100){
                if(Prime.isPrime(i)){
                    System.out.println(i);
                }
                i++;
            }
    }
}
