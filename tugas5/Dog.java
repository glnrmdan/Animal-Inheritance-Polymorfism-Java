package tugas5;

import javax.swing.*;

// --->>> WOLF <<<---//
// --->>> WOLF <<<---//
class Wolf extends Canine {
    //setiap void method adalah Override
    @Override
    void makeNoise() {
        System.out.println("Serigala Mengaung Untuk Menyerang Mental !!!");
    }

    @Override
    void eat() {
        String[] makanan = {"Domba", "Sapi", "Rembo"};
        Wolf[] wolf = new Wolf[1];
        for (int i=0; i< wolf.length; i++ ) {
            wolf[i] = new Wolf(); // Membuat Wadah Baru
            wolf[i].setHunger((int) (Math.random() * 85) + 10);
            int x = wolf[i].getHunger();
            wolf[i].makan();
            int y = ((int) (Math.random() * 2));
            System.out.println("("+x+")");
            JOptionPane.showMessageDialog(null, "Hunting Barengan Ngab");
            int z = JOptionPane.showConfirmDialog(null, "Kami Menemukan " + makanan[y] + " Di Wilayah " + WolfBounderies() +
                    "\n" + "GAS KEROYOK ??? ");
            //confirm = 0
            //No = 1
            //cancel = 2
            JOptionPane.showMessageDialog(null, "Serigala Mengaung Untuk Menyerang Mental !!!");
            makeNoise();
            if (z == 0) {
                JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                System.out.println("MANTAB MUKBANG " + makanan[y]);
                JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                System.out.println("Alhamdulillah Kenyang ~~~");
            } else if (z == 1) {
                JOptionPane.showMessageDialog(null, "GAGAL KEROYOK " + makanan[y] + " KABOORR");
                System.out.println("GAGAL KEROYOK " + makanan[y]);
            } else if (z == 2) {
                JOptionPane.showMessageDialog(null, "NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
                System.out.println("NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
            } else  {
                JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                System.out.println("Dahlah");
            }
        }
    }

    public String WolfLocation() {
        String local;
        String kordinat;
        int rand;
        String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
        rand = (int) (Math.random()*4);
        Wolf wolf = new Wolf();
        wolf.setLocation((int) (Math.random() * 75));
        kordinat = Integer.toString(wolf.getLocation());
        local = arah[rand] + kordinat;
        System.out.println("Lokasi Kami Saat Ini Ada Di Koordinat " + local);
        return local;
    }

    void WolfPicture() {
        Wolf wolf = new Wolf();
        wolf.setPicture("Kami Adalah");
        String ln = wolf.getPicture();
        System.out.println(ln + " Kawanan Serigala Yang Tampan");
        JOptionPane.showMessageDialog(null, ln + " Serigala" + "\n" +
                "Lokasi Kami Saat Ini Ada Di Koordinat " + WolfLocation());
    }

    public int WolfBounderies() {
        Wolf wolf = new Wolf();
        wolf.setBoundaries((int) (Math.random() * 75));
        int boun = wolf.getBoundaries() ;
        System.out.println("Kami Menemukan Mangsa Di Wilayah " + boun);
        return boun;
    }

    void wolf() {
        Wolf wolf = new Wolf();
        wolf.WolfPicture();
        wolf.WolfLocation();
        wolf.eat();
    }
}

// --->>> DOG <<<---//
// --->>> DOG <<<---//
class Dog extends Canine {
    //setiap void method adalah Override
    @Override
    void makeNoise() {
        System.out.println("Anjing Menggonggong Untuk Menyerang Mental !!!");
    }

    @Override
    void eat() {
        String[] makanan = {"Domba", "Sapi", "Rembo"};
        Dog[] dog = new Dog[1];
        for (int i=0; i< dog.length; i++ ) {
            dog[i] = new Dog(); // Membuat Wadah Baru
            dog[i].setHunger((int) (Math.random() * 85) + 10);
            int x = dog[i].getHunger();
            dog[i].makan();
            int y = ((int) (Math.random() * 2));
            System.out.println("("+x+")");
            JOptionPane.showMessageDialog(null, "Hunting Barengan Ngab");
            int z = JOptionPane.showConfirmDialog(null, "Kami Menemukan " + makanan[y] + " Di Wilayah " + DogBounderies() +
                    "\n" + "GAS KEROYOK ??? ");
            //confirm = 0
            //No = 1
            //cancel = 2
            JOptionPane.showMessageDialog(null, "Anjing Mengaung Untuk Menyerang Mental !!!");
            makeNoise();
            if (z == 0) {
                JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                System.out.println("MANTAB MUKBANG " + makanan[y]);
                JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                System.out.println("Alhamdulillah Kenyang ~~~");
            } else if (z == 1) {
                JOptionPane.showMessageDialog(null, "GAGAL KEROYOK " + makanan[y] + " KABOORR");
                System.out.println("GAGAL KEROYOK " + makanan[y]);
            } else if (z == 2) {
                JOptionPane.showMessageDialog(null, "NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
                System.out.println("NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
            } else  {
                JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                System.out.println("Dahlah");
            }
        }
    }

    public String DogLocation() {
        String local;
        String kordinat;
        int rand;
        String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
        rand = (int) (Math.random()*4);
        Dog dog = new Dog();
        dog.setLocation((int) (Math.random() * 50));
        kordinat = Integer.toString(dog.getLocation());
        local = arah[rand] + kordinat;
        System.out.println("Lokasi Kami Saat Ini Ada Di Koordinat " + local);
        return local;
    }

    void DogPicture() {
        Dog dog = new Dog();
        dog.setPicture("Kami Adalah");
        String ln = dog.getPicture();
        System.out.println(ln + " Kawanan Anjing Yang Tampan");
        JOptionPane.showMessageDialog(null, ln + " Serigala" + "\n" +
                "Lokasi Kami Saat Ini Ada Di Koordinat " + DogLocation());
    }

    public int DogBounderies() {
        Dog dog = new Dog();
        dog.setBoundaries((int) (Math.random() * 50));
        int boun = dog.getBoundaries() ;
        System.out.println("Kami Menemukan Mangsa Di Wilayah " + boun);
        return boun;
    }

    void dog() {
        Dog dog = new Dog();
        dog.DogPicture();
        dog.DogLocation();
        dog.eat();
    }
}
