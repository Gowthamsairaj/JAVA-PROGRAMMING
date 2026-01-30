class Rectangle {

    
    private int length;
    private int breadth;


    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

  
    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public void display() {
        System.out.println("Rectangle: " + length + " x " + breadth);
    }

   
    public int calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println("Area: " + r1.calculateArea());

        Rectangle r2 = new Rectangle(5);
        r2.display();
        System.out.println("Area: " + r2.calculateArea());

        Rectangle r3 = new Rectangle(4, 6);
        r3.display();
        System.out.println("Area: " + r3.calculateArea());
    }
}