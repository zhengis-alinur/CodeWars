# Testing 1-2-3
Description:
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples:
``` java
    number(Arrays.asList()) # => []
    number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
```

## The most interesting solution:
```java
class LineNumbering {
    static List<String> number(List<String> lines) {
        final AtomicInteger index = new AtomicInteger(1);
        return lines.stream().
                map(s -> String.valueOf(index.getAndIncrement()) + ": " + s).
                collect(Collectors.toList());
    }
}
```
## My solution
```java
import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        for(int i=0; i<lines.size(); i++){
            lines.set(i, i+1 + ": " + lines.get(i));
        }
        return lines;
    }
}
```
