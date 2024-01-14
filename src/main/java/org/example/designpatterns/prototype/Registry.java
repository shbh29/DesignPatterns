package org.example.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    
    private Map<ItemType, Item> items = new HashMap<>();

    Registry(){ loadItems(); }
    private void loadItems() {
        Movie movie = new Movie();
        movie.setDirector("Dan Millman");
        movie.setItemName("The Peaceful Warrior");

        Book book = new Book();
        book.setItemName("The Ordinary Moments");
        book.setNoOfPages(140);

        items.put(ItemType.MOVIE, movie);
        items.put(ItemType.BOOK, book);
    }

    public Item createItem(ItemType itype) {
        Item item;

        try {
            item = (Item) (items.get(itype)).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return item;
    }
}
