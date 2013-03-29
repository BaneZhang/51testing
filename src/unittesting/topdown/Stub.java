package unittesting.topdown;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 20:18
 */
public class Stub {
    static int sub(int x, int y) {
        if (x == 3 && y == 4) {
            return -1;
        }

        return 9999;
    }

}
