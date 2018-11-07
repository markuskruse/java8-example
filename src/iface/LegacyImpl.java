package iface;

import java.util.List;

public class LegacyImpl implements OldInterface {

  @Override
  public void runningCodeSince1999(List<String> list) {
    for (int i = 0; i < list.size(); i++) {
      String s = list.get(i);
      System.out.println("s = " + s);
    }
  }

}
