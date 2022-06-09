%{
	#include<stdio.h>
%}
%%
. ECHO;
"\n" {printf("MITE");}
%%
int main()
{
	yylex();
	return 0;
}
