//package org.katas;
//import org.junit.jupiter.api.*;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.katas.PeanoNumbers.*;
//import static org.katas.PeanoNumbers.Ordering.*;
//
///**
// * Created by ice1000 on 17-6-22.
// *
// * @author ice1000
// */
//public class PeanoTest {
//
//    private static PeanoNumbers.Peano peano(int n) {
//        if (0 == n) return PeanoNumbers.Peano.Zero.INSTANCE;
//        return new PeanoNumbers.Peano.Succ(peano(n - 1));
//    }
//
//    private static void assertPeanoEq(PeanoNumbers.Peano a, PeanoNumbers.Peano b) {
//        assertEquals(EQ, compare(a, b));
//    }
//
//    @Test
//    public void addTest() throws Exception {
//        assertPeanoEq(peano(0), add(peano(0), peano(0)));
//        assertPeanoEq(peano(664), add(peano(0), peano(664)));
//    }
//
//    @Test
//    public void subTest() throws Exception {
//        assertPeanoEq(peano(0), sub(peano(0), peano(0)));
//        assertPeanoEq(peano(10), sub(peano(10), peano(0)));
//    }
//
//    @Test
//    public void mulTest() throws Exception {
//        assertPeanoEq(peano(0), mul(peano(0), peano(0)));
//        assertPeanoEq(peano(0), mul(peano(5), peano(0)));
//    }
//
//    @Test
//    public void divTest() throws Exception {
//        assertPeanoEq(peano(4), div(peano(8), peano(2)));
//        assertPeanoEq(peano(3), div(peano(10), peano(3)));
//    }
//
//    @Test
//    public void evenTest() throws Exception {
//        assertTrue(even(peano(0)));
//        assertTrue(even(peano(2)));
//    }
//
////    @Test
////    public void oddTest() throws Exception {
////        assertFalse(odd(peano(0)));
////        assertFalse(odd(peano(8)));
////    }
////
////    @Test
////    public void compareTest() throws Exception {
////        assertEquals(LT, compare(peano(0), peano(4)));
////        assertEquals(GT, compare(peano(210), peano(43)));
////        assertEquals(EQ, compare(peano(0), peano(0)));
////    }
////
////    @Test
////    public void shouldntCheat() throws Exception {
////        // hidden
////    }
//
//}