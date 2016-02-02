/**
 * Created by Caroline on 2/1/16.
 */
public class Album {
    public String bandName;
    public int year;
    public boolean isCarolineApproved = true;
    public String genre;




    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }




    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




    public boolean isCarolineApproved() {
        return isCarolineApproved;
    }

    public void setCarolineApproved(boolean isCarolineApproved) {
        this.isCarolineApproved = isCarolineApproved;
    }




    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




    public Album(String bandName, int year, boolean isCarolineApproved, String genre) {
        setBandName(bandName);
        setYear(year);
        setCarolineApproved(isCarolineApproved);
        setGenre(genre);
    }

    @Override
    public String toString() {
        return "Album{" +
                "bandName='" + bandName + '\'' +
                ", year=" + year +
                ", isCarolineApproved=" + isCarolineApproved +
                ", genre='" + genre + '\'' +
                '}';
    }
}
