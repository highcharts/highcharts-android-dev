package com.highsoft.devground;


import java.util.ArrayList;

/**
 * Created by bartosz on 09.03.18.
 */

public class Foo extends ArrayList<Object> {
    private String str;
    private Number nr;

    public Foo(String str, Number nr){
        this.str = str;
        this.nr = nr;
        add(str);
        add(nr);
    }
}
