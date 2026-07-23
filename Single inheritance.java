class parent{
    void display()
    {
        System.out.println("this is the parent class.");
    }
}
  class Child extends parent{
      void show(){
          System.out.println("this is the child class.");
      }
  }
  public class Main {
      public static void main(String[] args)
      {
          Child obj = new Child();
          obj.display();
          obj.show();
   }
  }
