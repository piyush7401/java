import java.util.*;

class student{
    private int subid;
    private String subName;
    private int marks;

    //Parameter Constructor
    public student(int subid,String subName,int marks){
        this.marks = marks;
        this.subName = subName;
        this.subid = subid;
    }

    //Setter method
    public void setSubid(int subid){
        this.subid = subid;
    }

    public void setSubName(String subName){
        this.subName = subName;
    }

    public void setmarks(int marks){
        this.marks = marks;
    }

    //Setter
    public int getmarks(){
        return this.marks;
    }
};

public class ArrayObject {
    
    public static void main(String[] args) {
        // array of size 3
        student s[] = new student[3];
        //using setter operator
        s[0] = new student(0, null, 0);
        //First aapko new memory allocate krne hogi tabhi,set method value set krnge.
        s[0].setSubName("maths");
        s[0].setSubid(133);
        s[0].setmarks(68);

        //using constructor
        s[1] = new student(1553,"english",85);

        s[2] = s[1];

        for(student x : s){
            System.out.println("Reference "+x+" marks obtained "+x.getmarks());
        }
    }
}
