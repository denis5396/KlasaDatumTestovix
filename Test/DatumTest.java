import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DatumTest {

    @Test
    void TestKonstruktora() {
        assertThrows(Exception.class, () -> {
            Datum d;
            d = new Datum(-1,1,1);
            d = new Datum(29,2,2000);
            d = new Datum(31,6,2000);
        });
    }
    @Test
    void TestpomjeriZaJedanDanUnaprijed() {
        Datum d;
        boolean ok;
        try{
            d = new Datum(22,6,2000);
            d.pomjeriZaJedanDanUnaprijed();
            ok = d.equals(new Datum(23,6,2000));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestpomjeriZaJedanDanUnaprijed1() {
        Datum d;
        boolean ok;
        try{
            d = new Datum(30,6,2000);
            d.pomjeriZaJedanDanUnaprijed();
            ok =  d.equals(new Datum(1,7,2000));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestpomjeriZaJedanDanUnaprijed2() {
        Datum d;
        boolean ok;
        try{
            d = new Datum(31,12,2000);
            d.pomjeriZaJedanDanUnaprijed();
            ok =  d.equals(new Datum(1,1,2001));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestpomjeriZaJedanDanUnaprijed3() {
        Datum d;
        boolean ok = false;
        try{
            d = new Datum(28,2,2000);
            d.pomjeriZaJedanDanUnaprijed();
            ok = d.equals(new Datum(29,2,2001));

        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestPomjeriZaJedanDanUnazad() {
        Datum d;
        boolean ok = false;
        try{
            d = new Datum(28,2,2000);
            d.pomjeriZaJedanDanUnazad();
            ok = d.equals(new Datum(27,2,2000));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestPomjeriZaJedanDanUnazad1() {
        Datum d;
        boolean ok = false;
        try{
            d = new Datum(1,3,2000);
            d.pomjeriZaJedanDanUnazad();
            d.equals(new Datum(29,2,2000));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }
    @Test
    void TestPomjeriZaJedanDanUnazad2() {
        Datum d;
        boolean ok = false;
        try{
            d = new Datum(1,3,2001);
            d.pomjeriZaJedanDanUnazad();
            ok = d.equals(new Datum(28,2,2001));
        }catch(Exception e){
            ok = false;
        }

        assertEquals(true, ok);
    }

    @Test
    void TestToString() {
        Datum d = null;
        boolean ok = false;
        try{
            d = new Datum(1,3,2001);
            ok = true;
        }catch(Exception e){
            ok = false;
        }
        assertEquals(true, d.toString().equals("1/3/2001") && ok);
    }
    @Test
    void TestEquals() {
        Datum d = null;
        Datum d1 = null;
        boolean ok = false;
        try{
            d = new Datum(1,3,2001);
            d1 = new Datum(1,3,2001);
            ok = true;
        }catch(Exception e){
            ok = false;
        }
        assertEquals(true, d.equals(d1) && ok);
    }
    @Test
    void TestEquals1() {
        Datum d = null;
        Datum d1 = null;
        boolean ok = false;
        try{
            d = new Datum(1,3,2001);
            d1 = new Datum(2,3,2001);
            ok = true;
        }catch(Exception e){
            ok = false;
        }
        assertEquals(true, (!d.equals(d1)) && ok);
    }
    @Test
    void TestCompareTo() {
        Datum d = null;
        Datum d1 = null;
        int ok = 5;
        try{
            d = new Datum(1,3,2001);
            d1 = new Datum(2,3,2001);
            ok = 0;
        }catch(Exception e){
        }
        assertEquals(1, d1.compareTo(d) + ok);
    }
    @Test
    void TestCompareTo1() {
        Datum d = null;
        Datum d1 = null;
        int ok = 5;
        try{
            d = new Datum(1,3,2001);
            d1 = new Datum(2,3,2001);
            ok = 0;
        }catch(Exception e){
        }
        assertEquals(-1, d.compareTo(d1) + ok);
    }
    @Test
    void TestCompareTo2() {
        Datum d = null;
        Datum d1 = null;
        int ok = 5;
        try{
            d = new Datum(1,3,2001);
            d1 = new Datum(2,3,2001);
            ok = 0;
        }catch(Exception e){
        }
        assertEquals(0, d.compareTo(d) + ok);
    }
}