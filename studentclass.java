import javax.management.modelmbean.ModelMBean;

class student 
{
    private String roll,name,department;
    private String subjects[]=new String[5];

    public student(String roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }

    public void setDepartment(String dep)
    {
        department=dep;
    }

    public void setSubjects(String ...sub)
    {
        for(int i=0;i<sub.length;i++)
        {
            subjects[i]=sub[i];
        }
    }

    public String getRoll()
    {
        return roll;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void getSubjects()
    {
        for(int i=0;i<subjects.length;i++)
        {
            System.out.println(i+1+". "+subjects[i]);
        }
    }



    public void Data()
    {
        // String =new String();
        // for(int i=0;i<subjects.length;i++)
        // {
        //     sub[i]=subjects[i];
        // }

        System.out.print( "\nStudent roll : "+roll +"\nName : "+name+"\nDepartment : "+department+"\nSubjects :\n");
        getSubjects();
    }



}


public class studentclass {
    
    public static void main(String[] args) {
        
        student modern[]=new student[3];
        modern[0]=new student("CII-20037","pratap");
        modern[1]=new student("CII-20038","prasad");
        modern[2]=new student("cr_293","Ashish");

        modern[0].setDepartment("Computer");
        modern[1].setDepartment("Computer");
        modern[2].setDepartment("Mechamical");

        modern[0].setSubjects("DS","SPOS","DBMS","TOC","CNS");
        modern[1].setSubjects("DS","SPOS","DBMS","TOC","CNS");
        modern[2].setSubjects("SOM","TOM","Mechanic","CAD","Machinery");

        modern[0].Data();

        

    }
    
}
