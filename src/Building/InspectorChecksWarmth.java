package Building;

import java.util.HashMap;
import java.util.Map;

public class InspectorChecksWarmth implements CompetentAuthority {
    String name;
    Wall wall;
    Type type = Type.CHECKS_THERMAL_CONDUCTIVITY;

    public InspectorChecksWarmth(String name) {
        this.name = name;
    }

    @Override
    public void acceptNotification(Wall wall) {
        this.wall = wall;
    }


    @Override
    public boolean wallMatching() {

        int builtWallSize = 0;
        for (int i = 0; i < this.wall.getList().size(); i++) {
            builtWallSize = builtWallSize + this.wall.getList().get(i).getSize();
        }
        return (builtWallSize / this.wall.getAmountOfSolution() > 2);
    }

    @Override
    public Wall getWall() {
        return wall;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return this.name + " провел проверку над стеной " + this.wall + " заключение " + wallMatching();
    }
}
