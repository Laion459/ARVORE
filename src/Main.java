import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Tree tree = new Tree();

        System.out.println("\n Ordem de alocação/ inserção: ");

        for (int i = 0; i < 30; i++){
            tree.insert(random.nextInt(1000), tree.root);
        }

        System.out.println();
        System.out.println("\n PRE-ORDER");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("Size: " + tree.size);

        System.out.println("\n IN-ORDER");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Size: " + tree.size);


        System.out.println("\n POS-ORDER");
        tree.posOrder(tree.root);
        System.out.println();
        System.out.println("Size: " + tree.size);

    }
}
