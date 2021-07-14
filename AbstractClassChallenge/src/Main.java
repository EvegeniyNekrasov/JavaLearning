public class Main {
    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.tranverse(tree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.tranverse(tree.getRoot());

//        tree.tranverse(tree.getRoot());
//        tree.removeItem(new Node("3"));
//        tree.tranverse(tree.getRoot());
//
//        tree.removeItem(new Node("5"));
//        tree.tranverse(tree.getRoot());
//
//        tree.removeItem(new Node("0"));
//        tree.removeItem(new Node("4"));
//        tree.removeItem(new Node("2"));
//        tree.tranverse(tree.getRoot());
//
//        tree.removeItem(new Node("9"));
//        tree.tranverse(tree.getRoot());
//        tree.removeItem(new Node("8"));
//        tree.tranverse(tree.getRoot());
//        tree.removeItem(new Node("6"));
//        tree.tranverse(tree.getRoot());
//        tree.removeItem(tree.getRoot());
//        tree.tranverse(tree.getRoot());
//        tree.removeItem(tree.getRoot());
//        tree.tranverse(tree.getRoot());



    }
}
