package Building;

import java.util.List;

public class Builder implements Notifier {
    List<Wall> wallList;
    List<CompetentAuthority> inspectionBody;

    public void setWallList(List<Wall> wallList) {
        this.wallList = wallList;
    }

    public void setInspectionBody(List<CompetentAuthority> inspectionBody) {
        this.inspectionBody = inspectionBody;
    }

    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution) {
        Wall wall = new Wall(list, sizeWall, amountOfSolution);
        this.wallList.add(wall);

        notifyTheCompetentAuthority(wall);
    }


    @Override
    public void notifyTheCompetentAuthority(Wall wall) {

        for (int i = 0; i < this.inspectionBody.size(); i++) {
            this.inspectionBody.get(i).acceptNotification(wall);
        }
    }


    public void addInspectionBodies(CompetentAuthority inspectionBodies) {
        this.inspectionBody.add(inspectionBodies);
    }


    public List<Wall> getWallList() {
        return wallList;
    }

    public List<CompetentAuthority> getInspectionBody() {
        return inspectionBody;
    }
}
