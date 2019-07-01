public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec", "Lipiec", "Sierpień"}),
    AUTUMN("Jesień", new String[]{"Wrzesień", "Październik", "Listopad"}),
    WINTER("Zima", new String[]{"Grudzień", "Styczeń", "Luty"});


    private final String season;
    private final String[] sez;

    Season(String season, String[] strings) {
        this.season = season;
        this.sez = strings;
    }

    public String getSeason() {
        return season;
    }

    public String[] getSez() {
        return sez;
    }

    public static Season fromDescription(String description) {
        Season[] values = values();
        for (Season size : values) {
            if (size.getSeason().equals(description))
                return size;
        }
        return null;
    }
}
