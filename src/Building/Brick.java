package Building;

public class Brick {
    int weight;
    int size;

    public Brick(int weight, int size) {
        this.weight = weight;
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Brick{" +
                "weight=" + weight +
                ", size=" + size +
                '}';
    }
}
