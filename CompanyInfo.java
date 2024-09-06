public class CompanyInfo {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Usage: java CompanyInfo <CompanyName> <Location>");
            return;
        }

       
        String companyName = args[0];
        String location = args[1];

       
        String result = companyName + " Technologies " + location;

    
        System.out.println(result);
    }
}
