package TUGAS;

import java.util.ArrayList;

public class Animals {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.print("Hewan : (");
        for (int i = 0; i < Hewan.size(); i++) {
            System.out.print(Hewan.get(i));
            if (i < Hewan.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
        System.out.println("---");

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
        System.out.println("Hewan yang dihapus : ");
        System.out.print("(");
        for (int i = 0; i < HewanDeleted.size(); i++) {
            System.out.print(HewanDeleted.get(i));
            if (i < HewanDeleted.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");

        System.out.println();
        System.out.println("Output hewan : ");
        System.out.print("(");
        for (int i = 0; i < Hewan.size(); i++) {
            System.out.print(Hewan.get(i));
            if (i < Hewan.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}
