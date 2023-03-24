package TUGAS;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // membuat objek Hewan dan mengisinya dengan beberapa data
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Kucing");
        Hewan.add("Anjing");
        Hewan.add("Sapi");
        Hewan.add("Burung");
        Hewan.add("Kuda");
        Hewan.add("Kucing");

        // membuat objek DeleteHewan dan mengisinya dengan beberapa data
        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("Kucing");
        DeleteHewan.add("Sapi");
        DeleteHewan.add("Ayam");

        // menampilkan data pada objek Hewan sebelum dilakukan penghapusan
        System.out.print("Data pada objek Hewan sebelum dilakukan penghapusan: (");
        for (int i = 0; i < Hewan.size(); i++) {
            System.out.print(Hewan.get(i));
            if (i < Hewan.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        // menampilkan data pada objek DeleteHewan
        System.out.print("Data pada objek DeleteHewan: (");
        for (int i = 0; i < DeleteHewan.size(); i++) {
            System.out.print(DeleteHewan.get(i));
            if (i < DeleteHewan.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        // melakukan penghapusan data yang sama dengan data warna yang terdapat pada objek DeleteHewan
        ArrayList<String> HewanDeleted = new ArrayList<String>();
        for (int i = 0; i < Hewan.size(); i++) {
            for (int j = 0; j < DeleteHewan.size(); j++) {
                if (Hewan.get(i).equals(DeleteHewan.get(j))) {
                    HewanDeleted.add(Hewan.get(i));
                    Hewan.remove(i);
                    i--;
                    break;
                }
            }
        }

        // menampilkan data pada objek Hewan setelah dilakukan penghapusan
        System.out.print("Data pada objek Hewan setelah dilakukan penghapusan: (");
        for (int i = 0; i < Hewan.size(); i++) {
            System.out.print(Hewan.get(i));
            if (i < Hewan.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        // menampilkan data pada objek Hewan yang dihapus
        System.out.print("Data pada objek Hewan yang dihapus: (");
        for (int i = 0; i < HewanDeleted.size(); i++) {
            System.out.print(HewanDeleted.get(i));
            if (i < HewanDeleted.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}
