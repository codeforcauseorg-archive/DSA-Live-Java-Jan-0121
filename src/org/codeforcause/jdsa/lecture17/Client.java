package org.codeforcause.jdsa.lecture17;

import org.codeforcause.jdsa.lecture5.DecToBin;

public class Client {
    public static void main(String[] args) {
        Human abhijeet = new Human("Abhijeet");
        Human saksham = new Human("Saksham",5000);
//        Human baby;
//        baby = abhijeet;
//        System.out.println("Baby ke paise: " + baby.paise);
//        baby = saksham;
//        System.out.println("Baby ke paise: " + baby.paise);
//        abhijeet = null;
        System.out.println("Abhijeet ke paise: " + abhijeet.paise);
        abhijeet.party();
        System.out.println("Abhijeet ke paise: " + abhijeet.paise);
        abhijeet.udhaar();
        System.out.println("Abhijeet ke paise: " + abhijeet.paise);
    }
}
