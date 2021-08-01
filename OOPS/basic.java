
public class basic
{
	int a = 20;
    int b = 30;
    public static void main(String[] args) {}
    private void run(){}
    private void bark(){}
    private int add(){return a+b;}
    private String greeting(){return "Hello dear";}

// Student Resgister
    Student s1 = new Student("Bhaskar",13,"12th");

    Student s2 = new Student("Uttam",7,"11th");

    Student s3 = new Student("Ajay",11,"8th");

    System.out.println("Student 1 "+s1.getStudent());
    System.out.println("Student 2 "+s2.getStudent());
    System.out.println("Student 3 "+s3.getStudent());

}

class Student {

    String name;
    int rollNo;
    String className;

    //Constructor

    Student(String name, int rollNo, String className){

        this.name = name;
        this.rollNo = rollNo;
        this.className = className
    }


    private String getStudent(){
        // Name = Bhaskar RollNo 13 class name = 7
        return "Name = "+name+" RollNo "+rollNo+" class name = "+className;
    }

}


//Access modiefier????????




// class (basic)
// A class is a collection of number of methods and it's variables


// Method (main,run,bark,add,greeting)
// it's function which tells what to do?


// Constructor 

//1 it shouldn't have its return type
//2 constructor name should be same as class Name

// Use 
// to pass data from one class to another class


// Object

// use to call method of another class
// it's intiallize using new keyword


