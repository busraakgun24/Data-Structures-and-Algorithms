package faktoriyel;
/**
 * Bu proje İkili Arama Ağacı (Binary Search Tree) yapısına bir örnektir.
 * Ağaç yapısı, verileri sadece sıralı tutmakla kalmaz, aranılan bir şeyi saniyeler içinde bulmayı sağlar. 
 */
public class agac {
	Node root;
	// Özyinelemeli Faktöriyel Metodu
    public int hesaplaFaktoriyel(int n) {
        if (n <= 1) return 1;
        return n * hesaplaFaktoriyel(n - 1);
    }
    // Ağaca Ekleme (Faktöriyel Bilgisiyle Beraber)
    public void ekle(int sayi) {
        root = ekleRecursive(root, sayi);
    }
    private Node ekleRecursive(Node root, int sayi) {
        if (root == null) {
            Node yeni = new Node(sayi);
            yeni.faktoriyelSonuc = hesaplaFaktoriyel(sayi); // Hesaplayıp içine yazıyoruz
            return yeni;
        }
        if (sayi < root.data) root.left = ekleRecursive(root.left, sayi);
        else if (sayi > root.data) root.right = ekleRecursive(root.right, sayi);
        return root;
    }
    // Ağacı ve Faktöriyelleri Yazdır
    public void listele(Node root) {
        if (root != null) {
            listele(root.left);
            System.out.println("Sayı: " + root.data + " -> Faktöriyeli: " + root.faktoriyelSonuc);
            listele(root.right);
        }
    }
}