
public class ThisDemo {
   private String name;
   private int price;
   public void display() {
      System.out.println("name = " + name);
      System.out.println("price = " + price);
   }
   public ThisDemo() {//default Constructor
      //new ThisDemo("unknown",10_000);//�ּҰ� �ٸ����� �����.
      this("unknown",10000); 
      //this() == �� �ּҸ� �ȸ���� ������ ȣ��
      //������ �ȿ����� ��밡�� , ������ ù��° ��
   }
   public ThisDemo(String name) {//�����ε��� ������ �ɼ��� ��������.
      this.name = name;
   }
   public ThisDemo(int price) {
      this.price = price;
   }
   public ThisDemo(String name, int price) {
      this.name = name;
      this.price = price;
   }
}