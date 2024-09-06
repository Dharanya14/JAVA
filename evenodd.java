public class evenodd {
    public static void main(String[] args){
        int a[]={1,0,1,0,1,1,0};
        int b[]=new int[10];
        int j=0;
        int y=a.length-1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                b[j++]=a[i];
            }
            else{
                b[y--]=a[i];

            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
