%{
#include"y.tab.h"
#include<stdio.h>
extern int yylval;
%}
%%
void|int|float|printf {printf("keyword  is %s\n",yytext);return KEY;}
[a-zA-Z]+ {printf("identifier is %s\n",yytext);return ID;}
[*|+|-|/]* {printf("operator is %s\n",yytext);return OP;}
[0-9]+ {yylval=atoi(yytext);printf("digit is %d\n",yylval);return DIGIT;}
. ;
%%
