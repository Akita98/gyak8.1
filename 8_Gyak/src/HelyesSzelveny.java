public class HelyesSzelveny extends Szelveny {
private int talalat;
private int nyeremeny;
public HelyesSzelveny(String nev, int[] tipp, int talalat) {
super(nev, tipp);
this.talalat = talalat;
this.nyeremeny = 0;
}
@Override
public String toString() {
return "HelyesSzelveny [talalat=" + talalat + ", nyeremeny="
+ nyeremeny + ", toString()=" + super.toString()+ "]";
}
public static int Talalat(Szelveny s, Szelveny kihuzott){
int[] lt =s.getTipp();
int[] kh =kihuzott.getTipp();
int t = 0;
for (int i=0; i<5; i++)
for (int j=0; j<5; j++)
if (lt[i] == kh[j]) t++;
return t;
}
public int getTalalat() {
return talalat;
}
public void setNyeremeny(int nyeremeny) {
this.nyeremeny = nyeremeny;
}
}