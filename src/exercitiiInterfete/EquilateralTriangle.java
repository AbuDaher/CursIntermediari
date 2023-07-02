package exercitiiInterfete;

public class EquilateralTriangle implements IRegularPolygon{

    int sideLength;

    public EquilateralTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return this.getNumSides();
    }
}
