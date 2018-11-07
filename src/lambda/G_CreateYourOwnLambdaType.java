package lambda;

public class G_CreateYourOwnLambdaType {

  public static void main(String[] args) {
    String first = "Paris";
    String second = "London";
    String third = "Berlin";

    String result = callThisLambdaTwiceAndConcatenate((s, s2, s3) -> {
          if (Math.random() < 0.3) {
            return first;
          }
          if (Math.random() < 0.5) {
            return second;
          }
          return third;
        },
        first, second, third);
    System.out.println("result = " + result);
  }

  public static String callThisLambdaTwiceAndConcatenate(TriFunction<String, String, String, String> triFunction,
      String abel, String bertram, String caesar) {
    String first = triFunction.apply(abel, bertram, caesar);
    String second = triFunction.apply(abel, bertram, caesar);
    return first + second;
  }

  @FunctionalInterface
  public static interface TriFunction<T, X, Y, R> {

    R apply(T t, X x, Y y);
  }

}
