import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio2Test {

    @Test
    public void teststation1() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(-10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void teststation2() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void teststation3() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void teststation4() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void teststation5() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void teststation6() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void teststation7() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void teststation9() {
        Radio2 radio = new Radio2 (20);

        radio.setCurrentStation(19);

        int expected = 19;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void teststation10() {
        Radio2 radio = new Radio2 (20);

        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void teststation8() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testvolum1() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(0);

        radio.reducingVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum2() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(1);

        radio.reducingVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum3() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(50);

        radio.reducingVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum4() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(-1);

        radio.reducingVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum5() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum6() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum7() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum8() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(101);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testvolum9() {
        Radio2 radio = new Radio2();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testnext1() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testnext2() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testnext3() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testnext4() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testnext5() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testpive1() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(5);

        radio.priv();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testprive2() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(0);

        radio.priv();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testpriv3() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(1);

        radio.priv();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testpriv4() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(2);

        radio.priv();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testpriv5() {
        Radio2 radio = new Radio2();
        radio.setCurrentStation(9);

        radio.priv();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }
}