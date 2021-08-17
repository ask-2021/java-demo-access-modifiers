package astha.org;

public class AccessModifier1 {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    public static void main(String[] args) {

        AccessModifier1 obj1 = new AccessModifier1();
        System.out.println(obj1.publicVariable);
        System.out.println(obj1.privateVariable);
        System.out.println(obj1.protectedVariable);
        System.out.println(obj1.defaultVariable);

        System.out.println("Calling AccessModifier2");


    }
}
