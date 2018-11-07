package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D_UsingALambdaMethodReference {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");

    //Static reference
    cities = cities.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);

    //instance reference
    SomeClass someClass = new SomeClass();
    cities = cities.stream()
        .map(someClass::someCode)
        .collect(Collectors.toList());
    System.out.println("cities = " + cities);
  }

  public static class SomeClass {
    public String someCode(String value) {
      return value.toLowerCase().startsWith("p") ?
          value.toUpperCase() : value.toLowerCase();
    }
  }
}
