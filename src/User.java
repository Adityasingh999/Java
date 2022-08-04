import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
class Student {
    private String studentname;
    Student(String studentname){
        this.studentname=studentname;
    }
    public String getUsername(){
        return studentname;
    }

    public String toString(){
        return studentname;

    }
}

class User{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        Collection<Student> stu= new ArrayList<Student>();
        int i;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.SEARCH");
            System.out.println("4.EXIT");
            i=s.nextInt();
            switch(i){
                case 1:
                        System.out.println("INSERT USERNAME");
                        String studentname=s1.nextLine();
                        stu.add(new Student(studentname));
                    break;
                case 2:
                    System.out.println("DISPLAY USERNAME");
                    Iterator<Student> st = stu.iterator();
                    while(st.hasNext()){
                        Student e = st.next();
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("SEARCH USERNAME");
                    int f=0;
                    String search=s1.nextLine();
                    Iterator<Student> b = stu.iterator();
                    while(b.hasNext()) {
                        Student e = b.next();
                        if(e.getUsername().equals(search)){
                            f=1;
                            break;

                    }
                        }
                    if(f==1){
                        System.out.println(search);
                    }
                        else{
                            System.out.println("Not Found");
                    }
                case 4:
                    System.out.println("EXIT");





            }


        } while (i != 0);
    }

}