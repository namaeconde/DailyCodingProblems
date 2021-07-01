import org.junit.Test;

public class TestIsUnique {

    @Test
    public void testUniqueString() {

        assert IsUnique.check("ab");
        assert IsUnique.check("aA");
        assert IsUnique.check("1234567890");
    }

    @Test
    public void testNotUniqueString() {

        assert !IsUnique.check("bbabb");
        assert !IsUnique.check("AAb");
        assert !IsUnique.check("abab");
    }
}
