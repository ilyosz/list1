import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int id;
        int i=1;
        ArrayList<User> users = new ArrayList<User>();
        while (true){
            System.out.println("1-set " + "\n" + "2-get inf");
            Scanner scan= new Scanner(System.in);
            int a=scan.nextInt();
            switch (a){
                case 1:{
                User user = new User();
                
                    System.out.println("cash");
                    Scanner scan2=new Scanner(System.in);
                    int a1=scan2.nextInt();
                    user.setCash(a1);
                    System.out.println("name");
                    Scanner scan3=new Scanner(System.in);
                    String b=scan3.nextLine();
                    user.setFname(b);
                    users.add(user);
                    User use=users.get(users.size()-1);
                    id=use.getId()+ i ;
                    user.setId(id);
                    //System.out.println(users.toString());
                    i++;
                }
                break;
                case 2:{
                    System.out.println("id");
                    Scanner scan4=new Scanner(System.in);
                    int c=scan4.nextInt();
                    if(c>=1 && c<=i){
                        id=c;

                        System.out.println(users.get(id-1).toString());
                    }
                }
                break;
            }
        }
    }
}
