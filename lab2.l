%{
#include"y.tab.h"
%}
%%
a {return A;}
b {return B;}
"\n" {return ENTER;}
. {return yytext[0];}
%%
