import java.util.Scanner;

public class AreaofShape {
    private static final double pi=3.14;
    private static double circleArea1;
    private static double triaArea,rectaArea,squaArea;
    public static double circleArea(double r){
         circleArea1=pi*r*r;
        return circleArea1;
    }
    public static double triangleArea(double b,double h){
         triaArea=(b*h)/2;

    return triaArea;
    }
    public static double rectArea(double l, double w){
         rectaArea=l*w;
        return rectaArea;
    }
    public static double SquareArea(double a){
         squaArea=a*a;
        return squaArea;
    }
    public static void main(String args[]){
        int UserInput;
        double radius;           //circle Area
        double base, height;    //Triangle Area
        double length,width;    //rectangle Area
        double oneside_length;  //for square Area
        Scanner xx=new Scanner(System.in);
        do{
        System.out.println("--------CHOICE THE SHAPE U WANT THE AREA FOR---------");
        System.out.println("-----------------------------------------------------");
        System.out.println("--PLEASE TYPE[1] TO CALCULATE THE AREA OF CIRCLE----- ");
        System.out.println("--PLEASE TYPE[2] TO CALCULATE THE AREA OF TRIANGLE---");
        System.out.println("--PLEASE TYPE[3] TO CALCULATE THE AREA OF RECTANGLE--");
        System.out.println("--PLEASE TYPE[4] TO CALCULATE THE AREA OF SQUARE-----");
        System.out.println("--PLEASE TYPE[0] TO EXIT THE PROGRAM-----------------");
        System.out.println("-----------------------------------------------------");

        UserInput=xx.nextInt();
        switch (UserInput) {

            case 1:
                System.out.println("--YOU'RE ABOUT TO CALCULATE THE AREA OF CIRCLE---");
                System.out.println("--Please type in the radius of your circle-------");
                radius = xx.nextDouble();
                circleArea(radius);
                System.out.println("The Area of your Circle with radius " + radius + " is:" + circleArea1);
                break;
            case 2:
                System.out.println("--you're About to calculte the Area of triangle---");
                System.out.println("--please type in base of your triangle------------");
                base = xx.nextDouble();
                System.out.println("--please type in height of your triangle----------");
                height = xx.nextDouble();
                triangleArea(base, height);
                System.out.println("The Area of triangle with base " + base + " and height " + height + " is:" + triaArea);
                break;
            case 3:
                System.out.println("--you're About to calculate the area of rectangle--");
                System.out.println("---please type in the length of your rectangle-----");
                length = xx.nextDouble();
                System.out.println("---please type in the width of your rectangle------");
                width = xx.nextDouble();
                rectArea(length, width);
                System.out.println("the Area of rectangle with length " + length + " and width " + width + " is:" + rectaArea);
                break;
            case 4:
                System.out.println("---youre About to calculate the Area of square----");
                System.out.println("----please type in the length of one-side square--");
                oneside_length = xx.nextDouble();
                SquareArea(oneside_length);
                System.out.println("the Area of square with one side length " + oneside_length + " is:" + squaArea);
                break;
            default:
        }

    }while (UserInput!=0);

}}
