/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static basiclibrary.Library.tally;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void returnRollsTest() {
        // Arrange
        Library sut = new Library();
        int n = 5;

        // Act
        int[] result = sut.roll(n);

        // Assert
        assertEquals(n, result.length, "Incorrect array length");

        for (int roll : result) {
            assertTrue(roll >= 1 && roll <= Library.numOfSides, "Invalid roll value");
        }
    }
    @Test void containsDuplicates_ReturnsFalse_test() {
        // Arrange
        Library sut = new Library();
        int[] array = {1, 2, 3, 4, 5};

        // Act
        boolean result = sut.containsDuplicates(array);

        // Assert
        assertFalse(result, "Expected no duplicates");
    }

    @Test void containsDuplicates_ReturnsTrue_test() {
        // Arrange
        Library sut = new Library();
        int[] array = {1, 2, 3, 4, 3, 5};

        // Act
        boolean result = sut.containsDuplicates(array);

        // Assert
        assertTrue(result, "Expected duplicates to exist");
    }

    @Test void calculateAverage_ReturnsCorrectAverage_test() {
        // Arrange
        Library sut = new Library();
        int[] array1 = {6, 2, 3, 4, 5};
        int[] array2 = {30, 50, 40, 20, 10};
        int[] array3 = {0, 1, -1};

        // Act
        double result1 = sut.calculateAverage(array1);
        double result2 = sut.calculateAverage(array2);
        double result3 = sut.calculateAverage(array3);

        // Assert
        assertEquals(4.0, result1, "Expected average to be 3.0");
        assertEquals(30.0, result2, "Expected average to be 30.0");
        assertEquals(0.0, result3, "Expected average to be 0.0");
    }

    @Test public void testLowestAverage() {
        int[][] arrays = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Library sut = new Library();
        int[] result = sut.lowestAverage(arrays);

        int[] expected = {1, 2, 3};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test public void testAnalyzeWeatherData() {
        // Arrange
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        Library sut = new Library();

        // Act
        String result = sut.analyzeWeatherData(weeklyMonthTemperatures);

        // Assert
        String expected = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 63\n" +
                "Never saw temperature: 67\n" +
                "Never saw temperature: 68\n" +
                "Never saw temperature: 69\n";

        assertEquals(expected, result);
    }


    @Test
    public void tally_ReturnsWinnerName_test() {
        // Arrange
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        // Act
        String winner = tally(votes);

        // Assert
        assertEquals("Bush", winner);
    }
}

