package ClassRoomExercise.demo5.demo06;

public class Motion {

    private int distance;
    private int time;
    private Direction direction;

    private Motion() {

    }
    public Motion(int distance, int time, Direction direction) {
        this.distance = distance;
        this.time = time;
        this.direction = direction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        System.out.println("移动了" + distance + "米，用时" + time + "秒，方向为" + direction);
    }

    public double getSpeed() {
        return (double) distance / time;
    }
}
