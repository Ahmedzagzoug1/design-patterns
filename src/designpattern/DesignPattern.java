/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.observer.Course;
import designpattern.observer.Student;

/**
 *
 * @author zagzo
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        runObserver();
    }
    public static void runObserver(){
        Student s1=new Student("Ahmed");
        Student s2=new Student("Ali");
        Student s3=new Student("Khaled");
        Student s4=new Student("Ebrahim");
        Student s5=new Student("Mohmmed");
        
        Course maths= new Course("Math");
        maths.subsribe(s1);
        maths.subsribe(s2);
        maths.subsribe(s3);
        maths.subsribe(s4);
        maths.subsribe(s5);
        
        maths.unsubsribe(s5);
        maths.setAvailability(true);

    }
    
}
