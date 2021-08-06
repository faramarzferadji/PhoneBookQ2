import java.util.Scanner;

public class PhoneBook {
    String name;
    int number;
    PhoneBook(){}

    public PhoneBook(String name, int number) {
        this.name =
                name;
        this.number =
                number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =
                name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number =
                number;
    }
}
class A{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PhoneBook phone[]=new PhoneBook[4];
        for (int i=0; i< phone.length; i++){
          phone[i] =new PhoneBook() ;
            System.out.println("enter the name");
            phone[i].setName(scanner.next());
            System.out.println("enter the tel.number");
            phone[i].setNumber(scanner.nextInt());

        }
        for (int i=0; i< phone.length; i++){
            for (int j=i+1; j< phone.length; j++){
                if (phone[i].name.compareTo(phone[j].name)>0){
                    String t=phone[i].name;
                    int q = phone[i].number;
                    phone[i].name=phone[j].name;
                    phone[i].number=phone[j].number;
                    phone[j].name= t;
                    phone[j].number= q;
                }
            }
        }
        System.out.println("Phone book ranking by alphabet");
        for (int i=0; i< phone.length; i++)
            System.out.println((i+1)+"  "+phone[i].name+"  "+phone[i].number);

    }
}
