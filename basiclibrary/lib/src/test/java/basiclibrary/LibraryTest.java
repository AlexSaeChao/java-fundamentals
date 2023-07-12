/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void returnRollsTest() {
        // Arrange
        int n = 5;
        Library sut = new Library();

        // Act
        int[] result = sut.roll(n);

        // Assert
        assertEquals(n, result.length, "Incorrect array length");

        for (int roll : result) {
            assertTrue(roll >= 1 && roll <= Library.numOfSides, "Invalid roll value");
        }
    }
}
