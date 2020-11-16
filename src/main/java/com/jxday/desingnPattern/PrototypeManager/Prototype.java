package com.jxday.desingnPattern.PrototypeManager;


public interface Prototype extends Cloneable {
    Prototype clone();
    void display();
}
