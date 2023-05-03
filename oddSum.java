public class oddSum {
    public static void main(String []args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int oddSum  = 0;
        int evenSum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2 != 0){
                oddSum = oddSum + arr[i];
            }
            if(i%2 == 0){
                evenSum = evenSum+arr[i];
            }
        }
        System.out.println("Odd Sum: "+oddSum);
        System.out.println("Even Sum: "+evenSum);
    }
}
