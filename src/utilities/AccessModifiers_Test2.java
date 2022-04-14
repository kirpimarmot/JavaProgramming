package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
      //System.out.println(AccessModifiers.defaultData);//default Access Modifier is not reachable outside the package
      //System.out.println(AccessModifiers.privateData);//private Access Modifier is not reachable outside the class


        AccessModifiers.metdod1();
        //AccessModifiers.metdod2();//default method is not reachable outside the package
        //AccessModifiers.metdod3();//private method is not reachable outside the class

    }
}
