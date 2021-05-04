
package com.mycompany.homework3.ders;

public class StudentManager extends UserManager {
    public void add(Student student){
        System.out.println("Öğrenci" +" "+ student.getFirstName() +student.getLastName()+" "+ "kaydedildi.");
        //Öğrenci " + student.getName()+ " " + student.getSurname() + " " + "olarak kaydedildi."
    }
    
    
}
