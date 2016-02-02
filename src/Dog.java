/**
 * Created by Caroline on 2/1/16.
 */
public class Dog {
    public String breed;
    public int age;
    public boolean isHyopallergenic = true;
    public boolean isDoge = true;
    public boolean isCute = true;
    public String color;




    public String getBreed() {
        return breed;
    }

    public void setBreed (String breed) {
        this.breed = breed;
    }




    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }




    public boolean isHyopallergenic() {
        return isHyopallergenic;
    }

    public void setHyopallergenic(boolean isHyopallergenic) {
        this.isHyopallergenic = isHyopallergenic;
    }




    public boolean isDoge() {
        return isDoge;
    }

    public void setDoge(boolean isDoge) {
        this.isDoge = isDoge;
    }




    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean isCute) {
        this.isCute = isCute;
    }




    public String getColor() {
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }




    public Dog(String breed, int age, boolean isHyopallergenic, boolean isDoge, boolean isCute, String color) {
        setBreed(breed);
        setAge(age);
        setHyopallergenic(isHyopallergenic);
        setDoge(isDoge);
        setCute(isCute);
        setColor(color);
    }
}
