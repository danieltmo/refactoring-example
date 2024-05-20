package extractmethod;

public class ClassFilha extends ClassMae {

    String toPullUpField = "field to pull up";

    public void uniqueMethod() {
        int i = super.toPushDownField;
        i++;
        if (i == 4) {
            i = 3;
        }
    }

    
    public void commonMethod() {
        System.out.println("comum");
    }

    public void toBeMoved() {
        boolean aMethodToBeMoved = true;

        while (aMethodToBeMoved) {
            aMethodToBeMoved = false;
        }
    }
}
