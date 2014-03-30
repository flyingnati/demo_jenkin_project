package demo.jenkins;

public class Grade {

public String convert(int score) {
int ap = 85;
int a = 80;
int b = 70;
int c = 60;
int d = 50;
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

public String cal(int score) {
int ap = 85;
int a = 80;
int b = 70;
int c = 60;
int d = 50;
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
}
}
