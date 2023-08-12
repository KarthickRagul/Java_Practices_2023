package org.example;

class Student  {
    int roll_no;  // These are instance variables
    String name;
    int marks;
}

public class String_Array_Examples {
    public static void main(String args[]){

        Student student1 = new Student(); //Object of the Student class
        student1.roll_no = 1;
        student1.name = "Karthick";
        student1.marks = 100;

        Student student2 = new Student();
        student2.roll_no = 2;
        student2.name = "Ragul";
        student2.marks = 98;

        Student student3 = new Student();
        student3.name = "Mohan";   //If roll_no is not defined, default will be Zero
        student3.marks = 90;

        Student students[] = new Student[3]; //Array of Student
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
//        for (int i=0; i<students.length;i++){  // Normal for loop
//            System.out.println(students[i].roll_no +" : "+students[i].marks);
//        }
        for(Student s: students){   // Enhanced for loop
            System.out.println(s.roll_no+" : "+s.name+" : "+s.marks);
        }

    }
}
