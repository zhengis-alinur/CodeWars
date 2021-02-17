# TortoiseRasing

Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A, and furthermore has not finished her cabbage.

When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour. How long will it take B to catch A?

More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds (round down to the nearest second) or a string in some languages.

If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, Pascal,[] for Kotlin or "-1 -1 -1".

Examples:
(form of the result depends on the language)
>race(720, 850, 70) => [0, 32, 18] or "0 32 18"
race(80, 91, 37)   => [3, 21, 49] or "3 21 49"

## The most clever solution:
```java
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int t = 3600 * g / (v2 - v1);
        return new int[] { t / 3600, t % 3600 / 60, t % 60};
    }
}
```
## My solution
```java
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if(v2 < v1) {
            return null;
        }
        double timeInSeconds = ((double)g / (v2-v1))*3600;
        double hour = timeInSeconds / 3600;
        timeInSeconds %= 3600;
        double min = timeInSeconds / 60;
        timeInSeconds %= 60;
        double sec = timeInSeconds;
        int[] res = new int[3];
        res[0] = (int) hour;
        res[1] = (int) min;
        res[2] = (int) sec;
        return res;
    }
}
```
