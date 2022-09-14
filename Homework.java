package array;

public class Homework {

public static void main(String[] args) {
char gender []={'M','F','T'};

for(int i=0; i<gender.length; i++) {
//System.out.println(gender.length);

//int a=gender[i];
//a=a+32;
//char b= (char) a; //implicity typecast
gender[i]=(char) ((char)gender[i]+32);

	}
for(int i=0; i<gender.length; i++)
	System.out.println(gender[i]);	
	
}
}
//EXOP:m,f,t