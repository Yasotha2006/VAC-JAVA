class FindDuplicate
{
public static void main(String[] args)
{
int arr[]={2,5,7,7,5,9,2};
boolean found=false;
for( int i=0;i<arr.length;i++)
{
for( int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println("Duplicate found "+arr[i]);
found=true;
}
}
}
if(!found)
{
System.out.println("No Duplicate");
}
}
}
