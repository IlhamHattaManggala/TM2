package Tugas;

public class Calculate {
    public static void main(String[] args) {
        tugas p = new tugas();
        p.setAngka1(8);
        p.setAngka2(9);
        p.addAllNumber();
        p.multiplyNumber(p.getAngka1(), p.getAngka2());
    }
}
