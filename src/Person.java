/**
 * Created by Caroline on 2/1/16.
 */
public class Person {
    public String name;
    public int age;
    public boolean isAlive = true;
    public String address;

    public Person() {

    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
        setAlive(true);
    }

    public Person(String name, int age, boolean isAlive) {
        setName(name);
        setAge(age);
        setAlive(isAlive);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName(newName)) {
            name = newName;
        }
    }

    public static boolean isValidName(String name) {
        return name.contains(" ");
    }
    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean newIsAlive) {
        isAlive = newIsAlive;
    }



}
