package org.codeforcause.jdsa.lecture17;

public class Human {
    String name;
    int paise;
    static int population = 0;

    Human(String name) {
        this.name = name;
        this.paise = 1000;
    }
    Human(String name, int paise) {
        this.name = name;
        this.paise = paise;
    }
    public void udhaar() {
        paise += 100;
    }

    public void party() {
        paise -= 500;
    }

    public static void setPopulation() {
        population++;
    }
}
