package Building;

public class InspectionCheckSize implements CompetentAuthority { //орган1
    String name;
    Notification notification;
    Type type;

    public InspectionCheckSize(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean wallMatching() {
        Wall wall = this.notification.getWall();
        int builtWallSize = 0;
        for (int i = 0; i < wall.getList().size(); i++) {
            builtWallSize = builtWallSize + wall.getList().get(i).getSize();
        }
        return (builtWallSize == wall.getSizeWall());
    }

    @Override
    public void acceptNotification(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }
}
