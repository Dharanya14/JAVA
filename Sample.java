public class Sample {
    public static void main(String[] args) {

        
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            if (!isInteger(args[i])) {
                System.out.println("Invalid input. Please enter valid integers.");
                return;
            }
            numbers[i] = Integer.parseInt(args[i]);
        }

        
        int[][] array = new int[2][2];
        array[0][0] = numbers[0];
        array[0][1] = numbers[1];
        array[1][0] = numbers[2];
        array[1][1] = numbers[3];

        
        System.out.println("The given array is:");
        printArray(array);

       
        int[][] reversedArray = new int[2][2];
        reversedArray[0][0] = array[1][1];
        reversedArray[0][1] = array[1][0];
        reversedArray[1][0] = array[0][1];
        reversedArray[1][1] = array[0][0];

        
        System.out.println("The reverse of the array is:");
        printArray(reversedArray);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
