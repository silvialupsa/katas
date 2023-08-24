package org.katas;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Kata1Test {
    @Test
    public void Sample() {
        assertArrayEquals(new int[]{ 1,2,2,3 }, GravityFlip_1.flip('R', new int[]{ 3,2,1,2 }));
        assertArrayEquals(new int[]{ 5,5,4,3,1 }, GravityFlip_1.flip('L', new int[]{ 1,4,5,3,5 }));
    }
}
