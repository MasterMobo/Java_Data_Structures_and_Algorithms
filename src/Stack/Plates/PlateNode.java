package Stack.Plates;

public class PlateNode {
    int val;
    PlateNode above;
    PlateNode below;

    public PlateNode(int val) {
        this.val = val;
    }

    public PlateNode(int val, PlateNode above, PlateNode below) {
        this.val = val;
        this.above = above;
        this.below = below;
    }
}
