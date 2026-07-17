class Main {
    public static void main(String[] args) {
        int n =5;
        int fact = factorial(n);
        System.out.println("Factorial of a number is :"+fact);
      }
      static int factorial(int k ){
          int ans =1;
          for(int i =1;i<=k;i++)
          {
              ans = ans*i;
      }
          return ans;
      }
}
