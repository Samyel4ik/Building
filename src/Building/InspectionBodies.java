package Building;

public class InspectionBodies implements CompetentAuthority { //орган
    String name;
    Notification notification;
    Type type;

    public InspectionBodies(String name, Type type) {
        this.name = name;
        this.type = type;
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
