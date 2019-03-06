public class Driver {
    public static void main(String[] args) {
        WhatIsInPocket PocketItem = new PocketItem();
        WhatIsInPocket imCompass = new imCompass();

        WhatIsInPocket[] items = {PocketItem, imCompass};


        for(WhatIsInPocket item: items) {
            System.out.println(item.itHasNumber10OnIt());
            System.out.println(item.isEatable());
            System.out.println(item.Material());
            System.out.println(item.howBig());
            System.out.println(item.whoAmI());
        }
    }
}
