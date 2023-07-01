package com.codilla.testing.forum.tdd;

import com.codilla.testing.forum.ForumPost;
import com.codilla.testing.forum.ForumComment;
import com.codilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginnig of tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #: " + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestsPosts {
        @Test
        void testAddPost() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");

            //When
            user.addPost("nick", "my Post");

            //Then
            assertEquals(1, user.getPostQuantity());
        }

        @Test
        void testGetPost() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");
            user.addPost(post.getAuthor(), post.getPostBody());

            //When
            ForumPost retrievedPost;
            retrievedPost = user.getPost(0);

            //Then
            assertEquals(post, retrievedPost);
        }

        @Test
        void testRemovePostNotExisting() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");

            //When
            boolean result = user.removePost(post);

            //Then
            assertFalse(result);
        }

        @Test
        void testRemovePost() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");
            user.addPost(post.getAuthor(), post.getPostBody());

            //When
            boolean result = user.removePost(post);

            //Then
            assertTrue(result);
            assertEquals(0, user.getPostQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class TestsComments {
        @Test
        void testGetComment() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");
            ForumComment comment = new ForumComment(post, "my comment", "nick");
            user.addComment(post, comment.getAuthor(), comment.getCommentBody());

            //When
            ForumComment retrievedComment = user.getComment(0);

            //Then
            assertEquals(comment, retrievedComment);
        }

        @Test
        void testAddComment() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");

            //When
            user.addComment(post, "nick", "My comment");

            //Then
            assertEquals(1, user.getCommentQuantity());
        }

        @Test
        void testRemoveCommentNotExisting() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");
            ForumComment comment = new ForumComment(post, "my comment", "nick");

            //When
            boolean result = user.removeComment(comment);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveComment() {
            //Given
            ForumUser user = new ForumUser("nick", "John Smith");
            ForumPost post = new ForumPost("my Post", "nick");
            ForumComment comment = new ForumComment(post, "my comment",
                    "nick");
            user.addComment(post, comment.getAuthor(),
                    comment.getCommentBody());

            //When
            boolean result = user.removeComment(comment);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, user.getCommentQuantity());
        }
    }
}
