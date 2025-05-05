package pertemuan7.latihan3;

import pertemuan7.Tugas.Node;

public class StrukturList {
    Node HEAD;

    public boolean find (int x) {
        Node curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getData()==x)
                ketemu = true;
            else curNode = curNode.getNext();
        }
        return ketemu;
    }

    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }
        return jumlah;
    }
}