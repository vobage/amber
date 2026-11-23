package vobage;

public class car {
    private String color;

    static void main(String[] args) {
        car car1 = new car();
        car car2;
        car2 = new car();
        car1.setColor("black");
        car2.setColor("red");
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;

    }
}
