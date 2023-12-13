package se.lexicon.Enum;

public enum ChipsFlavour {
    SPICY_CHILI("Spicy Chili"),
    PEPPAR("Peppar"),
    SOURCREAM_AND_ONION("Sourcream & Onion");

    private String flavour;

    ChipsFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
