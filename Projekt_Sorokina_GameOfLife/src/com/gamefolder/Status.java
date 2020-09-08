package com.gamefolder;

public enum Status { // which status has a cell
 NONE,
 BORN,
 LIVE,
 DIED;

 public Status stepI(int radius) {
	switch (this) {
	case NONE:return(radius == 3) ? BORN :NONE;// if around an empty cell is a three living cells , than here will be a LIVE; 
	case LIVE:return(radius <= 1 || radius>=4) ? DIED :LIVE;// if around a LIVE cell is less than one living cell or more then four, this cell gonna die;	
		

	default: return this;
		
	}
 }
 public Status stepII() {
	switch (this) {
	case BORN: return LIVE;
	case DIED: return NONE;	
		

	default: return this;
	}
 }
 public boolean isCellAlive() {
	  
	 return this == LIVE || this == DIED; 
 }

}