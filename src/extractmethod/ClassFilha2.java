package extractmethod;

public class ClassFilha2 extends ClassMae {

    public void uniqueMethodFilha2() {
        int j = 3;
        j++;
        if (j == 4) {
            j = 3;
        }

        ClassFilha classFilha = new ClassFilha();
        classFilha.toPushDownMethodRenamed();
    }

    public void toBeMoved() {
        boolean aMethodToBeMoved = true;

        while (aMethodToBeMoved) {
            aMethodToBeMoved = false;
        }
    }

}
