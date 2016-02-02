/**
 * Created by Caroline on 2/1/16.
 */
public class BoardGame {
    public String name;
    public int numberOfPlayers;
    public boolean isFun = true;
    public boolean hasDice = true;
    public boolean hasCards = true;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }




    public boolean isFun() {
        return isFun;
    }

    public void setFun(boolean isFun) {
        this.isFun = isFun;
    }




    public boolean hasDice() {
        return hasDice;
    }

    public void setHasDice(boolean hasDice) {
        this.hasDice = hasDice;
    }




    public boolean hasCards() {
        return hasCards;
    }

    public void setHasCards(boolean hasCards) {
        this.hasCards = hasCards;
    }




    public BoardGame(String name, int numberOfPlayers, boolean isFun, boolean hasDice, boolean hasCards) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setFun(isFun);
        setHasDice(hasDice);
        setHasCards(hasCards);
    }


    @Override
    public String toString() {
        return "BoardGame{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", isFun=" + isFun +
                ", hasDice=" + hasDice +
                ", hasCards=" + hasCards +
                '}';
    }
}
