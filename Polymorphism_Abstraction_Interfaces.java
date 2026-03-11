/*
1. Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. 
i. Call the location() and famousFor() method by the Parent class’, i.e. Hillstations class. As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. 
ii. Call the location() and famousFor() method by the all subclass’,and print accordingly.
*/

CODE:

/*
// Super class
class HillStations {
    void location() {
        System.out.println("Hill station location");
    }

    void famousFor() {
        System.out.println("Hill station is famous for something");
    }
}

// Sub class 1
class Manali extends HillStations {
    void location() {
        System.out.println("Manali is located in Himachal Pradesh");
    }

    void famousFor() {
        System.out.println("Manali is famous for snow and adventure sports");
    }
}

// Sub class 2 
class Mussoorie extends HillStations {
    void location() {
        System.out.println("Mussoorie is located in Uttarakhand");
    }

    void famousFor() {
        System.out.println("Mussoorie is famous for scenic views");
    }
}

// Sub class 3
class Gulmarg extends HillStations {
    void location() {
        System.out.println("Gulmarg is located in Jammu & Kashmir");
    }

    void famousFor() {
        System.out.println("Gulmarg is famous for skiing");
    }
}


public class HillStationDemo {
    public static void main(String[] args) {

        // i. calling the location() and famousFor() method by the Parent class

        HillStations h;

        h = new Manali();
        h.location();
        h.famousFor();

        h = new Mussoorie();
        h.location();
        h.famousFor();

        h = new Gulmarg();
        h.location();
        h.famousFor();

        System.out.println("\nCalling using subclass objects:");

        // ii. calling the location() and famousFor() method by the all subclasss

        Manali m = new Manali();
        m.location();
        m.famousFor();

        Mussoorie ms = new Mussoorie();
        ms.location();
        ms.famousFor();

        Gulmarg g = new Gulmarg();
        g.location();
        g.famousFor();
    }
}
*/

/*
OUTPUT:
i. Calling the location() and famousFor() method by the Parent class

Manali is located in Himachal Pradesh
Manali is famous for snow and adventure sports
Mussoorie is located in Uttarakhand
Mussoorie is famous for scenic views
Gulmarg is located in Jammu & Kashmir
Gulmarg is famous for skiing


ii. calling the location() and famousFor() method by the all subclasss

Manali is located in Himachal Pradesh
Manali is famous for snow and adventure sports
Mussoorie is located in Uttarakhand
Mussoorie is famous for scenic views
Gulmarg is located in Jammu & Kashmir
Gulmarg is famous for skiing
*/

____________________________________________________________________________________________________________________________________
/*
2.Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. 
i TheAnimal class should have a method called makeSound(), which simply prints "The animal makes a sound." 
ii. TheDogandCatclasses should override this method to print "TheCat/The dog meows/barks" respectively. 
iii. Theprogram should allow the user to create and display objects of each class. [Hint:Use multilevel inheritance]
*/

/*

CODE:

import java.util.Scanner;

// Super class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Sub class 1 
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Sub class 2
class Cat extends Dog {
    void makeSound() {
        System.out.println("The cat meows");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an animal:");
        System.out.println("1. Animal");
        System.out.println("2. Dog");
        System.out.println("3. Cat");

        int choice = sc.nextInt();

        Animal a;

        if (choice == 1) {
            a = new Animal();
        } else if (choice == 2) {
            a = new Dog();
        } else {
            a = new Cat();
        }

        a.makeSound(); 
    }
}
*/

/*
OUTPUT:

1
The animal makes a sound
2
The dog barks
3
The cat meows

*/



