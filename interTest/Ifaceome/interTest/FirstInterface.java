/**
 * 
 */
package interTest;

/**
 * @author mercenery
 *
 */
public interface FirstInterface {
    int iDefault = 30;

    void methodOne();

    void metodTwo();

    default void defaultMetodOne(int i) {
	System.out.println(i);
    }

    default void defaultMetodTwo(double g) {
	System.out.println("def2 " + g);
    }
}
