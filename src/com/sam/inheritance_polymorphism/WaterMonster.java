package com.sam.inheritance_polymorphism;

public class WaterMonster extends Monster {
    public WaterMonster(String name) {
        super(name);
    }
    public String attack() {
        return "Attack with water!\n";

    }
}
