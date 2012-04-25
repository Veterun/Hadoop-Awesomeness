package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import structures.DisjointSet;

public class DisjointSetTest {
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        DisjointSet set = new DisjointSet(1);
        set.isConnected(1,1);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException2() {
        DisjointSet set = new DisjointSet(0);
    }
    
    @Test
    public void testConnected1() {
        DisjointSet set = new DisjointSet(1);
        assertTrue(set.isConnected(0,0));
    }
    
    @Test
    public void testConnected2() {
        DisjointSet set = new DisjointSet(4);
        set.union(0, 1);
        set.union(0, 2);
        assertTrue(set.isConnected(0, 1));
        assertTrue(set.isConnected(0, 2));
        assertFalse(set.isConnected(0, 3));
        assertFalse(set.isConnected(2, 3));
    }
    
    @Test
    public void testConnected3() {
        DisjointSet set = new DisjointSet(9);
        set.union(0, 1);
        set.union(1, 2);
        set.union(2, 5);
        assertTrue(set.isConnected(1, 5));
        assertFalse(set.isConnected(7, 8));
    }
}
