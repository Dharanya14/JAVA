public class ShortLongShort {

    public static void main(String[] args) {
        String a = "hi";
        String b = "hello";
        
    
        String result = shortLongShort(a, b);
        System.out.println(result); 
    }

    
    public static String shortLongShort(String a, String b) {
        
        String shortStr;
        String longStr;
        
        if (a.length() < b.length()) {
            shortStr = a;
            longStr = b;
        } else {
            shortStr = b;
            longStr = a;
        }

        
        return shortStr + longStr + shortStr;
    }
}
