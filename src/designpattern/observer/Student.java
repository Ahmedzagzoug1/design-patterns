/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer;

/**
 *
 * @author zagzo
 */
public class Student implements Observer{
   private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name +" has a new notify "+ message);
    }
    
    
}
