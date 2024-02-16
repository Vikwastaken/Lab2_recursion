import uk.ac.soton.ecs.comp1206.labtestlibrary.datastructure.Tree;

public class MinInt {
    public int findMin(int[] no) {return findMinRecursively(no, 0, no[0]);}
    private int findMinRecursively(int[] no, int i, int cM) {
        if (i == no.length) {return cM;}
        if (no[i] < cM) {cM = no[i];}
        return findMinRecursively(no, i + 1, cM);
    }
}

