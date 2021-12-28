package university;

public class ConvertTime {
    private int sec;
    private int min;
    private int hour;

    public ConvertTime(int hour, int min, int sec) {
        setSec(sec);
        setMin(min);
        setHour(hour);
    }


    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public void setSec(int sec) {
        if (sec <= 0) {
            throw new IllegalArgumentException("Должно быть больше 0");
        } else
            this.sec = sec;
    }

    public void setMin(int min) {
        if (min >= 0) {
            this.min=min;
        } else
            throw new IllegalArgumentException("Должно быть больше 0 или равно 0");
    }

    public void setHour(int hour) {
        if (hour >= 0) {
            this.hour = hour;
        } else
            throw new IllegalArgumentException("Должно быть больше или равно 0");
    }
    public String stringConvertTime() {
        String c;
        if (hour == 0) {
            c = getMin() + ":" + getSec();
        } else {
            c = getHour() + ":" + getMin() + ":" + getSec();}
        return c;
    }
}
