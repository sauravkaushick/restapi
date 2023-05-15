package Resources;

public enum paths {
	
    VIDEOGAMES {

        // overriding toString() for SMALL
        public String toString() {
          return "/videogame";
        }
     },
  
     VIDEOGAMESID {
  
       // overriding toString() for MEDIUM
        public String toString() {
          return "/videogame/${id}";
        }
     };

    
}
