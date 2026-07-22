class Rationshop {
    int cardno;
    int noofiteam;
    String iteamname;
    int quantity;
    String date;

    Rationshop(int cardno, int noofiteam, String iteamname, int quantity, String date) {
        this.cardno = cardno;
        this.noofiteam = noofiteam;
        this.iteamname = iteamname;
        this.quantity = quantity;
        this.date = date;
    }

    void display() {
        System.out.println("Card No : " + cardno);
        System.out.println("No of Items : " + noofiteam);
        System.out.println("Item Name : " + iteamname);
        System.out.println("Quantity : " + quantity + " KG");
        System.out.println("Date : " + date);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Rationshop[] ration = new Rationshop[2];

        ration[0] = new Rationshop(7024354, 1, "Sugar", 1, "22/7/2026");
        ration[1] = new Rationshop(2045671, 1, "Oil", 3, "21/7/2026");

        for (int i = 0; i < ration.length; i++) {
            ration[i].display();
        }
    }
}
