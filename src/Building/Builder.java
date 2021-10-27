package Building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder implements Notifier {
    List<Wall> wallList = new ArrayList<>();
    Map<Type, CompetentAuthority> inspectionBody = new HashMap<>();


    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution, Character character) {
        Wall wall = new Wall(list, sizeWall, amountOfSolution, character);
        this.wallList.add(wall);

        notifyTheCompetentAuthority(wall);
    }

    @Override
    public void notifyTheCompetentAuthority(Wall wall) {
        for (int i = 0; i < this.wallList.size(); i++) {

            if (wall.getCharacter().equals(Character.BEARING)) {
                this.inspectionBody.get(Type.COUNTER_SIZE).acceptNotification(wall);
            }
            if (wall.getCharacter().equals(Character.PARTITION)) {
                this.inspectionBody.get(Type.CHECKS_SOUND_INSULATION).acceptNotification(wall);
            }
            if (wall.getCharacter().equals(Character.EXTERNAL)) {
                this.inspectionBody.get(Type.CHECKS_THERMAL_CONDUCTIVITY).acceptNotification(wall);
            }
        }
    }

    public void addInspectionBodies(CompetentAuthority inspectionBodies) {
        Type type = inspectionBodies.getType();
        this.inspectionBody.put(type, inspectionBodies);
    }


    public List<Wall> getWallList() {
        return wallList;
    }

    public Map<Type, CompetentAuthority> getInspectionBody() {
        return inspectionBody;
    }
}
