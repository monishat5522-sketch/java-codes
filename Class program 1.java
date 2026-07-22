class Student{
    int rollno;
    String name;
    String dept;
    char section;
    int year;
    Student(int rollno,String name,String dept,char section,int year)
    {
        this.rollno= rollno;
        this.name= name;
        this.dept = dept;
        this.section= section;
        this.year = year;
    }
    void display(){
        System.out.println("rollno:"+rollno);
         System.out.println("name :"+ name);
          System.out.println("dept:"+ dept);
           System.out.println("section :"+section);
            System.out.println("year:"+ year);
             System.out.println();
      }
    }
    public class Main {
        public static void main(String[] args){
            Student[]students  = new Student[2];
       Student s1 = new Student(101,"moni","eee",'a',2026);
            students[0] = s1;
           Student s2 = new Student(101,"lenin","eee",'b',2026);
           students[1] = s2;
            for(int i= 0;i<students.length;i++)
            students[i].display();
          }
    }
