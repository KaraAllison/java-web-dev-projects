package org.launchcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello World", hello.display());
    }
}
