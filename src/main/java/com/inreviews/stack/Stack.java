package com.inreviews.stack;

public class Stack {
    private Object data[];
    private int sp;

    public Stack() {
        data = new Object [10];
        sp = 0;
    }

    public void push(Object val){
        if (sp == data.length){
            Object newData[] = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }
            data = newData;
        }
        data[sp++] = val;
    }

    public Object pop(){
        return data[sp--];
    }
}
