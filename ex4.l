%{
#include<stdio.h>
int count=0;
%}
%%
a*b* {count++;}{printf("entered pattern is %s\n",yytext);}
	
	
%%
int main()
{
printf("enter the pattern\n");
yylex();
printf("the count is %d",count);
if(count==1)
{
printf("the pattern is matched\n");
}
else
{
printf("the pattern is not matched\n");
}
return 0;
}

