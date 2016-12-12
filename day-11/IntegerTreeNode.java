class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode(int value) {
        this.value = value;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public int getMax() {
        if(right == null) {
            return value;
        }
        return right.getMax();
    }

    public int getMin() {
        if(left == null) {
            return value;
        }

        return left.getMin();
    }

    public int getDepth() {
        int depth = 0;

        if(left != null || right != null) {
            depth++;
        }

        if(left != null) {
            depth += left.getDepth();
        }

        if(right != null) {
            depth += right.getDepth();
        }

        return depth;
    }

    public String toString() {
        String str = "[" + value + " L";
        if(left != null) {
            str += left.toString();
        } else {
            str += "[]";
        }
        str += " R";
        if(right != null) {
            str += right.toString();
        } else {
            str += "[]";
        }
        str += "]";

        return str;
    }
}