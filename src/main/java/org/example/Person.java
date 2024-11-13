package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int boy;
    String gender;
    String sehir;

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(int boy,String gender,String sehir,String firstName ,String lastName,int age){
        this(firstName,lastName,age);
        this.gender=gender;
        this.boy=boy;
        this.sehir=sehir;

    }

    public String getFirstName(){
        return  this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }
    public int getAge (){
        return  this.age;
    }
    public boolean isTeen (){
        if (age>=13 && age <=19){
            return true;
        }
        else {return false;}
    }
}
