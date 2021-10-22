package Building;

import java.util.List;

public class Wall {
    List<Brick> list;
    int sizeWall;
    int amountOfSolution;

    public Wall(List<Brick> list, int sizeWall, int amountOfSolution) {
        this.list = list;
        this.sizeWall = sizeWall;
        this.amountOfSolution = amountOfSolution;
    }

    public List<Brick> getList() {
        return list;
    }

    public int getSizeWall() {
        return sizeWall;
    }

    public int getAmountOfSolution() {
        return amountOfSolution;
    }
}
