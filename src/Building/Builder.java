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

    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution, Character character) {
        Wall wall = new Wall(list, sizeWall, amountOfSolution, character);
        this.wallList.add(wall);

        notifyTheCompetentAuthority(wall);
    }


    @Override
    public void notifyTheCompetentAuthority(Wall wall) {

        for (int i = 0; i < this.inspectionBody.size(); i++) {

            if (wall.getCharacter().equals(Character.BEARING)) {
                if (this.inspectionBody.get(i).getType().equals(Type.COUNTER_SIZE)) {
                    this.inspectionBody.get(i).acceptNotification(wall);
                }
            }
            if (wall.getCharacter().equals(Character.PARTITION)) {
                if (this.inspectionBody.get(i).getType().equals(Type.CHECKS_SOUND_INSULATION)) {
                    this.inspectionBody.get(i).acceptNotification(wall);
                }
            }
            if (wall.getCharacter().equals(Character.EXTERNAL)) {
                if (this.inspectionBody.get(i).getType().equals(Type.CHECKS_THERMAL_CONDUCTIVITY)) {
                    this.inspectionBody.get(i).acceptNotification(wall);
                }
            }
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
