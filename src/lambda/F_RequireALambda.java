package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class F_RequireALambda {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");
    callALambdaForListElements(cities, city -> {
      if (city.startsWith("T")) {
        System.out.println("Sending sms about this city: " + city);
        sendThisAsAnSMS(city);
      }
    });
  }

  private static void sendThisAsAnSMS(String city) {
    //not sending an actual SMS
  }

  private static void callALambdaForListElements(List<String> list, Consumer<String> lambda) {
    for (String element : list) {
      lambda.accept(element);
    }
  }

  private static void call(Supplier<String> lambda) {
    lambda.get();
  }

}
