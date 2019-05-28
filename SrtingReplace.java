import java.util.*;
public class SrtingReplace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=new String[3];
        arr[0]=sc.nextLine();arr[1]=sc.nextLine();arr[2]=sc.nextLine();
        String temp=getSringRepaet(arr[0]+" "+arr[1]+" "+arr[2]);
        display(temp,arr);
    }
    public static void display(String str,String[] arr2 ){
        for(int i=0;i<arr2.length;i++){
            String tem[]=str.split(" ");
            String tem2[]=arr2[i].split(" ");
            for(int j=0;j<tem2.length;j++){
                for(int k=0;k<tem.length;k++){
                    if(tem[k].equals(tem2[j])){
                        tem2[j]="";
                    }
                }
            }
            for(int ki=0;ki<tem2.length;ki++){
                System.out.print(tem2[ki]+" ");
            }    
            System.out.println();
        }
    }
    public static String getSringRepaet(String str){
        String data[]=str.split(" ");
        String ans="";
        int cc=0;
        for(int i = 0; i < data.length; i++) {
            int c=0;
            String temp=data[i];
            for (int j = i; j < data.length; j++) {
                if(temp.equals(data[j])){
                    data[j]=" ";
                    c++;
                }
            }
            if(!temp.equals(" ") && c>=cc){
                ans+=temp+" ";
                cc=c;
            }            
        }
        return ans;
    }
}
