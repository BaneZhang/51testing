package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:22
 */
public class UnitBeingTested {
    static int ctr(int x, int y) {
        if (x >= y) {
            return Stub.add(x, y);
        } else {
            return Stub.sub(x, y);
        }
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int sub(int x, int y) {
        return x - y;
    }
}
