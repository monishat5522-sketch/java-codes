class mygrandpa{
    void display()
    {
        System.out.println("my grandfather is a farmer");
    }
}
  class mydaddy extends mygrandpa{
      void show(){
          System.out.println("my father is a business man");
      }
  }
  class Me extends mydaddy {
      void display()
     {
         System.out.println("i am a student");
     }
  }
  public class Main {
      public static void main(String[] args)
      {
          Me Obj = new Me ();
          Obj.display();
          Obj.show();
          Obj.display();
      }
   }
  
