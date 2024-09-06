public class StringConcatenator {

    public static void main(String[] args) {
        String str1 = "Sachin";
        String str2 = "Tendulkar";
        
       
        String result = concatenateAndProcess(str1, str2);
        System.out.println(result);

        
        String str3 = "Mark";
        String str4 = "kate";
        String result2 = concatenateAndProcess(str3, str4);
        System.out.println(result2);
    }

    
    public static String concatenateAndProcess(String str1, String str2) {
      
        String concatenated = str1 + str2;
        concatenated = concatenated.toLowerCase();

    
        StringBuilder processed = new StringBuilder();
        for (int i = 0; i < concatenated.length(); i++) {
            if (i == 0 || concatenated.charAt(i) != concatenated.charAt(i - 1)) {
                processed.append(concatenated.charAt(i));
            }
        }

        return processed.toString();
    }
}
