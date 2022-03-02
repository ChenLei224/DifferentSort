public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,9,6,3,1,4,2,8,7};

        for(int i=0; i<arr.length-1; i++){
            int minPos = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minPos])
                    minPos = j;
            }
            System.out.println("minPos: " + minPos);

            swap(arr, i, minPos);

            System.out.println("经过第" + i + "次循环，数组内容是：");
            print(arr);
        }

    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr){
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }



}
