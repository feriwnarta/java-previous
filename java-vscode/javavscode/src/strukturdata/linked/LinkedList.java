package strukturdata.linked;

public class LinkedList {
    private Node first, last;

    public void insertAwal(int value){
        if(first == null) {
            Node nodeAwal = new Node();
            nodeAwal.data = value;
            nodeAwal.next = null;
            first = nodeAwal;
            last = nodeAwal;
        } else System.out.println("awal sudah dibuat, tidak bisa buat lagi");
    }

    public void insertKiri(int value){
        if(first != null){
            Node nodeKiri = new Node();
            nodeKiri.data = value;
            nodeKiri.next = first;    
            first = nodeKiri;      
        } else System.out.println("insert awal belum ada");
    }

    public void insertKanan(int value){
        if(last != null){
            Node nodeKanan = new Node();
            nodeKanan.data = value;
            nodeKanan.next = null;
            last.next = nodeKanan;
            last = nodeKanan;
        } else System.out.println("insert awal belum ada");
    }

    public void showData(){
        System.out.println(first);
    }
   
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.insertAwal(2);
        link.insertKiri(3);
        link.insertKanan(1);
        System.out.println(link.first);

    }

}
