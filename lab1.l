%{
#include<stdio.h>
int identifiers=0,operators=0,braces=0,alpha=0,spaces=0;
%}
%%
[a-zA-Z] {alpha++; printf("\nAlphabet;");ECHO;}
[0-9]* {identifiers++; printf("\nidentifiers:");ECHO;}
[*/+] {operators++; printf("\noperators:");ECHO;}
"(" {braces--;}
")" {braces--;}
[ ] {spaces++;}
./\n {;}
%%
void main()
{
printf("enter the expression :");
yylex();
if((braces==0) && (operators==identifiers-1) && (alpha==0) && spaces==0)
{
printf("\nvalid expression");
printf("\nnumber of operators:%d",operators);
printf("\nnumber of identifiers:%d",identifiers);
}
 else
{
printf("\ninvalidexpression :");
printf("\n");
} 
}
