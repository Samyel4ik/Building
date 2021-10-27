package Building;

import java.util.List;

public class Wall {
    List<Brick> list;
    int sizeWall;
    int amountOfSolution;
    Character character;

    public Wall(List<Brick> list, int sizeWall, int amountOfSolution, Character character) {
        this.list = list;
        this.sizeWall = sizeWall;
        this.amountOfSolution = amountOfSolution;
        this.character = character;
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

    public Character getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "list=" + list +
                ", sizeWall=" + sizeWall +
                ", amountOfSolution=" + amountOfSolution +
                ", character=" + character +
                '}';
    }
}
