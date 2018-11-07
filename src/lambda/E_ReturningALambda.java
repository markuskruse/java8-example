package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E_ReturningALambda {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");

    SpringAPI springAPI = new SomewhereCompletelyDifferent();

    //using it
    cities = cities.stream()
        .map(springAPI.createStringFunction())
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);
  }


  // The Spring interface
  public interface SpringAPI {

    Function<String, String> createStringFunction();

  }

  public static class SomewhereCompletelyDifferent implements SpringAPI {

    @Override
    public Function<String, String> createStringFunction() {
      return parameter -> parameter.substring(1);
    }
  }
}
