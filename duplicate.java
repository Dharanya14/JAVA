
public class duplicate {
    public static void main(String[] args){
        int a[]={12,34,12,45,67,89};
        int visited=-1;
        for(int i=0;i<a.length;i++){
        if(a[i]!=-1){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[j]=visited;
                }
            }System.out.println(a[i]);
        }
    }}
}
