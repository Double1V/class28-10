public class XO {

    public static boolean getXO(String str) {
        int n = str.length();
        int ocounter = 0;
        int xcounter = 0;
        str = str.toUpperCase();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'O') {
                ocounter++;
            }
            ;
            if (str.charAt(i) == 'X') {
                xcounter++;
            }
            ;
        }
        if ((ocounter) == (xcounter))
            return true;
        else {
            return false;
        }
    }
}
