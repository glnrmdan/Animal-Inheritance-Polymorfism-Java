package tugas5;

import javax.swing.*;

public class Hippo extends Animal {
    //setiap void method adalah Override
    @Override
    void makeNoise() {
        System.out.println("Kuda Nil Mendengus Santuy");
    }

    void makan() {
        Hippo hippo = new Hippo();
        hippo.setHunger((int) (Math.random() * 100));
        int hunger = hippo.getHunger();
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

    @Override
    void eat() {
        String[] makanan = {"Rumput", "Tanaman Hutan", "Sayuran"};
        Hippo[] hippo = new Hippo[1];
        for (int i=0; i< hippo.length; i++ ) {
            hippo[i] = new Hippo(); // Membuat Wadah Baru
            hippo[i].setHunger((int) (Math.random() * 85) + 10);
            int x = hippo[i].getHunger();
            hippo[i].makan();
            int y = ((int) (Math.random() * 2));
            System.out.println("("+x+")");
            JOptionPane.showMessageDialog(null, "Hunting Barengan Ngab");
            int z = JOptionPane.showConfirmDialog(null, "Kami Menemukan " + makanan[y] + " Di Wilayah " + HippoBounderies() +
                    "\n" + "Makan Skuy ??? ");
            //confirm = 0
            //No = 1
            //cancel = 2
            JOptionPane.showMessageDialog(null, "Kuda Nil Berdengus Santuy Mendekati Makanan");
            makeNoise();
            if (z == 0) {
                JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                System.out.println("MANTAB MUKBANG " + makanan[y]);
                JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                System.out.println("Alhamdulillah Kenyang ~~~");
            } else if (z == 1) {
                JOptionPane.showMessageDialog(null, "GAGAL MAKAN " + makanan[y] + ", KABOORR ADA PREDATOR");
                System.out.println("GAGAL MAKAN " + makanan[y] + " KABOORR ADA PREDATOR");
            } else if (z == 2) {
                JOptionPane.showMessageDialog(null, "NAFSU MAKAN ILANG PEN DIET");
                System.out.println("NAFSU MAKAN ILANG PEN DIET");
            } else  {
                JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                System.out.println("Dahlah");
            }
        }
    }

    public String HippoLocation() {
        String local;
        String kordinat;
        int rand;
        String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
        rand = (int) (Math.random()*4);
        Hippo hippo = new Hippo();
        hippo.setLocation((int) (Math.random() * 300));
        kordinat = Integer.toString(hippo.getLocation());
        local = arah[rand] + kordinat;
        System.out.println("Lokasi Kami Saat Ini Ada Di Koordinat " + local);
        return local;
    }

    void HippoPicture() {
        Hippo hippo = new Hippo();
        hippo.setPicture("Kami Adalah");
        String ln = hippo.getPicture();
        System.out.println(ln + " Kawanan Hippo Yang Obesitas");
        JOptionPane.showMessageDialog(null, ln + " Kuda Nil" + "\n" +
                "Lokasi Kami Saat Ini Ada Di Koordinat " + HippoLocation());
    }

    public int HippoBounderies() {
        Hippo hippo = new Hippo();
        hippo.setBoundaries((int) (Math.random() * 300));
        int boun = hippo.getBoundaries() ;
        System.out.println("Kami Menemukan Makanan Di Wilayah " + boun);
        return boun;
    }

    void hippo() {
        Hippo hippo = new Hippo();
        hippo.HippoPicture();
        hippo.HippoLocation();
        hippo.eat();
    }
}
