/**
 * author: geebos
 * GitHub: https://github.com/geebos
 * email: tongyulong@csu.edu.cn
 */
package chapter_9;

public class chapter_9_2 {
    public static void main(String args[]) {
        System.out.println("请依次输入十个学生的姓名、学号和三门课程的成绩（不同项之间以空格分隔）：");
        int n = 10;
        Student students[] = new Student[10];
        for(int i=0;i<n;i++){
            try{
                throw new ClassNotFoundException();
            }
            catch (ClassNotFoundException e){

            }
        }
    }
}

class Student{
    private String name;
    private String stu_id;
    private int course_1;
    private int course_2;
    private int course_3;

    Student(String name, String stu_id, int course_1, int course_2, int course_3){
        this.name = name;
        this.stu_id = stu_id;
        this.course_1 = course_1;
        this.course_2 = course_2;
        this.course_3 = course_3;
    }

    public int get_course_grade_by_name(String name){
        switch (name){
            case "course_1":
                return course_1;
            case "course_2":
                return course_2;
            case "course_3":
                return course_3;
        }
        return 0;
    }

    public int get_average_grade(){
        return (course_1 + course_2 + course_3) / 3;
    }

}
