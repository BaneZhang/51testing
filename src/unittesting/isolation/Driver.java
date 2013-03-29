package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:28
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
        result = UnitBeingTested.add(x, y);
        if (result == expect) {
            System.out.println("The add(int,int) unit pass.");
        } else {
            System.out.println("The add(int,int) unit fail");
        }
    }

    static void sub(int x, int y, int expect) {
        int result;
        result = UnitBeingTested.sub(x, y);
        if (result == expect) {
            System.out.println("The sub(int,int) unit pass.");
        } else {
            System.out.println("The sub(int,int) unit fail");
        }
    }
}
