class Main {
    public static void main(String[] args) {
        int n =5;
        pat(5);
      }
      static void pat(int k ){
          if(k==0)
          {
              return;
      }
      System.out.println(k);
      k = k -1;
      pat(k);
      }
}
