/**
 * @author:   Mr. Allen
 *            2017 Wittry contest
 */
import java.io.*;
import java.util.*;
import java.math.*;

public class ForestPlayGround 
{
    String[] myTree;

    /*
     *   PreConditions
     *        tree is a valid represntation fo a binary tree
     *        tree != null
     *        tree.size() >= 0
     */
    public ForestPlayGround(String[] tree)
    {
        myTree = tree;
    }

    /*
     *    return the number of non null nodes in myTree
     */
    public int getNumNodes()
    {
        return -1;
    }

    /*
     *    A leaf is a node in the tree in which both children have 0 children.
     *    An empty tree contains NO leafs
     */
    public int getNumLeafs()
    {
        return -1;
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *
     *    returns:
     *        the right child of myTree[p]
     *        null if myTree[p] does not have a right child
     */
    public String getRightChild(int p)
    {
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *
     *    returns:
     *        the left child of myTree[p]
     *        null if myTree[p] does not have a left child
     */
    public String getLeftChild(int p)
    {
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *                    myTree[p] != null
     *
     *    returns:
     *        the parent of myTree[p]
     *        null if myTree[p] does not have a parent
     */
    public String getParent(int p)
    {
        return "";
    }

    /*
     *    Precondition:   0 <= p < myTree.length
     *                    myTree[p] != null
     *
     *    returns:
     *        the List of all ancestors (parent and their parent ans so on) of myTree[p]
     *        an empty List if myTree[p] does not have a parent
     */
    public List<String> getAncestors(int p)
    {
        ArrayList<String> ans = new ArrayList<String>();
        
        return ans;
    }

    /*
     * Preconditions:
     *    myTree[p] != null
     *    0 <= p < myTree.length
     */
    public List<String> getDescendants(int p)
    {
        ArrayList<String> ans = new ArrayList<String>();
        
        return ans;
    }

    /*
     *    In a complete binary tree every level, except possibly the last, is completely filled,
     *    and all nodes in the last level are as far left as possible.
     *    
     *    This implies that the end of the array may contain multiple nulls
     *                               and the array/tree may still be complete
     */
    public boolean isComplete()
    {
        return Math.random() > 5;
    }

    /*
     *    A full binary tree is a tree in which every node in the tree has either 0 or 2 children.
     */
    public boolean isFull()
    {
        return Math.random() > 5;
    }

    /*
     *    returns the least common ancestor of child1 and child2
     *    
     *    you may assume child1 and child2 are valid nodes in the tree
     */
    public String getLowestCommonAncestor(String child1, String child2)
    {
        return "";
    }
}