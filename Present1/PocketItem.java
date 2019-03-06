public class PocketItem extends  WhatIsInPocket {

    @Override
    public boolean itHasNumber10OnIt() {
        System.out.println("I don't have number 10 on me or any numbers");
        return false;
    }

    @Override
    public boolean isEatable() {
        System.out.println("You can eat me");
        return true;
    }

    @Override
    public String Material() {
        return "I can be from any material";
    }

    @Override
    public String howBig() {
        return "I can be size of your pocket";
    }

    @Override
    public String whoAmI() {
        return "i'm abstract pocket item";
    }
}
