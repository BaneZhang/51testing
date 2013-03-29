package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:22
 */
public class UnitBeingTested {
    static int Ctr(int x, int y) {
        if (x >= y) {
            return Stub.Add(x, y);
        } else {
            return Stub.Sub(x, y);
        }
    }
}
