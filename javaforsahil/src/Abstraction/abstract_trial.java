package Abstraction;

abstract class Animal {

    abstract void sound();



}



public class abstract_trial{

    public static void main(String[] args) {

        Animal cat= new Animal(){ /// Anonymous class



        void sound(){

            System.out.println("Maow");

        }

        };

        cat.sound();

    }

}