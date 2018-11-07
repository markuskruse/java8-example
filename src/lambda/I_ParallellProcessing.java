package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class I_ParallellProcessing implements Runnable {

  public static void main(String[] args) throws InterruptedException {
    Thread dotPrinterThread = new Thread(new I_ParallellProcessing());
    dotPrinterThread.start();

    List<String> cities = Arrays.asList("Paris", "London", "Tokyo", "Talinn");

    Consumer<String> tasks = city -> {
      //this takes time
      try { Thread.sleep(5000); } catch (InterruptedException e) { }
      System.out.println(city);
    };

    //old fashioned loop
    for (String city : cities) {
      tasks.accept(city);
    }

    //what it someone created a utility to run it in parallell????
    System.out.println("Welcome to the future of 2014");
    cities.parallelStream().forEach(tasks);

    Thread.sleep(100);
  }

  @Override
  public void run() {
    for (int i = 0; i < 50; i++) {
      System.out.print(".");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}
