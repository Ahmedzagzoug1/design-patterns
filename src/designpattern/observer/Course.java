/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.observer;

import java.util.ArrayList;

/**
 *
 * @author zagzo
 */
public class Course implements Subject{
    
    private String name;
    private String availability;
    private ArrayList<Observer> observerList; 

    public Course(String name) {
        this.name = name;
        observerList=new ArrayList<>();
    }

    @Override
    public void subsribe(Observer observer) {

        observerList.add(observer);
    }

    @Override
    public void unsubsribe(Observer observer) {
observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for(Observer observer : observerList){
            observer.update(availability);
        }

    }
  public void setAvailability(boolean availability){
       this.availability = this.name+(availability?" is available" :  " is not available");
       notifyAllSubscribers();
   } 
    
}
