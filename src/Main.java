public class Main {
    public static void main(String[] args) {
        int[] mass = new int[4];
        mass[0] = 15;
        mass[1] = 30;
        mass[2] = 45;
        mass[3] = 60;
        for (int j = 0; j < mass.length; j++) {
            mass[j] = mass[j]*mass[3];

            System.out.println(mass[j]);
        }
    }
}