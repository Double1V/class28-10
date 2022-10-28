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

[Task link](https://www.codewars.com/kata/563b662a59afc2b5120000c6)

  ```java
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
  ```
  
My fav soluiton

```java
      public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
}
