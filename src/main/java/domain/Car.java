package domain;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        validate(name);

        this.name = name;
        this.position = 0;
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("자동차의 이름은 빈칸이 아니어야 합니다");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차의 이름은 5글자 이하이어야 합니다");
        }
    }

    public void move(boolean isMove) {
        if (isMove) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}