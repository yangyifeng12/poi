package StructAndData.Stacks_And_Queues;

import StructAndData.Array;

public class aaa {
    static Array array=new Array(10);
    @Override
    public String toString(){
        StringBuilder res=new StringBuilder();
        res.append("Stack:");
        res.append("[");
        for(int i=0 ; i<array.getSize();i++){
            res.append(array.get(i));
            if(i !=array.getSize() -1){//判断如果不是数组最后一个元素就加个逗号
                res.append(", ");
            }
        }
        res.append("]top");//数组的栈顶都是最右边的
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(array.getSize());
    }
}
