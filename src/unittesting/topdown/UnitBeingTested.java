package unittesting.topdown;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 20:12
 */
public class UnitBeingTested {
    static int ctr(int x, int y) {
        if (x >= y) {
            return add(x, y);
        } else {
            return sub(x, y);
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }

}
