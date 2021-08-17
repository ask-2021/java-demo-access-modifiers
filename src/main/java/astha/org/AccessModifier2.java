package astha.org;

public class AccessModifier2 {

   public static void main(String[] args) {
        AccessModifier1 obj1 = new AccessModifier1();
        System.out.println(obj1.publicVariable);
       // System.out.println(obj1.privateVariable); --> not accessible outside its class
        System.out.println(obj1.protectedVariable);
        System.out.println(obj1.defaultVariable);

        }




}
