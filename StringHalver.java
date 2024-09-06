public class StringHalver {
    
    public static void main(String[] args) {
        String input1 = "TomCat";
        String input2 = "Apron";
        
        
        System.out.println(getFirstHalfOrNull(input1)); 
        System.out.println(getFirstHalfOrNull(input2)); 
    }

    
    public static String getFirstHalfOrNull(String str) {
        
        if (str == null || str.isEmpty()) {
            return null;
        }
        
       
        int length = str.length();
        
        
        if (length % 2 == 0) {
           
            return str.substring(0, length / 2);
        } else {
            
            return null;
        }
    }
}
