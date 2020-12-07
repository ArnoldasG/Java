package Exercises;

/*
Man and woman
1. Inside the Solution class, create public static Man and Woman classes.
2. The classes must have the following fields: String name, int age, String address.
3. Make constructors that have all possible parameters.
4. Create two objects of each class with complete data using a constructor.
5. Display the objects on the screen in this format: name + " " + age + " " + address


Requirements:
1. In the Solution class, create a public static Man class.
2. In the Solution class, create a public static Woman class.
3. The Man class must have variables: String name, int age, and String address.
4. The Woman class must have variables: String name, int age, and String address.
5. The Man and Woman classes must have constructors that take String, int, and String arguments.
6. The constructors must initialize the instance variables.
7. In the main method, you need to create two objects of each type.
8. The main method should display the created objects on the screen in the specified format.
*/

public class ManAndWomanHARD {
    public static void main(String[] args) {
        //write your code here
        Man man = new Man("Arnoldas", 25, "Kaunas");
        Man man1 = new Man("Linas", 25, "Kaunas");
        Woman woman = new Woman("Evita", 66, "Daugai");
        Woman woman1 = new Woman("Gabrielė", 22, "Kaunas");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    }
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
