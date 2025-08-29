import java.util.Arrays;
public class learnarrays{
public static void main(String[] args)
{
int a=1;
int b=2;
int c=3;
int d=4;
int e=5;
int[] marks=new int[5];
marks[0]=100;
marks[1]=70;
marks[2]=89;
marks[3]=70;
marks[4]=99;
int[] scores={80,11,100,19,39};
int lengthofarray=scores.length;
System.out.println(lengthofarray);
System.out.println("score in 3rd match "+scores[2]);
Arrays.sort(scores);
System.out.println(scores[2]);
for(int i=0;i<lengthofarray;i++){
System.out.println(scores[i]);
}
System.out.println("least value"+scores[0]);
System.out.println("Largest value"+scores[lengthofarray-1]);
}
}
