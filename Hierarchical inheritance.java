class mydaddy{
    void display()
    {
        System.out.println("my father is farmer");
    }
}
  class mysister extends mydaddy{
      void show(){
          System.out.println("my sister is a teacher");
      }
  }
  class me extends mydaddy {
      void  display(){
          System.out.println("i am a student");
      }
  }
  public class Main{
      public static void main(String[] args)
      {
          me obj = new me();
          obj.display();
          mysister obj1 = new mysister();
          obj1.show();
         obj.display();
   }
  }
