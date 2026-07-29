class College{
    void department() {
        System.out.println("Welcome to EEC");
    }
}

class CSE extends College {
    @Override
    void department() {
        System.out.println("Welcome to CSE Depatment");
    }
}

class ECE extends College {
    @Override
    void department() {
        System.out.println("Welcome to ECE Department");
    }
}

public class Main {
    public static void main(String[] args) {

        College c;

        c = new CSE();
        c.department();

        c = new ECE();
       c.department();
          }
}
