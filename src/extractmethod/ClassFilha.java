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

    public void toPushDownMethod() {
        Integer aVariable = 3;
        aVariable = 4;

        String notANumber = "NaN33";

        System.out.println(notANumber + aVariable);
    }
   
}
