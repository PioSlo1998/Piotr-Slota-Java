package com.codilla.testing.forum;

import com.codilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: End");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: End");
    }

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )
    @Test
    void testCaseUsername() {
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "Wojciech Salami");
        //When
        String result = user.getUsername();
        String expectedResult = "theForumUser";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName(
            "when create SimpleUser with realName, " +
            "then getRealName should return correct realName"
    )

    @Test
    void testCaseRealName() {
        //Given
        SimpleUser user = new SimpleUser("theForumUser", "Wojciech Salami");
        //When
        String result = user.getRealName();
        String expectedResult = "Wojciech Salami";
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
