class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        double temp;
        double dp0 = Double.valueOf(p0);
        double daug = Double.valueOf(aug);
        double dp = Double.valueOf(p);
        while (dp0 < dp) {
            dp0 = dp0 + daug + dp0 * percent / 100;
            temp = (int) dp0;
            dp0 = temp;
            years++;
        }
        return years;
    }
}