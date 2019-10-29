class BinarySearch{
	public static void binarysearch(int arr[],int f,int l,int key){
		int mid = (f+l)/2;
		while(f<=l){
			if(arr[mid]<key){
				f=mid+1;
			}else if(arr[mid]==key){
				System.out.println("Element is at Index:"+mid);	
				break;
			}else{
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		if(f>l){
			System.out.println("Element is not found");
		}
	}
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};
		int key=30;
		int last=arr.length-1;
		binarysearch(arr,0,last,key);
	}
}