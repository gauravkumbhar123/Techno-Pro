package JavaBasics;

public class BubbleSort2 {
public static void main(String[] args) {
			int [] arr = {13,36,34,18,10,15,65};
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}	
				}
			}
	for(int i=0;i<arr.length-1;i++) {
		System.out.println(arr[i]);
		
	}
		}

	}

