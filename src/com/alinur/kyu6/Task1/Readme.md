# Playing with digits

Some numbers have funny properties. For example:

> 89 --> 8¹ + 9² = 89 * 1

> 695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2

> 46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p
we want to find a positive integer k, if it exists, such as the sum of the digits of n taken to the successive powers of p is equal to k * n.
***
In other words:
***
Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
***
If it is the case we will return k, if not return -1.

```java
digPow(89, 1) should return 1 since 8¹ + 9² = 89 = 89 * 1
digPow(92, 1) should return -1 since there is no k such as 9¹ + 2² equals 92 * k
digPow(695, 2) should return 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
digPow(46288, 3) should return 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
```

## The most clever solution:
```java
public class DigPow {
  
  public static long digPow(int n, int p) {
    String intString = String.valueOf(n);
    long sum = 0;
    for (int i = 0; i < intString.length(); ++i, ++p)
      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
    return (sum % n == 0) ? sum / n : -1;
  }
  
}
```
## My solution
```java
public static long digPow(int n, int p) {
        int sum = 0;
        int digNum = 0;
        int d = n;
        while(( d / 10) > 1) {
            d = d / 10;
            digNum++;
        }

        int m = n;
        for(int i = digNum; i >= 0; i--){
            int x = (int) ( m / Math.pow(10, i));
            sum += Math.pow(x, p++);
            m = m % ((int)Math.pow(10, i)*x);
        }

        if((sum % n) == 0){
            System.out.println("Найдено " + sum/n);
            return sum/n;
        }
        else {
            System.out.println("Не найдено ");
            return -1;
        }
```
