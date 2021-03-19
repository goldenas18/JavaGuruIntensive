package io.github.javaGuruIntensive;

public class User {

    static String firstName;
    static String lastName;
    static int age;




    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        User.firstName = firstName;
    }


    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        User.lastName = lastName;
    }


    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        User.age = age;
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(29);
        user1.setLastName("Golyk");
        user1.setFirstName("Denys");
        user1.ageChecker();
    }
    public void ageChecker() {
        if (age > 120||age<0) {
            throw new UserValidationException("nooo way hi/her is that age");
        }
        if (firstName.length()<3||firstName.length()>15) {
            throw new UserValidationException("what? that`s not a name, or your parents have weird sense of humor");
        }
        if (lastName.length()<3||lastName.length()>15){
            throw new UserValidationException("i`m not fall for that. give me your real lastname");
        }
    }
}