package org.example.designpatterns.builder;

public class ComputerOrders {
    public static void main(String[] args) {
        Computer.ComputerBuilder cb = new Computer.ComputerBuilder();

        Computer comp1 = cb.addHDD(HDD.TB_2).addRam(RAM.SMALL_GAMES).addUsbC(true).build();

        System.out.println(comp1);
    }
}
