package goit.vladyslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KataTest {

    private static Kata kata;

    @BeforeEach
    public void beforeEach() {
        kata = new Kata();
    }

    public static void kataTest(String actual, String expected) {
        String expectedResult = kata.incrementString(actual);
        Assertions.assertEquals(expected, expectedResult);
    }

    @Test
    public void exTes() {
        kataTest("", "1");
        kataTest("ffg", "ffg1");
        kataTest("H(4b", "H(4b1");
        kataTest("foobar000", "foobar001");
        kataTest("foo", "foo1");
        kataTest("foobar99", "foobar100");
        kataTest("foobar099", "foobar100");
        kataTest("fo99obar99", "fo99obar100");
        kataTest("?", "?1");
        kataTest("OQXzMEcd5BDE01090327171971305030373", "OQXzMEcd5BDE01090327171971305030374");
        kataTest("1", "2");
        kataTest(")CH5193", ")CH5194");
        kataTest("HY)&?cd5BDEdfSfgde34FDS010903271999999999", "HY)&?cd5BDEdfSfgde34FDS010903272000000000");
        kataTest("foobar099", "foobar100");
    }
}