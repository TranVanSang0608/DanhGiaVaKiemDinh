import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NextDateTest {

    @Test
    public void testNextDateWithLastDayOfFebruary2020() {
        int[] nextDate = NextDate.nextDate(29, 2, 2020);
        Assertions.assertEquals(1, nextDate[0]);
        Assertions.assertEquals(3, nextDate[1]);
        Assertions.assertEquals(2020, nextDate[2]);
    }

    @Test
    public void testNextDateWithLastDayOfDecember2021() {
        int[] nextDate = NextDate.nextDate(31, 12, 2021);
        Assertions.assertEquals(1, nextDate[0]);
        Assertions.assertEquals(1, nextDate[1]);
        Assertions.assertEquals(2022, nextDate[2]);
    }

    @ParameterizedTest
    @CsvSource({
            "31, 1, 2022, 1, 2, 2022",
            "30, 4, 2022, 1, 5, 2022",
            "28, 2, 2022, 1, 3, 2022",
            "29, 2, 2024, 1, 3, 2024"
    })
    public void testNextDateWithVariousInputValues(int day, int month, int year, int expectedDay, int expectedMonth, int expectedYear) {
        int[] nextDate = NextDate.nextDate(day, month, year);
        Assertions.assertEquals(expectedDay, nextDate[0]);
        Assertions.assertEquals(expectedMonth, nextDate[1]);
        Assertions.assertEquals(expectedYear, nextDate[2]);
    }
}