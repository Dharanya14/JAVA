public class succedingOrder {
    public static void main(String[] args){
    
        int arr[]={10,3,6,1,2,7,9};
        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                ignore = true; // Start ignoring elements
            }
            
            if (!ignore) {
                sum += arr[i]; // Add to sum if not ignoring
            }

            if (arr[i] == 7) {
                ignore = false; // Stop ignoring elements after 7
            }
        }
        System.out.println(sum);

    }
}
