/**
 * Created by Caroline on 2/1/16.
 */
public class Show {
    public String showName;
    public int episodesPerSeason;
    public int numberOfSeasons;
    public boolean isEntertaining = true;
    public boolean seriesCanBeWatchedInOneDay;




    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }




    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }




    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }




    public boolean isEntertaining() {
        return isEntertaining;
    }

    public void setEntertaining(boolean isEntertaining) {
        this.isEntertaining = isEntertaining;
    }




    public boolean seriesCanBeWatchedInOneDay() {
        return seriesCanBeWatchedInOneDay;
    }

    public void setSeriesCanBeWatchedInOneDay(boolean seriesCanBeWatchedInOneDay) {
        this.seriesCanBeWatchedInOneDay = seriesCanBeWatchedInOneDay;
    }




    public Show(String showName, int episodesPerSeason, int numberOfSeasons, boolean isEntertaining, boolean seriesCanBeWatchedInOneDay) {
        setShowName(showName);
        setEpisodesPerSeason(episodesPerSeason);
        setNumberOfSeasons(numberOfSeasons);
        setEntertaining(isEntertaining);
        setSeriesCanBeWatchedInOneDay(seriesCanBeWatchedInOneDay);
    }

    @Override
    public String toString() {
        return "Show{" +
                "showName='" + showName + '\'' +
                ", episodesPerSeason=" + episodesPerSeason +
                ", numberOfSeasons=" + numberOfSeasons +
                ", isEntertaining=" + isEntertaining +
                ", seriesCanBeWatchedInOneDay=" + seriesCanBeWatchedInOneDay +
                '}';
    }
}
