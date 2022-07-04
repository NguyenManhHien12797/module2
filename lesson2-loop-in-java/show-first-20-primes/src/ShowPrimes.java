
public class ShowPrimes {
    public static void main(String[] args) {
        int count=0;
        int i=0;
        while (count<20){
            if(Prime.isPrime(i)){
                count++;
                System.out.println(i);
            }
            i++;

        }

    }
}
