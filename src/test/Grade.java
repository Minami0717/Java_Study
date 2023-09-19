package test;

public class Grade {
    public static void main(String[] args) {
        new Grade("강백호", 90.0, 85.5, 70.0);
        new Grade("채치수", 82.0, 92.0, 60.5);
    }

    private String nm;
    private double ko;
    private double en;
    private double ma;

    Grade(String nm, double ko, double en, double ma) {
        this.nm = nm;
        this.ko = ko;
        this.en = en;
        this.ma = ma;
        System.out.printf("%s의 평균 점수 : %.2f\n", nm, getAvg());
    }

    double getAvg() {
        return (ko + en + ma) / 3;
    }
}
