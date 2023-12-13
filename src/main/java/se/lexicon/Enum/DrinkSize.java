package se.lexicon.Enum;

public enum DrinkSize {
    CAN("33cl"),
    SMALL_BOTTLE("50cl"),
    MEDIUM_BOTTLE("1L"),
    LARGE_BOTTLE("1.5L");

    private String size;

    DrinkSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
}
