class Main {
    public static void main(String[] args) {
        int [][] arr ={{1,2,3},{4,5,6}};
        System.out.println("transporse matrix:");
        for(int i = 0 ;i<arr[0].length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                System.out.println(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
