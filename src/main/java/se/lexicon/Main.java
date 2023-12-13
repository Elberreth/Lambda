package se.lexicon;

import org.w3c.dom.ls.LSOutput;
import se.lexicon.model.Chips;

public class Main {
    public static void main(String[] args) {
        Chips chips1 = new Chips(30.0, "Estrella", "Spicy Chili");
        Chips chips2 = new Chips(30.0, "Estrella", "Spicy Chili");
        Chips chips3 = new Chips(30.0, "Estrella", "Spicy Chili");

        System.out.println(chips1);
        System.out.println(chips2);
        System.out.println(chips3);
    }
}