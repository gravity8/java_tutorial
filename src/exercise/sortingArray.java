package exercise;

public class sortingArray {
    public static void main(String[] args) {
        sorter(new int[]{3,2,1,4});
    }
    public static int[] sorter(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j< array.length;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
