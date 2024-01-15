package org.example.designpatterns.factorypattern;

import java.util.ArrayList;
import java.util.List;

public class Blog extends Website{

    @Override
    public List<Page> getPages() {
        return pages;
    }

    List<Page> pages = new ArrayList();

    public Blog() {
        createPages();
    }

    private void createPages() {
        pages.add(new AboutPage());
        pages.add(new HomePage());
        pages.add(new ContactPage());
        pages.add(new PostPage());

    }

}
