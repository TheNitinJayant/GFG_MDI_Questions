package GFG_MDI_Questions;

public class GeneralFunctions {

    public void swapElementsOfArray(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public void print2D(int[][] arr){
        String indentation="    ";
        int i=0;
        int j=0;
        System.out.println("[");
        for(i=0;i<arr.length;i++){
            System.out.print(indentation);
            System.out.print("[ ");
            for(j=0;j<arr[i].length-1;j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.print(arr[i][j]+" ]");
            System.out.println();
        }
        System.out.println("]");
    }
//    public void printSinglyLinkedList(Node head){
//        Node temp = head;
//        System.out.print("HEAD"+" -> ");
//        while (temp!=null){
//            System.out.print(temp.data+" -> ");
//        }
//        System.out.print("NULL");
//    }
}
