/*
    * Demonstration of Abstract and Anonymous Inner Class *
 */

abstract class Laptop {
    public abstract void editVideos();
    public abstract void watchVideos();
}

public class AbstractInnerClass {
    
    public static void main(String[] args) {
        
        Laptop macbook = new Laptop() {
            
            public void editVideos() {

                System.out.println("I can edit videos here in macbook just fine...");
            }

            public void watchVideos() {

                System.out.println("I can watch the videos I edited on this macbook...");
            }
        };

        macbook.editVideos();
        macbook.watchVideos();
    }
}

/*
    * EXPLANATION *
    - Class Laptop is a super class but an abstract. It has two methods that are declared as abstract. So it means, for those
        classes who inherits the abstract superclass, it will have to declare and define the abstract methods implicitly.
    - In the main method, we can see that there's an instantiation of class Laptop of object macbook. It also has open and 
        close curly brackets because we declare inside of the instantiation an anonymous inner class that will suffice the 
        abstract methods of the class we instantiate. 
 */
