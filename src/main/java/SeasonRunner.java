public class SeasonRunner {
    public static void main(String[] args) {
        Season season = new Season();

        season.setActivity(new WinterActivity());
        season.execute();

        season.setActivity(new SpringActivity());
        season.execute();

        season.setActivity(new SummerActivity());
        season.execute();

        season.setActivity(new FallActivity());
        season.execute();
    }
}
