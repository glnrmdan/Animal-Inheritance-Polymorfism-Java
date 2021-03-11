package tugas5;

public class Animal {
    private String picture; // String
    private String[] food;   // String
    private int hunger;     // Instance Variable
    private int boundaries; // String batas wilayah
    private int location;  // String lokasi target

    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String[] getFood() {
        return food;
    }
    public void setFood(String[] food) {
        this.food = food;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(int boundaries) {
        this.boundaries = boundaries;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    void makeNoise() {
        System.out.println("HMMM");
    }

    void eat() {
        System.out.println("Makan");
    }

    void sleep() {
        System.out.println("Rasanya Jadi Pengen Rebahan");
    }

    void roam() {
        //bounaries
        //location
        System.out.println("Yang Penting Jalan~ \n");
    }
}
