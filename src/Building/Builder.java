package Building;

import java.util.List;

public class Builder implements Notifier {
    Wall wall;
    List<Wall> wallList;
    List<CompetentAuthority> inspectionBody;

    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution) {
        this.wall = new Wall(list, sizeWall, amountOfSolution);
        this.wallList.add(this.wall);
    }


    public void addInspectionBodies(CompetentAuthority inspectionBodies) {
        this.inspectionBody.add(inspectionBodies);
    }

    @Override
    public void notifyTheCompetentAuthority(String text) {
        Notification notification = new Notification(text, this.wall);

        for (int i = 0; i < this.inspectionBody.size(); i++) {
            this.inspectionBody.get(i).acceptNotification(notification);
        }
    }
}
