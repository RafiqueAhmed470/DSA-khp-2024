class Task01{
    public static void main(String[] args){
        int arr1 []= {1,2,3,5,7,2,2,7,8,9};
        int arr2 []= new int[10];
        int j=0;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] % 2 != 0){
                arr2[j]=arr1[i];
                j++;    
            }
        }
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] % 2 == 0){
                arr2[j]=arr1[i];
                j++;    
            }
        }
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]+" ");
        }
    }
}