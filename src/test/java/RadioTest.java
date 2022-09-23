import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationAboveLimits() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(10);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    //
    @Test
    public void shouldSetStationBelowLimits() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    //
    @Test
    public void shouldSetStationToZero() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(0);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationToNinth() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(9);
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void NextStationFromMax() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void NextStationFromMiddle() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(5);
        radio.nextStation();
        int expected = 6;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFromMin() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void PrevStationFromMiddle() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentStation(6);
        radio.prevStation();
        int expected = 5;
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void currentVolumeMax() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(101);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeMin() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void currentVolumeMiddle() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(50);
        int expected = 50;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumesFromMax() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumesFromMiddle() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(49);
        radio.increaseVolume();
        int expected = 50;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void downVolumesFromMin() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(0);
        radio.downVolume();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void downVolumesFromMiddle() {
        Radio radio = new Radio(0, 9, 0, 100);
        radio.setCurrentVolume(55);
        radio.downVolume();
        int expected = 54;
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }
}
