package Building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder implements Notifier {
    Map<Character, Wall> wallList = new HashMap<>();
    Map<Type, CompetentAuthority> inspectionBody = new HashMap<>();


    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution, Character character) {
        Wall wall = new Wall(list, sizeWall, amountOfSolution);
        this.wallList.put(character, wall);

        notifyTheCompetentAuthority(wall);
    }

    @Override
    public void notifyTheCompetentAuthority(Wall wall) {

        for (int i = 0; i < this.wallList.size(); i++) {
            this.inspectionBody.get(Type.COUNTER_SIZE).acceptNotification(this.wallList.get(Character.BEARING));
            this.inspectionBody.get(Type.CHECKS_SOUND_INSULATION).acceptNotification(this.wallList.get(Character.PARTITION));
            this.inspectionBody.get(Type.CHECKS_THERMAL_CONDUCTIVITY).acceptNotification(this.wallList.get(Character.EXTERNAL));

        }
    }

    public void addInspectionBodies(CompetentAuthority inspectionBodies) {
        Type type = inspectionBodies.getType();
        this.inspectionBody.put(type, inspectionBodies);
    }


    public Map<Character, Wall> getWallList() {
        return wallList;
    }

    public Map<Type, CompetentAuthority> getInspectionBody() {
        return inspectionBody;
    }
}
