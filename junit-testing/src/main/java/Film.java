
public class Film {

    public static final String RATING_18 = "18";
    public static final String RATING_15 = "15";
    public static final String RATING_12 = "12";
    public static final String RATING_PG = "PG";
    public static final String RATING_U = "U";

    private String name;
    private final String rating;

    public Film(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean isAllowedToView(int age) {
        return switch (this.rating) {
            case RATING_U -> true;
            case RATING_PG -> {
                yield age >= 5;
            }
            case RATING_12 -> {
                yield age >= 12;
            }
            case RATING_15 -> {
                yield age >= 15;
            }
            case RATING_18 -> {
                yield age >= 18;
            }
            default -> false;
        };
    }

}
