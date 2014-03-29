package demo.jenkins;

public class Grade {

private int ap = 85;
private int a = 80;
private int b = 70;
private int c = 60;
private int d = 50;

public String convert(int score) {
if (score >= ap) {
return "A+";
}
if (score >= a) {
return "A";
}
if (score >= b) {
return "B";
}
if (score >= c) {
return "C";
}
if (score >= d) {
return "D";
}
return "F";
//TODO
//FIXME
}
}
