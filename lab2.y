%{
#include<stdio.h>
%}
%token A B ENTER
%%
stmt:s ENTER {printf("valid grammar or pattern matches");exit(0);}
s:A A | b
A:A | A
 ;
%%
void main()
{
printf("enter the string\n");
yyparse();
}
yyerror()
{
printf("INvalid Expression\n");
}
