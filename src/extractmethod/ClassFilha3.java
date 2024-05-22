package extractmethod;

public class ClassFilha3 extends ClassMae {

    String toPullUpField = "field to pull up";

    public void uniqueMethodFilha3() {
        int j = 3;
        j++;
        if (j == 4) {
            j = 3;
        }
    }

    @Override
    public void commonMethod() {
        System.out.println("comum editado");
    }

    public void toPushDownMethod() {
        Integer aVariable = 3;
        aVariable = 4;

        String notANumber = "NaN2";

        System.out.println(notANumber + aVariable);
    }
}
