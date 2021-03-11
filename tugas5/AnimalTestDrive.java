package tugas5;


import javax.swing.*;

public class AnimalTestDrive {
    public static void main(String[] args) {
        System.out.println("___-----------------------------___");
        System.out.println("|-Skala Tingkat Kelaparan 0 - 100-|\n");
        //confirm = 0
        //No = 1
        //Cancel = 2

        JOptionPane.showMessageDialog(null, "Selamat Datang Di Program Animal Gabut");
        JOptionPane.showMessageDialog(null, """
                Disini Ada Beberapa Golongan Yaitu :
                [1] Felline Yang Solo Player
                [2] Canine Yang Berkelompok
                [3] Hippo Yang Pemalas""");
        String golongan = JOptionPane.showInputDialog(null, """
                Disini Ada Beberapa Golongan Yaitu :
                [1] Felline Yang Solo Player
                [2] Canine Yang Berkelompok
                [3] Hippo Yang Pemalas
                Pilih Berdasarkan Nomor Ingin Melihat Kegabutan Animal Golongan Apa (?)""");

        if (golongan.equals("1")) { // -->> FELLINE <<-- //
            String spesiesFel = JOptionPane.showInputDialog(null, """
                    Didalam Golongan Felline Ada 3 Spesies, Yaitu :
                    [1] Lion
                    [2] Tiger
                    [3] Cat
                    Ingin Mencoba Simulasi Yang Mana Kak ?
                    (Input Berdasar Nomor Spesies)""");
            if (spesiesFel.equals("1")) {
                Lion lion = new Lion();
                lion.lion();
                lion.sleep();
            } if (spesiesFel.equals("2")) {
                Tiger tiger = new Tiger();
                tiger.tiger();
                tiger.sleep();
            } if (spesiesFel.equals("3")) {
                Cat cat = new Cat();
                cat.cat();
                cat.sleep();
            }
        } if (golongan.equals("2")) { // -->> CANINE <<-- //
            String spesiesCan = JOptionPane.showInputDialog(null, """
                    Didalam Golongan Canine Ada 2 Spesies, Yaitu :
                    [1] Wolf
                    [2] Dog
                    Ingin Mencoba Simulasi Yang Mana Kak ?
                    (Input Berdasar Nomor Spesies)""");
            if (spesiesCan.equals("1")) {
                Wolf wolf = new Wolf();
                wolf.wolf();
                wolf.sleep();
            } if (spesiesCan.equals("2")) {
                Dog dog = new Dog();
                dog.dog();
                dog.sleep();
        }
        } if (golongan.equals("3")) { // -->> HIPPO <<-- //
            Hippo hippo = new Hippo();
            hippo.hippo();
            hippo.sleep();
        }else {
            JOptionPane.showMessageDialog(null, "Program Berhenti");
            System.out.println("Program Selesai");
            }
    }
}
