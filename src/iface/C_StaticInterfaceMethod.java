package iface;

public class C_StaticInterfaceMethod implements PowerfulInterface {

  public static void main(String[] args) {
    PowerfulInterface spiderman = new C_StaticInterfaceMethod();

    System.out.println("spiderman.greatPower() = " + spiderman.greatPower());
    System.out.println("spiderman.greatResponsibility() = " + spiderman.greatResponsibility());
    System.out.println("PowerfulInterface.greatFame() = " + PowerfulInterface.greatFame());
  }

  @Override
  public boolean greatPower() {
    return true;
  }

  @Override
  public boolean greatResponsibility() {
    return true;
  }
}
