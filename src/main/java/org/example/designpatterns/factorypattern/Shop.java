package org.example.designpatterns.factorypattern;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Website {

    @Override
    public List<Page> getPages() {
        return pages;
    }

    List<Page> pages = new ArrayList();

    public Shop() {
        createPages();
    }

    private void createPages() {
        pages.add(new HomePage());
        pages.add(new ItemPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }


}
