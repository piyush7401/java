import java.util.*;

class student{
    private String name;
    private int rollno;

    public String getStudentName(){
        return name;
    }

    public int getStudentRollno(){
        return rollno;
    }

    public void setStudentName(String name){
        this.name = name;
    }

    public void setStudentRollno(int rollno){
        this.rollno = rollno;
    }
};

public class DataHiding {
    public static void main(String args[]){
        student s = new student();
        int rollno;
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        rollno = sc.nextInt();
        s.setStudentName(name);
        s.setStudentRollno(rollno);
        System.out.println(s.getStudentName());
        System.out.println(s.getStudentRollno());
    }  
}
