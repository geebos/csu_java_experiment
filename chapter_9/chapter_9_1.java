/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_9;

public class chapter_9_1 {
    public static void main(String[]args){
        String className;
        if(args.length>0)
            className=args[0];
        else
            className="java.lang.Name";
        try {
            Class c=Class.forName(className);
            System.out.println(className+"是Java类库中已有的类。");
        }
        catch(ClassNotFoundException e){
            System.out.println(className+"不在Java类库中。");
        }
    }
}
