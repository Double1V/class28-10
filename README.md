# class28-10
## kata task 1
[Task link](https://www.codewars.com/kata/55908aad6620c066bc00002a)

My solution
  
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

My fav solution

    public class XO {
  
      public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    
      }
    }
    
## kata task2

