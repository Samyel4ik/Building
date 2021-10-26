package Building;

public class InspectionCheckSize implements CompetentAuthority { //орган1
    String name;
    Wall wall;
    Type type = Type.COUNTER_SIZE;

    public InspectionCheckSize(String name) {
        this.name = name;
    }

    @Override
    public boolean wallMatching() {
        int builtWallSize = 0;
        for (int i = 0; i < wall.getList().size(); i++) {
            builtWallSize = builtWallSize + wall.getList().get(i).getSize();
        }
        return (builtWallSize == wall.getSizeWall());
    }

    @Override
    public void acceptNotification(Wall wall) {
        this.wall = wall;
    }

    @Override
    public String toString() {
        return this.name + " провел проверку над стеной " + this.wall + " заключение " + wallMatching();
    }
}
