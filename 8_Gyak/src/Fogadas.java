import java.util.Scanner;
public class Fogadas {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Szelvények száma? ");
String s1 = sc.nextLine();
int db = Integer.parseInt(s1);
Szelveny [] L = new Szelveny[db];
HelyesSzelveny [] LS = new HelyesSzelveny[db];
int[][] st = new int[db][5];
int RndNum=0;
for (int i=0; i<db; i++){
System.out.println(i+". lottózó neve: ");
s1 = sc.nextLine();
for (int j=0; j<5; j++){
RndNum = 1 + (int)(Math.random()*24);
st[i][j] = RndNum;
}
L[i] = new Szelveny(s1, st[i]);
}
for (int i=0; i<db; i++) L[i].Rendez();
for (int i=0; i<db; i++) System.out.println(L[i]);
Szelveny KH =null;
int[] kh = new int[5];
do {
for (int j=0; j<5; j++){
RndNum = 1 + (int)(Math.random()*24);
kh[j] = RndNum;
}
KH = new Szelveny("Kihúzott számok", kh);
KH.Rendez();
} while (!KH.Helyes());
int index =0;
for (int i=0; i<db; i++)
if (L[i].Helyes()) {
LS[index] = new HelyesSzelveny(L[i].getNev(),
L[i].getTipp(), HelyesSzelveny.Talalat(L[i], KH) );
index++;
}
int szumtalalat=0;
System.out.println("Nyertes szelvények:");
for (int i=0; i<index; i++)
if (LS[i].getTalalat() > 0) {
System.out.println(LS[i]);
szumtalalat += LS[i].getTalalat();
}
for (int i=0; i<index; i++)
if (LS[i].getTalalat() > 0)
LS[i].setNyeremeny(1000/szumtalalat*LS[i].getTalalat());
for (int i=0; i<index; i++)
if (LS[i].getTalalat() > 0) System.out.println(LS[i]);
}
}