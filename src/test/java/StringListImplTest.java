/*
import org.example.Exception.InvalidIndexException;
import org.example.Exception.NullItemException;
import org.example.Exception.StorageIsFullException;
import org.example.IntegerListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerListImplTest {

    @Test
    void add_validItem_success() {
        IntegerListImpl IntegerList = new IntegerListImpl();
        Integer item = "Test";
        assertEquals(item, IntegerList.add(item));
    }

    @Test
    void add_nullItem_throwNullItemException() {
        IntegerListImpl IntegerList = new IntegerListImpl();
        assertThrows(NullItemException.class, () -> IntegerList.add(null));
    }

    @Test
    void add_fullStorage_throwStorageIsFullException() {
        IntegerListImpl IntegerList = new IntegerListImpl(1);
        IntegerList.add("Test");
        assertThrows(StorageIsFullException.class, () -> IntegerList.add("Test2"));
    }


    @Test
    void add_invalidIndex_throwInvalidIndexException() {
        IntegerListImpl IntegerList = new IntegerListImpl();
        assertThrows(InvalidIndexException.class, () -> IntegerList.add(1, "Test"));
    }

    @Test
    public void testAdd() {
        IntegerListImpl list = new IntegerListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertEquals(3, list.size());
    }

    @Test
    public void testContains() {
        IntegerListImpl list = new IntegerListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertTrue(list.contains("banana"));
        assertFalse(list.contains("grape"));
    }

    @Test
    public void testIndexOf() {
        IntegerListImpl list = new IntegerListImpl();

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        assertEquals(1, list.indexOf("banana"));
        assertEquals(-1, list.indexOf("grape"));
    }

}
*/
