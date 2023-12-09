package BaiThi2;

public class Flight {
    private int Number;
    private String destination;
    public Flight() {
        Number = 0;
        destination = "";
    }

    public Flight(int number, String dest) {
        Number = (number > 0) ? number : 0;
        destination = dest;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return Number;
    }

    public void display() {
        System.out.println(Number + ", " + destination);
    }


}