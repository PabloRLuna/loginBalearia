package bean;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Scanner;

public class LoginDao {

    public static boolean validate(LoginBean user){

        boolean status=false;
        try{
            File myObj = new File("C:\\Users\\todop\\IdeaProjects\\login\\src\\resources\\pass.txt");
            Scanner myReader = new Scanner(myObj);
                String data = myReader.nextLine();
            System.out.println(data + "|||" + user.getEmail());
                if(data.equals(user.getEmail())) {
                    data = myReader.nextLine();
                    System.out.println(data+"|||" + user.getPass());
                    if (data.equals(user.getPass())) status = true;
                }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

       /*
            Connection con=ConnectionProvider.getCon();

            PreparedStatement ps=con.prepareStatement(
                    "select * from balearia where email=? and pass=?");

            ps.setString(1,user.getEmail());
            ps.setString(2,user.getPass());

            ResultSet rs=ps.executeQuery();
            status=rs.next();

        }catch(Exception e){}

        return status;*/
       return status;

    }
}