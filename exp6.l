%{
#include<stdio.h>
int nchars=0,nlines=0,nwords=0,space=0;
%}
%%
[" "] {space++;}
\n {nlines++;}
[^ \n\t]+ {nwords++;nchars=nchars+yyleng;}
. {nchars++;}

	
	
%%
int main()
{
yyin=fopen("name.txt","r");
yylex();
printf("the count of letter is %d\n",nchars);
printf("the count of lines is %d\n",nlines);
printf("the count of words is %d\n",nwords);
printf("the count of space is %d\n",space);
return 0;
}

