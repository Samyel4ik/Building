package Building;

public class Notification {//уведомление
    String text;
    Wall wall;

    public Notification(String text, Wall wall) {
        this.text = text;
        this.wall = wall;
    }

    public String getText() {
        return text;
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
