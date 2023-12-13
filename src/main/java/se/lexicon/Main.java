package se.lexicon;

import se.lexicon.Enum.CandyBarFlavour;
import se.lexicon.Enum.ChipsFlavour;
import se.lexicon.Enum.DrinkSize;
import se.lexicon.data.VendingMachineImpl;
import se.lexicon.model.CandyBar;
import se.lexicon.model.Chips;
import se.lexicon.model.Drink;
import se.lexicon.model.Product;

public class Main {
    public static void main(String[] args) {
        Chips chips1 = new Chips(30.0, "Estrella", ChipsFlavour.SOURCREAM_AND_ONION);
        Chips chips2 = new Chips(30.0, "OLW", ChipsFlavour.PEPPAR);
        Chips chips3 = new Chips(30.0, "Estrella", ChipsFlavour.SPICY_CHILI);

//        System.out.println(chips1);
//        System.out.println(chips2);
//        System.out.println(chips3);

        Drink drink1 = new Drink(15, "Sprite", DrinkSize.CAN);
        Drink drink2 = new Drink(15, "Fanta", DrinkSize.MEDIUM_BOTTLE);
        Drink drink3 = new Drink(15, "Julmust", DrinkSize.SMALL_BOTTLE);

//        System.out.println(drink1);
//        System.out.println(drink2);
//        System.out.println(drink3);

        CandyBar bar1 = new CandyBar(12.0, "Snickers", CandyBarFlavour.PEANUTS_AND_CHOCOLATE);
        CandyBar bar2 = new CandyBar(15.0, "Twix", CandyBarFlavour.CRACKER_WITH_CHOCOLATE);
        CandyBar bar3 = new CandyBar(8.0, "Marabou", CandyBarFlavour.DARK_CHOCOLATE);

//        System.out.println(bar1);
//        System.out.println(bar2);
//        System.out.println(bar3);

        Product[] productList1 = {
                chips1,
                chips2,
                chips3,
                drink1,
                drink2,
                drink3,
                bar1,
                bar2,
                bar3
        };

        VendingMachineImpl ourVendingMachine = new VendingMachineImpl(productList1);

        for ( String product : ourVendingMachine.getProducts()) {
            System.out.println(product);
        }

    }
}