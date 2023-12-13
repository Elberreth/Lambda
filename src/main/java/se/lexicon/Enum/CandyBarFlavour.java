package se.lexicon.Enum;

public enum CandyBarFlavour {
    PEANUTS_AND_CHOCOLATE("Peanuts and Chocolate"),
    CRACKER_WITH_CHOCOLATE("Cracker with chocolate"),
    DARK_CHOCOLATE("Dark chocolate");

    private String flavour;

    CandyBarFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }
}
