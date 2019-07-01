import java.util.Arrays;

public class Rok {
    private Season season;
    private String[] months;

    public Rok(Season season) {
        this.season = season;
        this.months = season.getSez();
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public String[] getMonths() {
        return months;
    }

    @Override
    public String toString() {
        return "Rok{" +
                "Sezon = " + season +
                ", Miesiące = " + Arrays.toString(months) +
                '}';
    }

    public void setMonths(String[] ofYear) {
        this.months = ofYear;
    }
}
