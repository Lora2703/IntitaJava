package com;

public abstract class Gadget {
    public abstract void on();

    public abstract void off();
}

    class TV extends Gadget{
        @Override
        public void on() {
            System.out.println("TV switch on");
        }

        @Override
        public void off() {
            System.out.println("TV switch off");
        }
    }

    class Camera extends Gadget{

        @Override
        public void on() {
            System.out.println("Camera switch on");
        }

        @Override
        public void off() {
            System.out.println("Camera switch off");
        }
    }

