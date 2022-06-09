%{
#include<stdio.h>
int flag=0;
%}
%%
(""[aA][nN][dD]"")|(""[oO][rR]"");

flag=1;
%%
int main()
{
printf("enter the sentence\n");
yylex();
if(flag==1)
printf("compound statement");
else
printf("simple statement");
return 0;
}
