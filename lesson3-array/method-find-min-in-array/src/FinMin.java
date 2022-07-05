public class FinMin {
    public static void main(String[] args) {
        int[] array={1,2,6,3,4};
        System.out.println(findmin(array));
    }
    public static int findmin(int[] arr){
        int min= arr[0];
        for(int number:arr){
            if(number<min) min= number;
        }
        return min;
    }
}
