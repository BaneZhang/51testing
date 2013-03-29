package unittesting.topdown;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 20:23
 */
public class Driver {
    static void ctr(int x, int y, int expect) {
        int result;
        result = UnitBeingTested.ctr(x, y);
        if (result == expect) {
            System.out.println("The ctr(int,int) unit pass.");
        } else {
            System.out.println("The ctr(int,int) unit fail.");
        }
    }

    static void add(int x, int y, int expect) {
        int result;
        if (x >= y) {
            result = UnitBeingTested.add(x, y);
            if (result == expect) {
                System.out.println("The add(int,int) unit pass.");
            } else {
                System.out.println("The add(int,int) unit fail.");
            }
        } else {
            Stub.sub(x, y);
        }
    }

    static void sub(int x, int y, int expect) {
        int result;
        if (x >= y) {
            UnitBeingTested.add(x, y);
        } else {
            result = UnitBeingTested.sub(x, y);
            if (result == expect) {
                System.out.println("The sub(int,int) unit pass.");
            } else {
                System.out.println("The sub(int,int) unit fail");
            }
        }
    }
}
