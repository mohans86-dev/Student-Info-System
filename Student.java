import java.io.*;


public class Student {
    private final String FILE_NAME="studentdata.txt";
    public String studentId;
    public String studentName;
    public String studentClass;
    public String studentRollNo;
    private boolean acceptStudentInformation(){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the student ID:");
            studentId=br.readLine();
            if (studentId.isEmpty()){
                System.out.println("please enter student ID");
                return false;
            }
            System.out.println("enter the student name : ");
            studentName=br.readLine();
            if (studentName.isEmpty()){
                System.out.println("please enter student name:");
                return false;
            }
            System.out.println("enter the student class : ");
            studentClass=br.readLine();
            if (studentClass.isEmpty()){
                System.out.println("please enter student class:");
                return false;
            }
            System.out.println("enter the student roll no : ");
            studentRollNo=br.readLine();
            if (studentRollNo.isEmpty()){
                System.out.println("please enter student roll no:");
                return false;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    public boolean saveStudentInformation(){
        if (!acceptStudentInformation()){
            return false;
        }
        try{
            PrintWriter pw=new PrintWriter(new FileWriter(new File(FILE_NAME),true));
            pw.println(studentId+","+studentName+","+studentClass+","+studentRollNo);
            pw.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    public boolean printStudentInformation(){
        try{
            BufferedReader br=new BufferedReader(new FileReader(FILE_NAME));
            System.out.println(String.format("%-12s %-18s %-15s %-10s", "Student ID", "Student Name", "Student Class", "Student Roll"));
            String dataLine=br.readLine();
            while (dataLine!=null){
                String[] data=dataLine.split(",");
                System.out.println(String.format("%-12s %-18s %-15s %-10s",data[0],data[1],data[2],data[3]));
                dataLine=br.readLine();
            }
            br.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return true;
    }
}