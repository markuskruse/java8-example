package iface;

import java.util.Arrays;
import java.util.List;

public class B_DefaultImplementation {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");
    OldInterface oldInterface = new LegacyImpl();
    oldInterface.runningCodeSince1999(cities);

    //oldInterface.shinyNewCode2014(cities);
  }

}
