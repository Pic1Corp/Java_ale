import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Test1Test {
    @Test
    public void testRicercaSequenziale() {
        int[] array = {1, 2, 3, 4, 5};
        int value = 3;
        int expected = 2;
        int actual = Test1.RicercaSequenziale(array, value);
        assertEquals(expected, actual);
    }

    @Test
    public void testRicercaPosMinimo() {
    int[] array = {1, 2, 3, 4, 5};
    int expected = 1;
    int actual = Test1.RicercaPosMinimo(array);
    assertEquals(expected, actual);
    }

    @Test
    public void testRicercaPosMassimo() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 5;
        int actual = Test1.RicercaPosMassimo(array);
        assertEquals(expected, actual);
    }

    @Test
    public void TestOrdinoArraySeleSort(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(arrayO, Test1.seleSort(arrayNO));
    }

    @Test
    public void TestOrdinoArrayBubleSort(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(arrayO, Test1.bubleSort(arrayNO));
    }
    @Test
    public void TestOrdinoArrayBubleSortPico(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(arrayO, Test1.bubleSortPico(arrayNO));
    }
    @Test
    public void TestBynarySearch(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int value = 5;
        int expected = 4;
        int actual = Test1.binarySearch(array, value, 0, array.length-1);
        assertEquals(expected, actual);
    }
    @Test
    public void TestshiftDx(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] expected = {1,1,2,3,4,5,6,7,8,9};
        int[] actual = Test1.shiftDx(array, 0);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void TestRotazioneSx(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] expected = {2,3,4,5,6,7,8,9,10,1};
        int[] actual = Test1.rotazioneSx(array, 0);
        assertArrayEquals(expected, actual);
    }
}