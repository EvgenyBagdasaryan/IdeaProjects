package org.example;

import lombok.Builder;

@Builder
public class Test {
    private int id;

    public Test (int id){
        this.id = id;
    }

    public boolean comaparNative(int id){
        return this.id == id;
    }

    public static boolean comparStatic(Test t, int id){
        return t.id == id;
    }

    public static void setStatic(Test t, int id){
        t.id = id;
    }
}
