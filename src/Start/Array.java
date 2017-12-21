package Start;

public class Array {
    public static void main(String[] args) {
        int monts_days[];
        monts_days = new int[12];
        monts_days[0] = 31;
        monts_days[1] = 28;
        monts_days[2] = 31;
        monts_days[3] = 30;
        monts_days[4] = 31;
        monts_days[5] = 30;
        monts_days[6] = 31;
        monts_days[7] = 31;
        monts_days[8] = 30;
        monts_days[9] = 31;
        monts_days[10] = 30;
        monts_days[11] = 31;
        System.out.println("В апреле " + monts_days[3] + " дней");
    }
}
