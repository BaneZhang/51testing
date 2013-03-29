package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:19
 */
public class Stub {
    static int add(int x, int y) {
        if (x == 3 && y == 2) {
            return 5;
        }

        if (x == 3 && y == 4) {
            return 7;
        }

        return 9999;
    }

    static int sub(int x, int y) {
        if (x == 3 && y == 4) {
            return -1;
        }

        if (x == 3 && y == 2) {
            return 1;
        }

        return 9999;
    }
}
