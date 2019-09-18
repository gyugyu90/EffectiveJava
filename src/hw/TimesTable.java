package hw;


public final class TimesTable {

    private int number;

    public TimesTable(int number) {
        this.number = number;
    }

    public void printTimeLine() {
        for(int i = 1; i <= 9; i++) {
            System.out.println(String.format("%d X %d = %d", number, i, number * i));
        }
    }

}
