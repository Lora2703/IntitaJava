package com;

public class main {
    public static void main(String[] args) {
        Gadget gadget1 = new Camera();
        Gadget gadget2 = new TV();
        gadget1.on();
        gadget1.off();
        gadget2.on();
        gadget2.off();

    }
}
