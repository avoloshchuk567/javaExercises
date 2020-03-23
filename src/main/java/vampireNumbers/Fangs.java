package vampireNumbers;

public class Fangs {
    private int firstFang;
    private int secondFang;
    private String message;

    public Fangs(int firstFang, int secondFang, String message) {
        this.firstFang = firstFang;
        this.secondFang = secondFang;
        this.message = message;
    }

    public int getFirstFang() {
        return firstFang;
    }

    public int getSecondFang() {
        return secondFang;
    }

    public String getMessage() {
        return message;
    }
}
