public class Radio {

    private int minStation = 0;
    private int maxStation = 10;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 20;
    private int currentVolume = minVolume;
    public Radio(int minStation, int maxStation, int minVolume, int maxVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

//    public int getMinStation() {
//        return minStation;
//    }
//
//    public int getMaxStation() {
//        return maxStation;
//    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume ++;
        }
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume --;
        }
    }
}
