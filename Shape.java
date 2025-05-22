import java.util.Scanner;
public class Shape {
    int length;
    int width;


    public Shape(){
        System.err.println("Default Construction");
    }

    public Shape (int length, int width){
        this.length = length;
        this.width = width;
        System.out.println(this.length*this.width);
    }

    public Shape (int length){
        this.length = length;
        System.out.println(this.length*this.length);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gime me the length: ");
        int length = input.nextInt();
        System.out.println("Gime me the width: ");
        int width = input.nextInt();

        Shape S1 = new Shape();
        Shape S2 = new Shape(length,width);
        Shape S3 = new Shape(length);
    }

}