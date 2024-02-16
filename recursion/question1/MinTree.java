import uk.ac.soton.ecs.comp1206.labtestlibrary.datastructure.Tree;
public class MinTree {
  public int findMin(Tree tree) {
    if (tree == null) {return Integer.MAX_VALUE;}
    int lM = findMin(tree.left());
    int rM = findMin(tree.right());
    return Math.min(tree.getVal(), Math.min(lM, rM));
  }
}
