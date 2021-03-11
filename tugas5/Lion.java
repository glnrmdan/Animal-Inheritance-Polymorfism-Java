package tugas5;
import javax.swing.*;

////// ---->>>>  LION  <<<<---- ///////
////// ---->>>>  LION  <<<<---- ///////
    class Lion extends Felline {
    //setiap void method adalah Override
    @Override
    void makeNoise() {
        System.out.println("Singa Mengaum Untuk Menyerang Mental !!!");
        }

    @Override
    void eat() {
        String[] makanan = {"Zebra", "Sapi", "Kerbau"};
        Lion[] lion = new Lion[1];
        for (int i=0; i< lion.length; i++ ) {
            lion[i] = new Lion(); // Membuat Wadah Baru
            lion[i].setHunger((int) (Math.random() * 85) + 10);
                int x = lion[i].getHunger();
                lion[i].makan();
                int y = ((int) (Math.random() * 2));
                System.out.println("("+x+")");
            JOptionPane.showMessageDialog(null, "Solo Hunting Duls Gan");
            int z = JOptionPane.showConfirmDialog(null, "Aku Menemukan " + makanan[y] + " Di Wilayah " + LionBounderies() +
                    "\n" + "GAS TERKAM ??? ");
            //confirm = 0
            //No = 1
            //cancel = 2
            JOptionPane.showMessageDialog(null, "Singa Mengaum Untuk Menyerang Mental !!!");
            makeNoise();
            if (z == 0) {
                JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                System.out.println("MANTAB MUKBANG " + makanan[y]);
                JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                System.out.println("Alhamdulillah Kenyang ~~~");
            } else if (z == 1) {
                JOptionPane.showMessageDialog(null, "GAGAL TERKAM " + makanan[y] + " KABOORR");
                System.out.println("GAGAL TERKAM " + makanan[y]);
            } else if (z == 2) {
                JOptionPane.showMessageDialog(null, "NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
                System.out.println("NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
            } else  {
                JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                System.out.println("Dahlah");
            }
        }
    }
    
    public String LionLocation() {
        String local;
        String kordinat;
        int rand;
        String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
        rand = (int) (Math.random()*4);
        Lion lion = new Lion();
        lion.setLocation((int) (Math.random() * 300));
        kordinat = Integer.toString(lion.getLocation());
        local = arah[rand] + kordinat;
        System.out.println("Lokasiku Saat Ini Ada Di Koordinat " + local);
        return local;
    }
    
    void lionPicture() {
        Lion lion = new Lion();
        lion.setPicture("Aku Adalah");
        String ln = lion.getPicture();
        System.out.println(ln + " Seekor Singa Gagah Perkasa");
        JOptionPane.showMessageDialog(null, ln + " Singa" + "\n" +
                    "Lokasiku Saat Ini Ada Di Koordinat " + LionLocation());
    }

    public int LionBounderies() {
        Lion lion = new Lion();
        lion.setBoundaries((int) (Math.random() * 300));
        int boun = lion.getBoundaries() ;
        System.out.println("Aku Menemukan Mangsa Di Wilayah " + boun);
        return boun;
    }

    void lion() {
        Lion lion = new Lion();
        lion.lionPicture();
        lion.LionLocation();
        lion.eat();
    }
}

////// ---->>>>  TIGER  <<<<---- ///////
////// ---->>>>  TIGER  <<<<---- ///////
    class Tiger extends Felline {
    //setiap void method adalah Override
    @Override
    void makeNoise() {
        System.out.println("Harimau Mengaum Untuk Menyerang Mental !!!");
    }

    @Override
    void eat() {
        String[] makanan = {"Zebra", "Sapi", "Kerbau"};
        Tiger[] tiger = new Tiger[1];
        for (int i=0; i< tiger.length; i++ ) {
            tiger[i] = new Tiger(); // Membuat Wadah Baru
            tiger[i].setHunger((int) (Math.random() * 85) + 10);
            int x = tiger[i].getHunger();
            tiger[i].makan();
            int y = ((int) (Math.random() * 2));
            System.out.println("("+x+")");
            JOptionPane.showMessageDialog(null, "Solo Hunting Duls Gan");
            int z = JOptionPane.showConfirmDialog(null, "Aku Menemukan " + makanan[y] + " Di Wilayah " + TigerBounderies() +
                    "\n" + "GAS TERKAM ??? ");
            //confirm = 0
            //No = 1
            //cancel = 2
            JOptionPane.showMessageDialog(null, "Singa Mengaum Untuk Menyerang Mental !!!");
            makeNoise();
            if (z == 0) {
                JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                System.out.println("MANTAB MUKBANG " + makanan[y]);
                JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                System.out.println("Alhamdulillah Kenyang ~~~");
            } else if (z == 1) {
                JOptionPane.showMessageDialog(null, "GAGAL TERKAM " + makanan[y] + " KABOORR");
                System.out.println("GAGAL TERKAM " + makanan[y]);
            } else if (z == 2) {
                JOptionPane.showMessageDialog(null, "NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
                System.out.println("NAFSU MAKAN ILANG " + makanan[y] + " PERGI NINGGALIN KAMU");
            } else  {
                JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                System.out.println("Dahlah");
            }
        }
    }


    public String TigerLocation() {
        String local;
        String kordinat;
        int rand;
        String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
        rand = (int) (Math.random()*4);
        Tiger tiger = new Tiger();
        tiger.setLocation((int) (Math.random() * 200));
        kordinat = Integer.toString(tiger.getLocation());
        local = arah[rand] + kordinat;
        System.out.println("Lokasiku Saat Ini Ada Di Koordinat " + local);
        return local;
    }

    void TigerPicture() {
        Tiger tiger = new Tiger();
        tiger.setPicture("Aku Adalah");
        String ln = tiger.getPicture();
        System.out.println(ln + " Seekor Harimau Yang Lincah");
        JOptionPane.showMessageDialog(null, ln + " Harimau" + "\n" +
                "Lokasiku Saat Ini Ada Di Koordinat " + TigerLocation());
    }

    public int TigerBounderies() {
        Tiger tiger = new Tiger();
        tiger.setBoundaries((int) (Math.random() * 200));
        int boun = tiger.getBoundaries() ;
        System.out.println("Aku Menemukan Mangsa Di Wilayah " + boun);
        return boun;
    }

    void tiger() {
        Tiger tiger = new Tiger();
        tiger.TigerPicture();
        tiger.TigerLocation();
        tiger.eat();
    }
    }

////// ---->>>>  CAT  <<<<---- ///////
////// ---->>>>  CAT  <<<<---- ///////
    class Cat extends Felline {
        //setiap void method adalah Override
        @Override
        void makeNoise() {
            System.out.println("Kucing Mengeong Untuk Meminta Makan");
        }

        @Override
        void eat() {
            String[] makanan = {"Lele", "Wiskhas", "Ayam"};
            Cat[] cat = new Cat[1];
            for (int i=0; i< cat.length; i++ ) {
                cat[i] = new Cat(); // Membuat Wadah Baru
                cat[i].setHunger((int) (Math.random() * 85) + 10);
                int x = cat[i].getHunger();
                cat[i].makan();
                int y = ((int) (Math.random() * 2));
                System.out.println("("+x+")");
                JOptionPane.showMessageDialog(null, "Ngeong Ngeong Duls Gan");
                int z = JOptionPane.showConfirmDialog(null, "Aku Menemukan " + makanan[y] + " Di Wilayah " + CatBounderies() +
                        "\n" + "GAS TERKAM ??? ");
                //confirm = 0
                //No = 1
                //cancel = 2
                JOptionPane.showMessageDialog(null, "Kucing Mengeong Meminta Belas Kasih Pemiliknya !!!");
                makeNoise();
                if (z == 0) {
                    JOptionPane.showMessageDialog(null, "MANTAP MUKBANG " + makanan[y]);
                    System.out.println("MANTAB MUKBANG " + makanan[y]);
                    JOptionPane.showMessageDialog(null, "Alhamdulillah Tingkat Kelaparanku Kini Sudah Kosong");
                    System.out.println("Alhamdulillah Kenyang ~~~");
                } else if (z == 1) {
                    JOptionPane.showMessageDialog(null, "Gagal Dapet " + makanan[y] + " Pemilik Lagi Bokek");
                    System.out.println("Gagal Dapet " + makanan[y] + " Pemilih Lagi Bokek");
                } else if (z == 2) {
                    JOptionPane.showMessageDialog(null, "Nafsu Makan Ilang " + makanan[y] + " Pemilik Pergi Ninggalin Kamu");
                    System.out.println("NAFSU MAKAN ILANG " + makanan[y] + " Pemilik Pergi Ninggalin Kamu");
                } else  {
                    JOptionPane.showMessageDialog(null, "Program Eror Ngab");
                    System.out.println("Dahlah");
                }
            }
        }


        public String CatLocation() {
            String local;
            String kordinat;
            int rand;
            String[] arah ={"Timur ", "Barat ", "Selatan ", "Utara "};
            rand = (int) (Math.random()*4);
            Cat cat = new Cat();
            cat.setLocation((int) (Math.random() * 100));
            kordinat = Integer.toString(cat.getLocation());
            local = arah[rand] + kordinat;
            System.out.println("Lokasiku Saat Ini Ada Di Koordinat " + local);
            return local;
        }

        void CatPicture() {
            Cat cat = new Cat();
            cat.setPicture("Aku Adalah");
            String ln = cat.getPicture();
            System.out.println(ln + " Seekor Kucing Yang Sangat Imut");
            JOptionPane.showMessageDialog(null, ln + " Kucing" + "\n" +
                    "Lokasiku Saat Ini Ada Di Koordinat " + CatLocation());
        }

        public int CatBounderies() {
            Cat cat = new Cat();
            cat.setBoundaries((int) (Math.random() * 100));
            int boun = cat.getBoundaries() ;
            System.out.println("Aku Menemukan Pemilikku Didalam Rumah Wilayah " + boun);
            return boun;
        }

        void cat() {
            Cat cat = new Cat();
            cat.CatPicture();
            cat.CatLocation();
            cat.eat();
        }
    }



