package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:28
 */
public class Driver {
    static void ctr() {
        int result;
        result = UnitBeingTested.ctr(3, 2);
        if (result == 5) {
            System.out.println("The ctr(int,int) unit pass.");
        } else {
            System.out.println("The ctr(int,int) unit fail.");
        }

        result = UnitBeingTested.ctr(3, 4);
        if (result == -1) {
            System.out.println("The ctr(int,int) unit pass.");
        } else {
            System.out.println("The ctr(int,int) unit fail.");
        }
    }

    static void add() {
        int result;
        result = UnitBeingTested.add(3, 2);
        if (result == 5) {
            System.out.println("The add(int,int) unit pass.");
        } else {
            System.out.println("The add(int,int) unit fail");
        }
    }

    static void sub() {
        int result;
        result = UnitBeingTested.sub(3, 4);
        if (result == -1) {
            System.out.println("The sub(int,int) unit pass.");
        } else {
            System.out.println("The sub(int,int) unit fail");
        }
    }
}
