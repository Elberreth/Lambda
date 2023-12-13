package se.lexicon.model;

public class IdGenerator {
    private static int counter = 0;
    public int generateId(){
        incrementCounter();
        return counter;
    }
    private static void incrementCounter() {
        ++counter;
    }
}
