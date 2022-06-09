%{
#include<stdio.h>
int i=0;
%}
%%
([a-z A-Z 0-9])*{i++}
"\n" {printf("the number of words is %d,i);}
%%
int main()
{
printf("enter the sentence\n");
yylex();
return 0;
}
