package exercitiiInterfete;

public class Square implements IRegularPolygon{

    int sideLenght;

    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return this.sideLenght;
    }
}
