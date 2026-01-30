class Appa {

    void property() {
        String bike = "STAR CITY";
        String things = "Phone";
        System.out.println("Bike: " + bike);
        System.out.println("Things: " + things);
    }
}

class Anna extends Appa {

    void drive() {
        String money = "20003";
        System.out.println("Money: " + money);
    }
}

class Amma extends Appa {

    void showProperty() {
        property();
    }
}

class Sairaj extends Amma {

    void requirements() {
        showProperty();
        System.out.println("Requirements completed");
    }
}

public class inheritance{
    public static void main(String[] args) {

        Sairaj obj = new Sairaj();
        obj.requirements();
    }
}
