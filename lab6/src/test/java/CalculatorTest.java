import dataProvider.DataProviderJava;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test(dataProvider = "additionDataProvider", dataProviderClass = DataProviderJava.class)
    public void validValuesForAddition(int firstNumber, int secondNumber, int expectedNumber){
        Assert.assertEquals(Calculator.addition(firstNumber, secondNumber), expectedNumber);
    }

    @Test(dataProvider = "substractionDataProvider", dataProviderClass = DataProviderJava.class)
    public void validValuesForSubstraction(int firstNumber, int secondNumber, int expectedNumber){
        Assert.assertEquals(Calculator.substraction(firstNumber, secondNumber), expectedNumber);
    }

    @Test(dataProvider = "multiplicationDataProvider", dataProviderClass = DataProviderJava.class)
    public void validValuesForMultiplication(int firstNumber, int secondNumber, int expectedNumber){
        Assert.assertEquals(Calculator.multiplication(firstNumber, secondNumber), expectedNumber);
    }

    @Test(dataProvider = "divisionDataProvider", dataProviderClass = DataProviderJava.class)
    public void validValuesForDivision(int firstNumber, int secondNumber, int expectedNumber){
        Assert.assertEquals(Calculator.division(firstNumber, secondNumber), expectedNumber);
    }

    @Test(dataProvider = "divisionByZeroDataProvider", dataProviderClass = DataProviderJava.class)
    public void validValuesForDivision(int firstNumber, int secondNumber){
        Assert.expectThrows(ArithmeticException.class, () -> Calculator.division(firstNumber, secondNumber));
    }
}
