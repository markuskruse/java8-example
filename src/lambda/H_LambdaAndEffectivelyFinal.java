package lambda;

import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class H_LambdaAndEffectivelyFinal {

  public static void main(String[] args) {
    double amount = Double.valueOf(JOptionPane.showInputDialog("Enter amount"));
    //amount = 2;

    List<String> cities = Arrays.asList("Paris", "London", "Tokyo");
    cities.forEach(city -> {
      //amount = 10;
      if (amount < 5) {
        System.out.println("city = " + city);
      }
    });

  }

}
