package Tugas;

public class tugas {
    private int angka1;
    private int angka2;
    private int hasil;

    public int getAngka1() {
        return angka1;
    }

    public void setAngka1(int angka1) {
        this.angka1 = angka1;
    }

    public int getAngka2() {
        return angka2;
    }

    public void setAngka2(int angka2) {
        this.angka2 = angka2;
    }

    public void addAllNumber() {
        hasil = angka1 + angka2;
        System.out.println(hasil);
    }

    public void multiplyNumber(int angka1, int angka2) {
        hasil = angka1 * angka2;
        System.out.println(hasil);
    }

    public int getHasil() {
        return hasil;
    }

}
