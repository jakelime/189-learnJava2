public class Main {
    public static void main(String[] args) {

        Magazine mag1 = new Magazine("Magazine1", "Pub1", 1, 2020);
        Magazine mag2 = new Magazine("Magazine2", "Pub2", 2, 2022);

        MagazineLibrary lib = new MagazineLibrary();

        lib.addMagazine(mag1);
        lib.addMagazine(mag2);

        Magazine retreivedMag = lib.getMagazine(0);
        System.out.println(retreivedMag.getTitle());

        Magazine newMag = new Magazine("Magz3", "pub3", 3, 2021);
        lib.setMagazine(0, newMag);

        retreivedMag = lib.getMagazine(0);
        System.out.println(retreivedMag.getTitle());

    }
}