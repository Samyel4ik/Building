package Building;

public class Notification {//уведомление
    String text;
    Wall wall;

    public Notification( Wall wall) {
        this.wall = wall;
    }

    public Wall getWall() {
        return wall;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "text='" + text + '\'' +
                ", wall=" + wall +
                '}';
    }
}
