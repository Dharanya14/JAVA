public class WelcomeMessage {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Usage: java WelcomeMessage <Name>");
            return;
        }

  
        String name = args[0];

        
        String welcomeMessage = "Welcome " + name;

        
        System.out.println(welcomeMessage);
    }
}
