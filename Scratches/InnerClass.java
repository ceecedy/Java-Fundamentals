/*
    Demonstration of Inner Classes and Annonymous Inner Classes in Java.
 */

class NestedClass {
    
    String name = "Cedric";

    public void playMusic () {
        
        System.out.println("Playing Music...");
    }

    class A {
        
        public void watchMovie() {

            System.out.println("Wathching Movie...");
        }

        public void setName(String pangalan) {

            String newName =name.concat(" " + pangalan);
            System.out.println("New Name:" + newName);
        }
    }
}


public class InnerClass {
    
    public static void main(String[] args) {
        
        NestedClass nested = new NestedClass();

        System.out.println("Declared Name: " + nested.name);
        nested.playMusic();

        // Accessing inner class within a class. 
        NestedClass.A innerA = nested.new A(); 

        // The syntax is to call the main class first and concat it with dot(.) and followed by the reference variable name
        // equals to primary class object followed by the dot(.) and new and with the Inner class. Above implementation is 
        // the example.

        innerA.setName("Castro");
        innerA.watchMovie();

        // Implementation of Annonymous Inner Class
        NestedClass.A innerB = nested.new A() {

            public void watchMovie() {
                
                System.out.println("Watching different show...");
            }
        };

        innerB.watchMovie();


    }
}
