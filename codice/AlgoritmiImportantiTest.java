import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlgoritmiImportantiTest {

    //lunghezza pari corto
    @Test
    public void TestRSPariC(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(2, AlgoritmiImportanti.RicercaSequenziale(array, 3));
        assertEquals(9, AlgoritmiImportanti.RicercaSequenziale(array, 10));
        assertEquals(0, AlgoritmiImportanti.RicercaSequenziale(array, 1));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, 11));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, -1));
    }

    //lunghezza dispari corto
    @Test
    public void TestRSDispariC(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        assertEquals(2, AlgoritmiImportanti.RicercaSequenziale(array, 3));
        assertEquals(10, AlgoritmiImportanti.RicercaSequenziale(array, 11));
        assertEquals(0, AlgoritmiImportanti.RicercaSequenziale(array, 1));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, 12));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, -1));
    }

    //lunghezza pari lungo
    @Test
    public void TestRSPariL(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        assertEquals(2, AlgoritmiImportanti.RicercaSequenziale(array, 3));
        assertEquals(49, AlgoritmiImportanti.RicercaSequenziale(array, 50));
        assertEquals(0, AlgoritmiImportanti.RicercaSequenziale(array, 1));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, 51));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, -1));
    }

    //lunghezza dispari lungo
    @Test
    public void TestRSDispariL(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        assertEquals(2, AlgoritmiImportanti.RicercaSequenziale(array, 3));
        assertEquals(50, AlgoritmiImportanti.RicercaSequenziale(array, 51));
        assertEquals(0, AlgoritmiImportanti.RicercaSequenziale(array, 1));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, 52));
        assertEquals(-1, AlgoritmiImportanti.RicercaSequenziale(array, -1));
    }



    //lunghezza pari corto
    @Test
    public void TestTMinPariC(){
        int[] array = {10,5,3,2,6,1,4,9,8,7};
        assertEquals(5, AlgoritmiImportanti.RicercaPosMinimo(array));
    }

    //lunghezza dispari corto
    @Test
    public void TestTMinDispariC(){
        int[] array = {10,5,3,2,6,1,4,9,8,7,11};
        assertEquals(5, AlgoritmiImportanti.RicercaPosMinimo(array));
    }

    //lunghezza pari lungo
    @Test
    public void TestTMinPariL(){
        int[] array = {39, 4, 21, 14, 42, 23, 7, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        assertEquals(43, AlgoritmiImportanti.RicercaPosMinimo(array));
    }

    //lunghezza dispari lungo
    @Test
    public void TestTMinDispariL(){
        int[] array = {39, 4, 21, 14, 42, 23, 7, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        assertEquals(43, AlgoritmiImportanti.RicercaPosMinimo(array));
    }



    //lunghezza pari corto
    @Test
    public void TestTMaxPariC(){
        int[] array = {10,5,3,2,6,1,4,9,8,7};
        assertEquals(0, AlgoritmiImportanti.RicercaPosMassimo(array));
    }

    //lunghezza dispari corto
    @Test
    public void TestTMaxDispariC(){
        int[] array = {10,5,3,2,6,1,4,9,8,7,11};
        assertEquals(10, AlgoritmiImportanti.RicercaPosMassimo(array));
    }

    //lunghezza pari lungo
    @Test
    public void TestTMaxPariL(){
        int[] array = {39, 4, 21, 14, 42, 23, 7, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        assertEquals(7, AlgoritmiImportanti.RicercaPosMassimo(array));
    }

    //lunghezza dispari lungo
    @Test
    public void TestTMaxDispariL(){
        int[] array = {39, 4, 21, 14, 42, 23, 7, 51, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        assertEquals(7, AlgoritmiImportanti.RicercaPosMassimo(array));
    }



    //lunghezza pari corto
    @Test
    public void TestOrdinoArrayPariC(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(arrayO, AlgoritmiImportanti.ordinaArray(arrayNO));
    }

    //lunghezza dispari corto
    @Test
    public void TestOrdinoArrayDispariC(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7,11};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayO, AlgoritmiImportanti.ordinaArray(arrayNO));
    }

    //lunghezza pari lungo
    @Test
    public void TestOrdinoArrayPariL(){
        int[] arrayNO = {39, 4, 21, 14, 42, 23, 7, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        assertArrayEquals(arrayO, AlgoritmiImportanti.ordinaArray(arrayNO));
    }

    //lunghezza dispari lungo
    @Test
    public void TestOrdinoArrayDispariL(){
        int[] arrayNO = {39, 4, 21, 14, 42, 23, 7, 51, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        assertArrayEquals(arrayO, AlgoritmiImportanti.ordinaArray(arrayNO));
    }



    //lunghezza pari corto
    @Test
    public void TestOrdinoArrayBSPariC(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(arrayO, AlgoritmiImportanti.bubbleSort(arrayNO));
    }

    //lunghezza dispari corto
    @Test
    public void TestOrdinoArrayBSDispariC(){
        int[] arrayNO = {10,5,3,2,6,1,4,9,8,7,11};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11};
        assertArrayEquals(arrayO, AlgoritmiImportanti.bubbleSort(arrayNO));
    }

    //lunghezza pari lungo
    @Test
    public void TestOrdinoArrayBSPariL(){
        int[] arrayNO = {39, 4, 21, 14, 42, 23, 7, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        assertArrayEquals(arrayO, AlgoritmiImportanti.bubbleSort(arrayNO));
    }

    //lunghezza dispari lungo
    @Test
    public void TestOrdinoArrayBSDispariL(){
        int[] arrayNO = {39, 4, 21, 14, 42, 23, 7, 51, 50, 26, 33, 47, 22, 11, 19, 8, 31, 18, 15, 5, 20, 10, 49, 25, 29, 28, 36, 17, 12, 6, 38, 37, 30, 46, 45, 32, 3, 35, 9, 44, 27, 43, 16, 24, 1, 40, 48, 2, 34, 41, 13};
        int[] arrayO = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        assertArrayEquals(arrayO, AlgoritmiImportanti.bubbleSort(arrayNO));
    }



    //lunghezza pari corto
    @Test
    public void TestBSPariC(){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        assertEquals(2, AlgoritmiImportanti.binarySearch(array, 3, 0, 9));
        assertEquals(9, AlgoritmiImportanti.binarySearch(array, 10, 0, 9));
        assertEquals(0, AlgoritmiImportanti.binarySearch(array, 1, 0, 9));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, 11, 0, 9));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, -1, 0, 9));
    }

    //lunghezza dispari corto
    @Test
    public void TestBSDispariC(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11};
        assertEquals(2, AlgoritmiImportanti.binarySearch(array, 3, 0, 10));
        assertEquals(10, AlgoritmiImportanti.binarySearch(array, 11, 0, 10));
        assertEquals(0, AlgoritmiImportanti.binarySearch(array, 1, 0, 10));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, 12, 0, 10));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, -1, 0, 11));
    }

    //lunghezza pari lungo
    @Test
    public void TestBSPariL(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        assertEquals(2, AlgoritmiImportanti.binarySearch(array, 3, 0, 49));
        assertEquals(49, AlgoritmiImportanti.binarySearch(array, 50, 0, 49));
        assertEquals(0, AlgoritmiImportanti.binarySearch(array, 1, 0, 49));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, 51, 0, 49));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, -1, 0, 49));
    }

    //lunghezza dispari lungo
    @Test
    public void TestRBSispariL(){
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
        assertEquals(2, AlgoritmiImportanti.binarySearch(array, 3, 0, 50));
        assertEquals(50, AlgoritmiImportanti.binarySearch(array, 51, 0, 50));
        assertEquals(0, AlgoritmiImportanti.binarySearch(array, 1, 0, 50));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, 52, 0, 50));
        assertEquals(-1, AlgoritmiImportanti.binarySearch(array, -1, 0, 50));
    }
}
