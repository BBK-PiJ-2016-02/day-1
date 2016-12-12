public class TreeIntSet implements IntSet {
    IntegerTreeNode root;

    public void add(int n) {
        if(root == null) {
            root = new IntegerTreeNode(n);
        } else {
            root.add(n);
        }
    }

    public boolean contains(int n) {
        if(root == null) {
            return false;
        }

        return root.contains(n);
    }

    public boolean containsVerbose(int n) {
        if(root == null) {
            return false;
        }

        return root.containsVerbose(n);
    }

    public String toString() {
        if(root == null) {
            return "";
        }

        return root.toString();
    }
}