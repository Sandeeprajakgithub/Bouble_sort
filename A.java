//bubble sort 
class A{
    public static void main(String args[]){
        int arr[] = {10,8,9,7,5,1};

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length-i-1 ; j++){
                if(arr[j+1]<arr[j]){
                    swap(arr,j+1,j);
                }
            }
        } 
        showArrayValues(arr);
    }
    static void swap(int arr[], int a , int b){
        int y = arr[a];
        arr[a] = arr[b];
        arr[b] = y;
    }
    static void showArrayValues(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"  +++  ");
        }
    }
}