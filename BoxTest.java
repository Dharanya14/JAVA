public class Box {
    
    private double width;
    private double height;
    private double depth;

    
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    
    public double getVolume() {
        return width * height * depth;
    }

    public void displayDimensions() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
    }
}

public class BoxTest{
    public static void main(String[] args) {

        Box box = new Box(5.0, 10.0, 3.0);

        
        System.out.println("Box Dimensions:");
        box.displayDimensions();

        
        double volume = box.getVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
