package pertemuan_3.tes_1;

import pertemuan_3.latihan_2dan3.StrukturList;

public  class tes_1a {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);

        System.out.println("Elemen :");
        list.displayElement();
    }
}