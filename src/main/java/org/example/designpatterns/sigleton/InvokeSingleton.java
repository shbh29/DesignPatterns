package org.example.designpatterns.sigleton;

public class InvokeSingleton {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();

        System.out.println(instance);


    }
}
