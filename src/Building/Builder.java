package Building;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Builder implements Notifier {
    List<Wall> wallList = new ArrayList<>();
    Map<Type, CompetentAuthority> inspectionBody = new HashMap<>();

    Map<Character, Type> characterTypeMap = new HashMap<>();

    {
        characterTypeMap.put(Character.BEARING, Type.COUNTER_SIZE);
        characterTypeMap.put(Character.PARTITION, Type.CHECKS_SOUND_INSULATION);
        characterTypeMap.put(Character.EXTERNAL, Type.CHECKS_THERMAL_CONDUCTIVITY);
    }


    @Override
    public void notifyTheCompetentAuthority(Wall wall) {
        Character character = wall.getCharacter();
        if (characterTypeMap.containsKey(character)) {
            inspectionBody.get(characterTypeMap.get(character)).acceptNotification(wall);
        }

    }

    public void buildAWall(List<Brick> list, int sizeWall, int amountOfSolution, Character character) {
        Wall wall = new Wall(list, sizeWall, amountOfSolution, character);
        this.wallList.add(wall);

        notifyTheCompetentAuthority(wall);
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
