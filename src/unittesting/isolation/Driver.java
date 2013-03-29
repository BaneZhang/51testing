package unittesting.isolation;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 18:28
 */
public class Driver {
    static void Ctr() {
        int result;
        result = UnitBeingTested.Ctr(3, 2);
        if (result == 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        result = UnitBeingTested.Ctr(3, 4);
        if (result == -1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
