package lectures.lec3;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return height*width;
    }
    public double getPerimiter(){
        return 2*(height+width);
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void printRectangleData(){
        System.out.println("The height is : " + height +"\n" + "The width is : " + width);
    }



}
