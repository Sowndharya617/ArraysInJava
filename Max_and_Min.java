public class Main {
    public static void main(String[] args) {
        int []arr={2,4,5,4,2,10,1};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            
        }System.out.print(max+" "+min+" ");
    }
}
