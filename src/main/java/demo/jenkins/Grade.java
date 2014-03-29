package demo.jenkins;

public class Grade {

public String convert(int score) {
int ap = 85;
int a = 80;
int b = 70;
int c = 60;
int d = 50;

if (score >= 85) {
return "A+";
}
if (score >= 80) {
return "A";
}
if (score >= 70) {
return "B";
}
if (score >= 60) {
return "C";
}
if (score >= 50) {
return "D";
}
return "F";
//TODO
//FIXME
}
}
