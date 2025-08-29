public class ReverseString
{
public static void main(String args[])
{
String input="Amazon Development center Chennai"; //literal
input=input.toLowerCase();
String[]words=input.split(" ");
int count=words.length;
System.out.println("Reversed String is");
for(int i=count-1;i>=0;i--)
{
System.out.print(words[i]+" ");
}
}
}