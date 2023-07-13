/*
    * Object Hashchode Demonstration * 
 */

class Smartphone {
    String name;
    int price;

    // Smartphone that is a class parameter, so it should accept reference variable when called. 
    public boolean equals1(Smartphone that) {
        return this.name.equals(that.name) && this.price == that.price;
        /*
             - "this" will refer to it's own values (variables). 
             - this.name.equals(that.name) = this is comparing the first name value to the second value name that was from 
                the parameter object. This also can use equals method because both variables is string. equals method can't 
                be used to int. So the price compare is using "==".
        */
    }

    // All functions with override annotations are generated. 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + price;
        return result;
    }

    // This is a better equals custom method for it not only checks the value, but it checks everything that can be checked.
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Smartphone other = (Smartphone) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Smartphone [name=" + name + ", price=" + price + "]";
    }

}

/*
    Class smartphones or all classes extends Object.class by default. 
 */


public class ObjectHash {

    public static void main(String[] args) {
        
        // first demonstration of using object.class methods. 
        Smartphone phone1 = new Smartphone();
        phone1.name = "Samsung";
        phone1.price = 999;

        Smartphone phone2 = new Smartphone();
        phone2.name = "Samsung";
        phone2.price = 999;

        System.out.println(phone1 + "\n"); // Output: Smartphone@515f550a
        /*
            The output was the class and its particular name with @ and hash code generated to all values of class 
            Smartphone and they are all concatenated to the class name itself. 

            That was the output because by default, when calling the referece variable of a class, it has ".toString()" 
            by default. And "toString()" by default has this return value: 

            - return getClass().getName() + "@" + Integer.toHexString(hashCode()); - 

            The output of the phone1 reference variable to the smartphone class is based on above return code. 

            After generating custom "toString()" method, the output was not random hashcode anymore. it became formatted. 

            Output: Smartphone [name=Samsung, price=999]
         */
        
         // Demonstration of using equals method from object.class. 
         System.out.println(phone1.equals1(phone2) + "\n"); // Output: false.
         /*
            The output was false because both reference variable was compared using hashcode, 
            but not on its literal value.    

            * But after making custom equals method that checks its value. This will turn into true.
         */

        // Second Demonstration, generating hascodes, equals, and toString.
        Smartphone phone3 = new Smartphone();
        phone3.name = "Iphone";
        phone3.price = 1199;

        Smartphone phone4 = new Smartphone();
        phone4.name = "Iphone";
        phone4.price = 1199;

        System.out.println(phone3.equals(phone4) + "\n"); // Output: false.

    }
}
