package Building;

public class InspectorChecksWarmth implements CompetentAuthority {
    String name;
    Notification notification;
    Type type;

    public InspectorChecksWarmth(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void acceptNotification(Notification notification) {
        this.notification = notification;
    }

    @Override
    public boolean wallMatching() {
        Wall wall = this.notification.getWall();
        int builtWallSize = 0;
        for (int i = 0; i < wall.getList().size(); i++) {
            builtWallSize = builtWallSize + wall.getList().get(i).getSize();
        }
        return (builtWallSize / wall.getAmountOfSolution() > 2);
    }

    public String getName() {
        return name;
    }

    public Notification getNotification() {
        return notification;
    }

    public Type getType() {
        return type;
    }
}
