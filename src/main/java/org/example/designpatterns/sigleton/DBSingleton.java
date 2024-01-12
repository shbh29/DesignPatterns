package org.example.designpatterns.sigleton;

public class DBSingleton {

    private DBSingleton() {}
    static {
        System.out.println("Outer class static initializer");
    }

    private static class LazyLoader {
        private static DBSingleton instance = new DBSingleton();
        static {
            System.out.println("Static initializer inner class");
        }
    }

    public static DBSingleton getInstance() {
        System.out.println("getInstance Method call");
        return LazyLoader.instance;
    }
}
