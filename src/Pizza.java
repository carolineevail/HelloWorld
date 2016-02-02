/**
 * Created by Caroline on 2/1/16.
 */
public class Pizza {
    public String type;
    public int numberOfToppings;
    public boolean isHot = true;




    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }




    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings (int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }




    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean isHot) {
        this.isHot = isHot;
    }




    public Pizza(String type, int numberOfToppings, boolean isHot) {
        setType(type);
        setNumberOfToppings(numberOfToppings);
        setHot(isHot);
    }
}
