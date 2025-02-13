class Student{
    String name;
    int rollno;
    String email;
    Student(String name,String email){
        this.name=name;
        this.email=email;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
    }
}
class SSTStudent extends Student{
    int WDMarks;
    int ICPMarks;
    int DMMarks;
    SSTStudent(String name,String email){
        super(name, email);
    }
}

public class Oops{
    public static void main(String[] args) {
        SSTStudent s1=new SSTStudent("Ankit","A@SST.com");
        // s1.name="Ankit";
        s1.rollno=19;
        s1.WDMarks=90;
        s1.ICPMarks=80;
        s1.DMMarks=70;
        s1.print();
        
    }
}