package racingcar;

public class CarBefore {
    private final String name;
    private int position;

    public CarBefore(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void racing(int number) {
        if(number >= 4)
            this.position++;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String printCarStatus() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(" : ");
        for (int i = 0; i < position; i++) {
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
