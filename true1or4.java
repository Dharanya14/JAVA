public class true1or4 {
    public static void main(String args[]){
        int a[]={1,4,1,4,3,1};
        boolean b=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==1 || a[i]==4){
                b=true;
            }
            else{
                b=false;
                break;
            }
        }
        System.out.println(b);
    }
}
