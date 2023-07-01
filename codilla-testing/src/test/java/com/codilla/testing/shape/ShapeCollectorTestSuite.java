package com.codilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #: " + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All test are finished");
    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    class ShapeTests {

        @Test
        void addFigureTest() {
            //Given
            Square square = new Square(3.98);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(square);

            //Then
            assertEquals(1, shapeCollector.getShapes().size());
        }

        @Test
        void removeFigureTest() {
            //Given
            Square square = new Square(3.95);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            assertEquals(0, shapeCollector.getShapes().size());
        }

        @Test
        void getFigureTest() {
            //Given
            Square square = new Square(3.95);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(square);

            //When
            Shape tested = shapeCollector.getFigure(0);

            //Then
            assertEquals(square, tested);
        }
    }
}
