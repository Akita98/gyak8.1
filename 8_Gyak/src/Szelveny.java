import java.util.Arrays;
public class Szelveny {
private String nev;
private int[] tipp;
public Szelveny(String nev, int[] tipp) {
this.nev = nev;
this.tipp = tipp;
}
@Override
public String toString() {
return "Szelveny [nev=" + nev + ", tipp=" +
Arrays.toString(tipp) + "]";
}
public String getNev() {
return nev;
}
public int[] getTipp() {
return tipp;
}
public void Rendez(){
int s=0;
for (int i=0; i<4; i++)
for (int j=i+1; j<5; j++)
if (tipp[j] < tipp[i]) {
s = tipp[j];
tipp[j] = tipp[i];
tipp[i] = s;
}
}
public boolean Helyes(){
int db=0;
for (int i=0; i<4; i++) if (tipp[i] == tipp[i+1]) db++;
return (db < 1 ? true:false);
}
}