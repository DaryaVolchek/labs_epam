package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderJava {
    @DataProvider
    public static Object[][] additionDataProvider() {
        return new Object[][]{{2, 3, 5}, {5, 10, 15}};
    }

    @DataProvider
    public static Object[][] substractionDataProvider() {
        return new Object[][]{{7, 3, 4}, {15, 5, 10}};
    }

    @DataProvider
    public static Object[][] multiplicationDataProvider() {
        return new Object[][]{{6, 2, 12}, {10, 8, 80}};
    }

    @DataProvider
    public static Object[][] divisionDataProvider() {
        return new Object[][]{{70, 10, 7}, {16, 2, 8}};
    }

    @DataProvider
    public static Object[][] divisionByZeroDataProvider() {
        return new Object[][]{{1, 0}};
    }
}
