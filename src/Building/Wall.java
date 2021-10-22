package Building;

public class Wall {
    String wallType;
    int numberOfBricks;
    int sizeWall;
    int brickWeight;

    public Wall(String wallType, int numberOfBricks, int sizeWall, int brickWeight) {
        this.wallType = wallType;
        this.numberOfBricks = numberOfBricks;
        this.sizeWall = sizeWall;
        this.brickWeight = brickWeight;
    }

    @Override
    public String toString() {
        return "! Характеристика стены - " + this.wallType + "," + "количество кирпичей - " + this.numberOfBricks + "," + "размер стены - " + this.sizeWall + " м2"+" ," + "вес кирпича - " + this.brickWeight + "грамм.";
    }
}
