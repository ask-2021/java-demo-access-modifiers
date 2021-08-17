package astha.org2;

import astha.org.AccessModifier1;

public class AccessModifierUsingInheritance extends AccessModifier1 {

    public static void main(String[] args) {

        AccessModifier1 obj1 = new AccessModifier1();
        System.out.println(obj1.publicVariable);
//        System.out.println(obj1.privateVariable); //--> not accessible outside its class
//        System.out.println(obj1.protectedVariable); //-->not accessible outside its package without inheritance
//        System.out.println(obj1.defaultVariable); //--> not accessible outside its package at all


        AccessModifierUsingInheritance accessModifierUsingInheritance = new AccessModifierUsingInheritance();

        System.out.println(accessModifierUsingInheritance.publicVariable);
//        System.out.println(accessModifierUsingInheritance.privateVariable); //--> not accessible outside its class
        System.out.println(accessModifierUsingInheritance.protectedVariable); //-->accessible outside its package with inheritance using parent class object
//        System.out.println(accessModifierUsingInheritance.defaultVariable); //--> not accessible outside its package at all

    }

}
