package extractmethod;

public class ClassMae {

    int toPushDownField = 3;
    
    public void toPushDownMethod() {
        Integer aVariable = 3;
        aVariable = 4;

        String notANumber = "NaN";

        System.out.println(notANumber + aVariable);
    }
 
}
