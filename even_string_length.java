import java.util.*;
class main{
    public static void main(String args[]){
       String str="online java complier pro";
       for(String s:str.split(" "))
       {
          if(s.length()%2==0){
               System.out.println(s+" "+"length is"+" "+s.length());
              }
       }
   }
}
