
package com.mycompany.homework3.ders;


public class Main {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setId(1);
        student1.setFirstName("İrem");
        student1.setLastName("Cakcak");
        student1.setEmail("ii@yahoo.com");
        student1.setPassword("i4875");
        student1.setCamp("Java");
        
        Instructor instructor=new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setPassword("ed8972");
        instructor.setEmail("engindemirog@gmail.com");
        instructor.setGivencamp("Java");
        
        StudentManager stdudentManager=new StudentManager();
        stdudentManager.add(student1);
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor);
        
    }
}
