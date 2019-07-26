package StructAndData.Stacks_And_Queues;

/**
 * creates by yyf on 2019-07-11 10:07
 */
public class BSTree<E extends Comparable<E>> {

    // 根节点
    private Node root ;
    // 树容量
    private int size ;

    public BSTree() {
        this.root = null ;
        this.size = 0 ;
    }

    public boolean isEmpty() {
        return size == 0 ;
    }

    public int getSize(){
        return size;
    }

    /**
     * 二分搜索树节点类
     * @author 七夜雪
     *
     */
    private class Node {
        public E	e ;
        // 左右子树
        public Node	left , right ;

        public Node(E e) {
            this.e = e ;
            this.left = null ;
            this.right = null ;
        }
    }
}