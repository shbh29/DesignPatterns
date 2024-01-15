package org.example.designpatterns.factorypattern;

public class CreatWebsites {
    public static void main(String[] args) {

        Website blog = WebsiteFactory.createWebsite(WebsiteType.BLOG);

        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.createWebsite(WebsiteType.SHOP);

        System.out.println(shop.getPages());
    }
}
