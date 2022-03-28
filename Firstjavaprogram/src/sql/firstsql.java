package sql;
import java.sql.*;
import java.util.Scanner;

public class firstsql {
    static String url="jdbc:mysql://localhost:3306/db";
    static String uname="root";
    static String pass="Oct121993@";

    //Class.forName("com.mysql.jdbc.Driver")
static void create(Connection con) throws Exception {
//    String query="create table student (roll_no INT NOT NULL,name varchar(20) NOT NULL, marks varchar(20) )";
//    Statement st = con.createStatement();
//   st.executeUpdate(query);

    System.out.println("Table created");
    System.out.println("Roll_number | Name | marks");
    System.out.println("How many records yo  u want to enter");
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String query2 = "insert into student values (?,?,?)";
    PreparedStatement s=con.prepareStatement(query2);
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter roll no.");
        int r=sc.nextInt();
        System.out.println("Enter name");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("Enter marks");
        int mark=sc.nextInt();
       s.setInt(1,r);
       s.setString(2,str);
       s.setInt(3,mark);

        int cnt=s.executeUpdate();
        if(cnt>0)
            System.out.println("row updated successfully");
        else
            System.out.println("not updated ");
    }

 //   st.close();
    s.close();
}
static void read(Connection con) throws Exception{
    Statement st=con.createStatement();
    String query = "select * from student";
    ResultSet rs=st.executeQuery(query);
    while(rs.next())
    {
        System.out.println(rs.getInt(1) + ": " +rs.getString(2) +" : "+rs.getInt(3));
    }
st.close();
}
static void update(int rn,int mark,Connection con) throws Exception {
    String query = "update student set marks=? where roll_no=?";
    PreparedStatement st=con.prepareStatement(query);
    st.setInt(1,mark);
    st.setInt(2,rn);

    int cnt=st.executeUpdate();
    if(cnt>0)
        System.out.println("table updated successfully");
    else
        System.out.println("not updated ");

    st.close();
}
static void delete(Connection con,int r) throws Exception
{
    String query= "delete from student where roll_no=?";
    PreparedStatement st=con.prepareStatement(query);
    st.setInt(1,r);
    int cnt=st.executeUpdate();
  if(cnt>0)
      System.out.println("Successfully deleted");
  else
      System.out.println("Not deleted");

  st.close();
}
  static void fun() throws Exception {// ClassNotFoundException, SQLException {
      //setting up connection to db database
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con=DriverManager.getConnection(url,uname,pass);
      System.out.println("Tell us what you want to do! 1->CREATE /n 2->READ /n 3->UPDATE /n 4->DELETE");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch (n)
      {
          case 1:
              System.out.println("CREATE TABLE");
              create(con);
              break;
          case 2:
              System.out.println("READ TABLE");
              read(con);
             // System.out.println("");
              break;
          case 3:
              System.out.println("UPDATE");
              System.out.println("Enter rollnumber whose marks to be updated");
              int rn=sc.nextInt();
              System.out.println("enter new marks");
              int marks=sc.nextInt();
              update(rn,marks,con);
              break;
          case 4:
              System.out.println("DELETE");
              System.out.println("Enter roll no of whom record to be deleted");
              int r=sc.nextInt();
              delete(con,r);
              break;
          default:
              System.out.println("default");
              break;
      }
//      st.close();
      con.close();
  }
    public static void main(String[] args) throws Exception{

        fun();

       // Statement st=con.createStatement();
//        String query1 = "select name from temp where ROLLnumber=1";
//        String query2 = "select * from temp";
        ///fetch values DDL

//   ResultSet rs=st.executeQuery(query2);
//     while(rs.next()) {
//         int nm = rs.getInt(2); // rs is the object returened which has whole table that is why we use this method getstring() to extract coloumn
//         String str = rs.getString(1);
//         String ans = nm + " : " + str;
//         System.out.println(ans);
//     }

      // insert values DML
//        int userid=5;
//        String username="jappi";
    //    String query3 = "insert into temp values('"+username +"',"+userid+")";
//   int count = st.executeUpdate(query3);//it will return count of number of rows affected
//        System.out.println(count + " rows affected");

        //preparedstatement
//        int userid=6;
//        String username="ankit";
//        String query4="insert into temp values(?,?)";
//        PreparedStatement st2=con.prepareStatement(query4);
//       st2.setInt(2,userid); //set second ques.mark value
//       st2.setString(1,username);//set first ques. mark value
//       int count = st2.executeUpdate();
//        System.out.println(count + " row affected");

//        String s1="show tables";
//        ResultSet s=st.executeQuery(s1);
//        s.next();
//        System.out.println(s.getString(1));

    }
}
