package GenericAndDiamondOperators;

public class GenericClass <T> {
    private T thing;
     GenericClass(T thing) {
        this.thing = thing;
    }
    public T getThing() {
        return thing;
    }
    public void setThing(T thing) {
        this.thing = thing;
    }
}
