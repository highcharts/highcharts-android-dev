package com.highsoft.devground;

/**
 * Created by bartosz on 09.03.18.
 */

public class Foo {

    private String txt;

    public Foo(String txt) {
        this.txt = txt;
    }

    public void bar(){
        System.out.println("Your txt: " + txt);
        int x = 2;
        System.out.println("Muliplication x2: " + x * 2 );
    }
}
