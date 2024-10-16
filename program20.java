class BinarySearch
{
    int[] arr = { 12, 34, 56, 78, 90, 99, 120, 140, 167, 450, 899 };
    int key = 56;
    void SearchFor56()
    {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<high)
        {
            mid = high+low/2;
            if(arr[mid] > key)
            {
                high = mid-1;
            }
            if(arr[mid] < key)
            {
                high = mid+1;
            }
            if(arr[mid] == key)
            {
                System.out.println("Search Succesful, data found in " + mid + " index");
                System.exit(0);
            }
        }
        System.out.println("Search not succesful");
    }
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        b.SearchFor56();
    }
}