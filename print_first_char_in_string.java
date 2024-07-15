import java.util.*;
class main{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    str=" "+str;
    char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){
        if(ch[i]==' '){
            System.out.println(ch[i+1]);
            }
        }
    }
}
