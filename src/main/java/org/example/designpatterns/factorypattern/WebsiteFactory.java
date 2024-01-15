package org.example.designpatterns.factorypattern;

public class WebsiteFactory {
    public static Website createWebsite(WebsiteType websiteType) {
        return switch (websiteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
        };
    }
}
