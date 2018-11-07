package streams;

import java.util.Arrays;
import java.util.List;

public class G_Matchers {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn", "paris");

    boolean anyStartsWithT = cities.stream().anyMatch(city -> city.startsWith("T"));
    System.out.println("any = " + anyStartsWithT);

    boolean allLength5 = cities.stream().allMatch(city -> city.length() == 5);
    System.out.println("allLength5 = " + allLength5);

    boolean noneEndsWiths = cities.stream().noneMatch(city -> city.endsWith("s"));
    System.out.println("noneEndsWiths = " + noneEndsWiths);

  }

}
