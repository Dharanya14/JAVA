public class Sample23 {
    public static void main(String[] args) {

        
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            if (!isInteger(args[i])) {
                System.out.println("Invalid input. Please enter valid integers.");
                return;
            }
            numbers[i] = Integer.parseInt(args[i]);
        }

        
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = numbers[i * 3 + j];
            }
        }

        
        System.out.println("The given array is:");
        printArray(array);

        
        int biggest = findBiggestNumber(array);

        
        System.out.println("The biggest number in the given array is " + biggest);
    }

    
    private static void printArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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

    
    private static int findBiggestNumber(int[][] array) {
        int biggest = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > biggest) {
                    biggest = array[i][j];
                }
            }
        }
        return biggest;
    }
}
