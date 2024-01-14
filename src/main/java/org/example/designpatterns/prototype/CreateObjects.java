package org.example.designpatterns.prototype;

public class CreateObjects {
    public static void main(String[] args) {
        Registry reg = new Registry();

        Movie movie1 = (Movie) reg.createItem(ItemType.MOVIE);

        System.out.println(movie1);
        System.out.println(movie1.getItemName());
        System.out.println(movie1.getDirector());

        Movie movie2 = (Movie) reg.createItem(ItemType.MOVIE);
        movie2.setDirector("Christopher Nolan");
        System.out.println(movie2);
        System.out.println(movie2.getItemName());
        System.out.println(movie2.getDirector());

    }
}
