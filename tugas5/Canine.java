package tugas5;

public class Canine extends Animal{

    void roam() {
        System.out.println("Kuy Hunting Barengan Ngab\n");
    }

    void makan() {
        Canine canine = new Canine();
        canine.setHunger((int) (Math.random() * 100));
        int hunger = canine.getHunger();
        if (hunger >= 65 && hunger <= 100) {
            System.out.print("Tingkat Kelaparanku Sekarang Tinggi ");
        } else if (hunger >= 30 && hunger < 65) {
            System.out.print("Tingkat Kelaparanku Sekarang Sedang ");
        } else if (hunger >= 0 && hunger < 30) {
            System.out.print("Tingkat Kelaparanku Sekarang Rendah ");
        } else {
            System.out.print("Aku Tidak Akan Makan");
        }
    }
}
