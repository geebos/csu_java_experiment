/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_5;


public class zh_1 {
    Node header;

    public zh_1(int n){
        Node p,q;
        header=new Node();
        header.data=(int)(Math.random()*100);
        p=header;
        for(int k=1;k<n-1;k++){
            q=new Node();
            q.data=(int)(Math.random()*100);
            p.next=q;
            p=q;
        }
    }

    void outputLink(){
        Node p=header;
        while(p!=null){
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.println();
    }

    public static void main(String a[]){
        zh_1 x=new zh_1(10);
        x.outputLink();
        Node q=new Node();

        q.data=100;
        q.next=x.header;

        x.header=q;
        x.outputLink();
        Node p=x.header;
        while(p!=null){
            q=p;
            p=p.next;
        }

        p=new Node();
        p.data=100;
        q.next=p;

        x.outputLink();
    }

}

class Node{
    int data;
    Node next;
}


