import org.junit.Test;

public class TestStrstr {

    @Test
    public void testValidStr() {

        assert 2 == Strstr.strStr("hello", "ll");
        assert 0 == Strstr.strStr("a", "a");
    }
}
