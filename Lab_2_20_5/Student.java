package Lab_2_20_5;

public class Student {
    

     String name;
     int id;
     float cgpa;


    void display(){

        System.out.println("The name of the student is: " + this.name);
        System.out.println("The id of the student is: " + this.id);
        System.out.println("The cgpa of the student is: " + this.cgpa);
    }

    void setValue(String name, int id, float cgpa){

        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    float getCGPA(){

        return this.cgpa;
    }

/* 
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Student std3= new Student();
        System.out.println("Enter you name: ");
        std3.name = sc.next();
        System.out.println("Enter you id: ");
        std3.id = sc.nextInt();
        System.out.println("Enter you cgpa: ");
        std3.cgpa = sc.nextFloat();
        std3.display();
        System.out.println("\n");


        Student std1= new Student();
        std1.setValue("Nahiyan",570, 3.8f);
        std1.display();
        float cgpa = std1.getCGPA();
        System.out.println(std1.getCGPA());
        System.out.println("\n");


        Student std2= new Student();
        std2.name= "Supti";
        std2.id = 27;
        std2.cgpa= 3.6f;
        std2.display();

        }

        */

}