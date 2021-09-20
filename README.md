# Javagony Examples

```java
try {
  final int equal = 1 / (x - y);
  System.out.printf("%d != %d\n", x, y);
} catch (ArithmeticException e) {
  System.out.printf("%d == %d\b", x, y);
}
```

The basic idea of Javagony is that you can only use `try {} catch {}`. `if`, `for`, `while`, etc.
are not allowed.
