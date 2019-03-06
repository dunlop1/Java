public class  imCompass extends WhatIsInPocket {

    @Override
    public boolean itHasNumber10OnIt() {
        System.out.println("I do have number 10 on me");
        return true;
    }

    @Override
    public boolean isEatable() {
        System.out.println(" No you can't eat me");
        return false;

    }

    @Override
    public String Material() {
        return "Could be from plastic and metal";
    }

    @Override
    public String howBig() {
        return "I can easy fit in pocket";
    }

    @Override
    public String whoAmI() {
        return "\n \n \n \n \n I'm Compass";
    }
}
