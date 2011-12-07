grammar Tlen;

s	 returns [AFND afnd] 
:	expr EOF {afnd = $expr.afnd;};
expr returns [AFND afnd]
:	dis {afnd = $dis.afnd;} ('|' expr2 = expr {afnd = AFND.paralelize($dis.afnd,$expr2.afnd);})? ;
dis	returns [AFND afnd]  
:	un {afnd = $un.afnd;}(dis2 = dis {afnd = AFND.serialize($un.afnd,$dis2.afnd);})? ;
un returns [AFND afnd]
 	:	atom {afnd = $atom.afnd;}
 	 ( '+' {afnd = AFND.plusRepeat($atom.afnd);}|
	   '*' {afnd = AFND.repeat($atom.afnd);}|
	   '?' {afnd = AFND.optional($atom.afnd);})? ;
atom returns [AFND afnd]
  :('a' | 'b' | 'c' | 'd' |
		'e' | 'f' | 'g' | 'h' |
		'i' | 'j' | 'k' | 'l' |
		'm' | 'n' | 'o' | 'p' |
		'q' | 'r' | 's' | 't' |
		'u' | 'v' | 'w' | 'x' |
		'y' | 'z' | 
		'A' | 'B' | 'C' | 'D' |
		'E' | 'F' | 'G' | 'H' |
		'I' | 'J' | 'K' | 'L' |
		'M' | 'N' | 'O' | 'P' |
		'Q' | 'R' | 'S' | 'T' |
		'U' | 'V' | 'W' | 'X' |
		'Y' | 'Z' |
		'0' | '1' | '2' | '3' |
		'4' | '5' | '6' | '7' |
		'8' | '9' | ' ' ) {retval.afnd = AFND.simple($atom.text);}
		| '.'{retval.afnd = AFND.any();}
		| '('expr')'{retval.afnd = $expr.afnd;};


