package com.github.vbauer.caesar.bean;

/**
 * @author Vladislav Bauer
 */

public class Sync {

    public String hello(final String name) {
        return String.format("Hello, %s", name);
    }

    public String hello(final String name1, final String name2) {
        return String.format("Hello, %s and %s", name1, name2);
    }

    public void empty() {
    }

    public void emptyHello(final String name) {
    }

    public void exception() {
        throw new UnsupportedOperationException();
    }

}
