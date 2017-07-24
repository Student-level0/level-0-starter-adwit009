package day1;

import org.omg.Messaging.SyncScopeHelper;

import com.spun.util.database.SQLQuery.FromPart;

public class ForLoopGauntlet {
public static void main(String[] args) {
c11();
}
public static void c1(){
for (int i = 0; i < 101; i++) {
System.out.println(i);
}
}
public static void c2(){
for (int i = 100; i >-1; i--) {
System.out.println(i);
}
}
public static void c3(){
for (int i = 2; i < 101; i = i + 2 ) {
System.out.println(i);
}
}
public static void c4(){
for (int i = 1; i < 501; i ++ ) {

	System.out.print(i);
	if(i%2 == 0){
	System.out.println(" even");	
	}
	else{
	System.out.println(" odd");
	
	}
	}


}





public static void c5(){
for (int i = 1; i < 10; i = i +2 ) {
System.out.println(i);
}
}
public static void c8(){
int b = 0;
	for (int i = 0; i <3; i ++) {

	for(int a =0; a<3; a ++){
System.out.println(b + " "+ a);
	}
b = b+ 1;	
}

}










public static void c6(){
for (int i = 0; i < 778; i = i +7 ) {
System.out.println(i);

}
}
public static void c9(){
int a = 1;
int b = 2;
int c = 3;
	for (int i = 0; i < 3;  i ++ ) {
System.out.println(a + " "+ b + " " + c);
a = a + 3;
b = b+ 3;
c = c + 3;

}
}



public static void c10(){
int x = 0;
	for (int i = 1; i < 11; i++) {
	System.out.println();
	
	for (int j = 1 + x; j < 11 + x; j++) {

		System.out.print(j + " ");	
	}
x = x + 10;
	}
	
}

public static void c11(){
int x = 0;
	for (int i = 1; i < 7; i++) {
	System.out.println();
	
	for (int j = 1 ; j < 2 + x; j++) {

		System.out.print("*");	
	}
x = x + 1;
	}
	
}





















}







































