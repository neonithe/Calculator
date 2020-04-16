package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest
{
    @Test
    public void test_addition() {
        //Arrange
            int first = 5;
            int second = 5;
            int expected =10;
        //Act
            int realResult = Calc.addition(first,second);
        //Assert
          assertEquals(expected, realResult);

      }
    @Test
    public void test_subtraction() {
        //Arrange
        int first = 5;
        int second = 5;
        int expected =0;
        //Act
        int realResult = Calc.subtraction(first,second);
        //Assert
        assertEquals(expected, realResult);

    }
    @Test
    public void test_division() {
        //Arrange
        int first = 5;
        int second = 5;
        int expected =1;
        //Act
        int realResult = Calc.division(first,second);
        //Assert
        assertEquals(expected, realResult);

    }
    @Test
    public void test_multiplication() {
        //Arrange
        int first = 5;
        int second = 5;
        int expected =25;
        //Act
        int realResult = Calc.multiplication(first,second);
        //Assert
        assertEquals(expected, realResult);

    }
    @Test
    public void test_checkInt_fail() {
        //Arrange
        String error = "error";
        int expected =0;
        //Act
        int realResult = Input.checkIntNumber(error);
        //Assert
        assertEquals(expected, realResult);

    }
    @Test
    public void test_checkInt_noFail() {
        //Arrange
        String noError = "123";
        int expected =123;
        //Act
        int realResult = Input.checkIntNumber(noError);
        //Assert
        assertEquals(expected, realResult);

    }
    /*    @Test
    public void test_a_becomes_n(){
        //Arrange
        char source = 'a';
        char expected = 'n';
        //Act
        char actual = Rot13Converter.convertChar(source);
        //Assert
        assertEquals(expected, actual);
    } */

/*    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    } */
}
