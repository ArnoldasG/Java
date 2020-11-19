package Exercises;
    /*
A programmer creates a person
Create the Person class. A person should have a String name and int age.
Add the initialize(String name, int age) method where you will initialize the variables name and age.
In the main method, create a Person object and store a reference to it in the variable person.
Call the initialize method with any values.


Requirements:
1. The Solution class must contain the Person class.
2. The Person class must have a String variable name.
3. The Person class must have an int variable age.
4. The Person class must have an initialize method that takes a name and age as arguments, and initializes the corresponding instance variables.
5. You need to create a Person object and put a reference to it in the variable person.
6. You must call the initialize method on the created object and pass some arguments to it.
*/

    public class PersonWithInitialization {
        public static void main(String[] args) {
            //write your code here
            Person person = new Person();
            person.initialize("Arnoldas", 25);
        }

        static class Person {
            //write your code here
            private String name;
            private int age;

            public void initialize(String name, int age){
                this.name = name;
                this.age = age;
            }
        }
    }

