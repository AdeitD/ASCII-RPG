public class HMAscii {  
  public static void printArt (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      try
      {
        Thread.sleep (2);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println();
  }
  
  public static void title () {
    printArt("\t\t\t _______             _______  _______  _______  _  _______    _______ _________ _______  _______ _________ _______  _       ");
    printArt("\t\t\t(  ___  )  |\\     /|(  ____ \\(  ____ )(  ___  )( )(  ____ \\  (       )\\__   __/(  ____ \\(  ____ \\\\__   __/(  ___  )( (    /|");
    printArt("\t\t\t| (   ) |  | )   ( || (    \\/| (    )|| (   ) ||/ | (    \\/  | () () |   ) (   | (    \\/| (    \\/   ) (   | (   ) ||  \\  ( |");
    printArt("\t\t\t| (___) |  | (___) || (__    | (____)|| |   | |   | (_____   | || || |   | |   | (_____ | (_____    | |   | |   | ||   \\ | |");
    printArt("\t\t\t|  ___  |  |  ___  ||  __)   |     __)| |   | |   (_____  )  | |(_)| |   | |   (_____  )(_____  )   | |   | |   | || (\\ \\) |");
    printArt("\t\t\t| (   ) |  | (   ) || (      | (\\ (   | |   | |         ) |  | |   | |   | |         ) |      ) |   | |   | |   | || | \\   |");
    printArt("\t\t\t| )   ( |  | )   ( || (____/\\| ) \\ \\__| (___) |   /\\____) |  | )   ( |___) (___/\\____) |/\\____) |___) (___| (___) || )  \\  |");
    printArt("\t\t\t|/     \\|  |/     \\|(_______/|/   \\__/(_______)   \\_______)  |/     \\|\\_______/\\_______)\\_______)\\_______/(_______)|/    )_)");
  }
  
  public static void hero1 () {
    System.out.println (" O_");
    System.out.println ("<T>`-.");
    System.out.println (" |`-'`");
    System.out.println (" I");
  }
  
  public static void hero2 () { 
    System.out.println("      0/");
    System.out.println("     /7,"); 
    System.out.println("   .'(");
    System.out.println(" '^ / >");
    System.out.println("   / <");
    System.out.println("   `");
  }
  
  public static void wizard2 () { 
    System.out.println("o   o");
    System.out.println("|\\O/|");
    System.out.println(" \\Y/");
    System.out.println(" /_\\");
    System.out.println(" _W_");
  }
  
  public static void vaporise () {   
    System.out.println("   ___ __ ._`.*.'_._ ____ ____");
    System.out.println(" . +  * .o   o.* `.`. +.    .");
    System.out.println("*  . ' ' |\\^/|  `. * .  * `");
    System.out.println("          \\V/ . +");
    System.out.println("          /_\\  .`.");
    System.out.println("======== _/ \\_ =====::.*");
  }
  
  public static void parasail () {   
    System.out.println("  __==~^~~==");
    System.out.println("_==~        ~~@@==_");
    System.out.println("===  |   | , /  @@@@");
    System.out.println("\\ \\  |   |' /  / @@@@");
    System.out.println(" \\ \\ |   | /  /  /  /");
    System.out.println("  ` \\|   |/  /  / ,'");
    System.out.println("  \\  |   |  / ,','");
    System.out.println("   \\ |   | /,' ,'");
    System.out.println("    \\`   ;/' ,'");
    System.out.println("     \\`  / ,'");
    System.out.println("      |o| '");
    System.out.println("      _@'");
    System.out.println("     ||");
    System.out.println("    ''");
  }
  
  public static void skii () {
    System.out.println("                  ._ O");
    System.out.println("   ________________ //\\.");
    System.out.println("                   \\>> |");
    System.out.println("                    \\\\");
  }  
  
  public static void jumpKick () {
    System.out.println("  --");
    System.out.println("o  /");
    System.out.println("/\\/");
    System.out.println(" <");
  }
  
  public static void police () {
    System.out.println("                    ____            ____            ____");
    System.out.println("                   /....\\          /....\\          /....\\");
    System.out.println("           .-.    |::::::|    .-. |::::::|    .-. |::::::|");
    System.out.println("           | |    |::::::|    | | |::::::|    | | |::::::|");
    System.out.println("           | |    (`:'':')    | | (`:'':')    | | (`:'':')");
    System.out.println("           | |   _--|__|--__  | |.--|__|--__  | |_--|__|--__");
    System.out.println("           | |  |   ________|_|_|_  ________|_|_|_  ________|_____");
    System.out.println("           | | /    |            |  |            |  |            |");
    System.out.println("           | |/  /  |            |  |            |  |            |");
    System.out.println("           |_| |/|  |            |  |            |  |            |");
    System.out.println("          (===)| |  |  S W A T   |  |  S W A T   |  |  S W A T   |");
    System.out.println("          `==='  |`-|            |`-|            |`-|            |");
    System.out.println("           | |   |`-|            |`-|            |`-|            |");
    System.out.println("           |_|   |  |            |  |            |  |            |");
    System.out.println("                 |  |            |  |            |  |            |");
    System.out.println("                 |  |            |  |            |  |            |");
    System.out.println("                 |`-|            |`-|            |`-|            |");
    System.out.println("                 |__|            |__|            |__|            |");
    System.out.println("                 /_ |            |_ |            |_ |            |");
    System.out.println("                |___`-__________-'__`-__________-'__`-__________-'");
  }
  
  public static void breakingNews () {
    System.out.println("      ##########################################################    ");
    System.out.println("    #++++#::::::::::::::::::::::::::::::::::::::::::::::::#+++++#   ");
    System.out.println("   #++++#                                                  #+++++#  ");
    System.out.println("   #+++#   ...   ...   ....  ..    .. ., ,. ,..  .    ,,`   #++++#  ");
    System.out.println("   #+++#   IIII, IIII. IIII  III   I, II II III  I. ,IIII   #++++#  ");
    System.out.println("   #+++#   I, ;I I  II II    I I,  I,II  II IIII I. I;      #++++#  ");
    System.out.println("   #+++#   IIII  IIII` IIII I   I  III`  II IIII I. II;II`  #++++#  ");
    System.out.println("   #+++#   I, II IIII  II`` II II  IIII  II II III. I;;II`  #++++#  ");
    System.out.println("   #+++#   I, II II I. II ` IIIII, II`I, II II III. II  I`  #++++#  ");
    System.out.println("   #+++#   IIII  II II IIII II  II II II II II  II. `III;`  #++++#  ");
    System.out.println("   #+++#                                                    #++++#  ");
    System.out.println("   #+++#   IIII`   ;II  IIIIII; III   `II;   ;II  ,IIIII;   #++++#  ");
    System.out.println("   #+++#   IIII;   III  IIIIIII .II`  IIII   III `;IIIII;   #++++#  ");
    System.out.println("   #+++#   IIIII.  ;II  III      III  ;III   II, ;II`       #++++#  ");
    System.out.println("   #+++#   IIIII; `;II  III`     II;  IIII` ,II  ;III       #++++#  ");
    System.out.println("   #+++#   IIII;I. ;II  IIIIIII  III  ;IIII ;II  `III;,     #++++#  ");
    System.out.println("   #+++#   II; III ;II  IIIIIII  .II ,I;.I; II;   ,;IIII`   #++++#  ");
    System.out.println("   #+++#   II; III,III  IIIIIII   II,III II II,     ;IIII   #++++#  ");
    System.out.println("   #+++#   II;  I;IIII  III       II;;I` II II        ;II   #++++#  ");
    System.out.println("   #+++#   II;  ,IIIII  III       ;IIII  ;IIII  `I,   ;II   #++++#  ");
    System.out.println("   #+++#   II;   IIIII  IIIIIII   .IIII  IIII;   ;IIIIIII   #++++#  ");
    System.out.println("   #+++#   II;   ,IIII  IIIIIII    ;II;   III,   ;IIIIII    #++++#  ");
    System.out.println("   #++++#                                                   #++++#  ");
    System.out.println("    #++++#::::::::::::::::::::::::::::::::::::::::::::::::#+++++#   ");
    System.out.println("     ###########################################################    ");
  }
  
  public static void knockOut () {
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????");
    System.out.println("???????????????????????????????????????????????????"); 
  }
  
  public static void mazeStart () {
    printArt("\\                   /");
    printArt(" \\                 /");
    printArt("  \\               /");
    printArt("  |              /");   
    printArt("  |__            |");  
    printArt("  | |\\         __|");   
    printArt("  | | \\      /|  |");      
    printArt("  | |  \\    / |  |");   
    printArt("  | |   \\__|  |  |");  
    printArt("  | |   |__|  |  |");   
    printArt("  | |   /  |  |  |");   
    printArt("  | |  /    \\ |  |"); 
    printArt("  | | /      \\|  |");  
    printArt("  |_|/        |__|");   
    printArt("  |              |");  
    printArt("  |              |"); 
    printArt("  /              \\");   
    printArt(" /                \\");
    printArt("/                  \\");
  }
  
  public static void mazeExit () {
    System.out.println("88888888888888888888888888888888888888888888888888888888888888888888888");
    System.out.println("88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88");
    System.out.println("88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88");
    System.out.println("88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88");
    System.out.println("88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88");
    System.out.println("88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88");
    System.out.println("88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88");
    System.out.println("88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88");
    System.out.println("88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88");
    System.out.println("88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88");
    System.out.println("88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88");
    System.out.println("88      |    _!.-j'  | _!,\"|_|M<>MMMMoMMM|_||!._|  `i-!.._ |      |  88");
    System.out.println("88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88");
    System.out.println("88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88");
    System.out.println("88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88");
    System.out.println("88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88");
    System.out.println("88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88");
    System.out.println("88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88");
    System.out.println("88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._    |  88");
    System.out.println("88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88");
    System.out.println("88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88");
    System.out.println("88888888888888888888888888888888888888888888888888888888888888888888888");
  }
  
  public static void drawMaze(char a, char b, char c, char d, char e, char f, char g, char h, char i, char j, char k, char l, 
                              char m, char n, char o , char p, char q, char r, char s, char t, char u, char x1, char x2, char x3) 
  {
    System.out.println(":--:--:--:--:--:--:--:--:--:--:--:--:--:--:--:  ");
    System.out.println("|              |O           "+r+"         "+s+"      |  ");
    System.out.println(":  :--:--:--:  :--:--:--:--:  :--:--:  :--:  :  ");
    System.out.println("|"+d+"          |            "+u+"    |O       |O    |  ");
    System.out.println(":  :--:--:  :--:--:--:--:  :--:--:--:--:--:--:  ");
    System.out.println("|  |     |  |   "+t+"       |  |                 |  ");
    System.out.println(":  :  :  :  :  :  :--:  :  :  :--:--:--:--:  :  ");
    System.out.println("|  |  |"+x2+" |  |  |O |O    |  |  |O |O  "+q+"    |  |  ");
    System.out.println(":  :  :--:  :  :--:--:--:  :  :  :--:  :  :  :  ");
    System.out.println("|  |     |  |              |"+c+"  "+p+"       |O |  |  ");
    System.out.println(":  :--:  :  :--:--:--:--:--:  :--:--:--:--:  :  ");
    System.out.println("|     |  |                    |            "+b+" |  ");
    System.out.println(":--:  :  :--:--:--:--:--:--:--:  :--:--:--:  :  ");
    System.out.println("|O |  |    "+h+"               |     |     |O |  |  ");
    System.out.println(":  :  :--:  :--:--:--:--:  :  :--:  :  :  :  :  ");
    System.out.println("|  |  |     |O    |O    |  |  |     |     |  |  ");
    System.out.println(":  :  :  :--:--:  :--:  :  :  :  :--:--:--:  :  ");
    System.out.println("|   "+e+" |  |      "+j+"     "+k+" |  |  | "+m+"            |  ");
    System.out.println(":--:  :  :  :--:--:--:  :  :  :  :--:--:--:--:  ");
    System.out.println("|O |  |  |  |O |"+x1+"    |  |  |  |  |           |  ");
    System.out.println(":  :  :  :  :  :--:  :  :  :  :  :  :--:--:  :  ");
    System.out.println("|  |  |  |  | "+l+"      |  |  |  |  |  |     |  |  ");
    System.out.println(":  :  :  :  :  :--:--:  :  :  :  :  :  :  :  :  ");
    System.out.println("|  |  |  |  |           |  |  |  |  |"+x3+" |  |  |  ");
    System.out.println(":  :  :  :  :--:--:--:--:  :  :  :  :--:  :  :  ");
    System.out.println("|"+f+"    |  | "+i+"               |  |  |      "+o+" |  |  ");
    System.out.println(":  :--:  :  :--:--:--:--:--:  :  :--:--:  :  :  ");
    System.out.println("|  |O  "+g+" |  |O       |        |     |O    |  |  ");
    System.out.println(":  :--:  :  :--:--:  :  :--:--:--:  :--:--:  :  ");
    System.out.println("|        |           |"+a+" |O        "+n+"          |  ");
    System.out.println(":--:--:--:--:--:--:--:  :--:--:--:--:--:--:--:");   
  }
  
  public static void burningCabin () {
    System.out.println("                                   /\\");
    System.out.println("                              /\\  //\\\\");
    System.out.println("                       /\\    //\\\\///\\\\\\        /\\");
    System.out.println("                      //\\\\  ///\\////\\\\\\\\  /\\  //\\\\");
    System.out.println("         /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\");
    System.out.println("        / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\");
    System.out.println("       /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\        /\\");
    System.out.println("      /  ^ ^ \\/^  ^\\ ^  )^   ^  ^   ^ (  ____  ^   ^ \\      /||\\");
    System.out.println("     / ^ ^  ^ \\ ^(  \\__(_______)_______)_|  |___)_^ ^ \\    /||||\\");
    System.out.println("    / ^^  ^ ^ ^\\  )/_(_____(_________)_________(__\\ ^^ \\  /||||||\\");
    System.out.println("   /  ^  ^^ ^ ^   /___)___________(________________\\  ^  /||||||||\\");
    System.out.println("  /^ ^  ^ ^^  ^    ||__|__|||||||||||||__|__|||||||     /||||||||||\\  "); 
    System.out.println(" / ^   ^   ^    ^  ||__|__|||||||||||||__|__|||||||         |  |  ");
    System.out.println("/ ^ ^ ^  ^  ^  ^   ||||||||||||||||||||||||||||||||ooooooooo|  |oooooo");
    System.out.println("ooooooooooooooooooo@@@@ooooooooooooooooooooooooooooooooooooooooooooooo");
  }
  
  public static void cabin () {
    System.out.println("                                   /\\");
    System.out.println("                              /\\  //\\\\");
    System.out.println("                       /\\    //\\\\///\\\\\\        /\\");
    System.out.println("                      //\\\\  ///\\////\\\\\\\\  /\\  //\\\\");
    System.out.println("         /\\          /  ^ \\/^ ^/^  ^  ^ \\/^ \\/  ^ \\");
    System.out.println("        / ^\\    /\\  / ^   /  ^/ ^ ^ ^   ^\\ ^/  ^^  \\");
    System.out.println("       /^   \\  / ^\\/ ^ ^   ^ / ^  ^    ^  \\/ ^   ^  \\        /\\");
    System.out.println("      /  ^ ^ \\/^  ^\\ ^   ^   ^  ^   ^    ____  ^   ^ \\      /||\\");
    System.out.println("     / ^ ^  ^ \\ ^  _\\____________________|  |_____^ ^ \\    /||||\\");
    System.out.println("    / ^^  ^ ^ ^\\  /_______________________________\\ ^^ \\  /||||||\\");
    System.out.println("   /  ^  ^^ ^ ^   /________________________________\\  ^  /||||||||\\");
    System.out.println("  /^ ^  ^ ^^  ^    ||__|__|||||||||||||__|__|||||||     /||||||||||\\  "); 
    System.out.println(" / ^   ^   ^    ^  ||__|__|||||||||||||__|__|||||||         |  |  ");
    System.out.println("/ ^ ^ ^  ^  ^  ^   ||||||||||||||||||||||||||||||||ooooooooo|  |oooooo");
    System.out.println("ooooooooooooooooooo@@@@ooooooooooooooooooooooooooooooooooooooooooooooo");
  }
  
  public static void volcano1 () {
    System.out.println("                     ooO");
    System.out.println("                     ooOOOo");
    System.out.println("                   oOOOOOOoooo");
    System.out.println("                 ooOOOooo  oooo");
    System.out.println("                /vvv\\");
    System.out.println("               /V V^V\\ ");
    System.out.println("              /V^ V ^V\\   ");       
    System.out.println("            /           \\                   AAAAH! RUN FOR YOUR LIVES!");
    System.out.println("           /   ^^  ^  ^  \\                       /");
    System.out.println("          / ^^      ^     \\         o           o");
    System.out.println("__      /       ^    ^ ^    \\     -/-   o     -/-");
    System.out.println("/\\     /      ^    ^^   ^    \\    /\\  -/-     /\\");
    System.out.println("                                      /\\");
  }
  
  public static void volcano2 () {
    System.out.println("              (   (( . : (    .)   ) :  )");            
    System.out.println("                (   ( :  .  :    :  )  ))");                              
    System.out.println("                 ( ( ( (  .  :  . . ) )");                           
    System.out.println("                  ( ( : :  :  )   )  )");                              
    System.out.println("                   ( :(   .   .  ) .'");                              
    System.out.println("                    '. :(   :    )");                               
    System.out.println("                      (   :  . )  )");                                    
    System.out.println("                       ')   :   #@##");                                   
    System.out.println("                      #',### \" #@  #@");     
    System.out.println("                     #/ @'#~@#~/\\   #");  
    System.out.println("                   ##  @@# @##@  `..@,");                               
    System.out.println("                 @#/  #@#   _##     `\\");                              
    System.out.println("               @##;  `#~._.' ##@      \\_");                              
    System.out.println("             .-#/           @#@#@--,_,--\\");                            
    System.out.println("            / `@#@..,     .~###'         `~.");                           
    System.out.println("          _/         `-.-' #@####@          \\");                        
    System.out.println("       __/     &^^       ^#^##~##&&&   %     \\_");                       
    System.out.println("      /       && ^^      @#^##@#%%#@&&&&  ^    \\");                     
    System.out.println("    ~/         &&&    ^^^   ^^   &&&  %%% ^^^   `~._");                   
    System.out.println(" .-'   ^^    %%%. &&   ___^     &&   && &&   ^^     \\");        
    System.out.println("/    ^^^ ___&&& X & && |n|   ^ ___ %____&& . ^^^^^   `~.");             
    System.out.println("         |M|       ---- .  ___.|n| /\\___\\  X");            
    System.out.println("                   |mm| X  |n|X    ||___|");
  }
  
  public static void mountainRange() {
    System.out.println("    .                  .-.    .            _   .");
    System.out.println("                      /   \\              _/ \\");
    System.out.println("        _    .   .--'\\/\\_ \\            /    \\        ___");
    System.out.println("        / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ ");
    System.out.println("       /    \\  /    .'   _/  /  \\   ' /    \\/  \\/ .`'\\_/\\  ");
    System.out.println("  .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _");
    System.out.println("     /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\");
    System.out.println("   /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_/   \\ /    `._/  ^  \\");
    System.out.println("  /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.");
    System.out.println("@/        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\%");
    System.out.println("@&8jgs@@%% @)&@&(88&@.-_=_-=_-=_-=_-=_.8@% &@&&8(8%@%8)(8@%8 8%@)%");
  }
  
  public static void mountainFinal () {
    System.out.println ("        ^   //\\_");
    System.out.println ("        ^  //  \\");
    System.out.println ("        |_//    \\");
    System.out.println ("        //    ^  \\_");
    System.out.println ("      _//     ^    \\ \",");
    System.out.println ("    _//  ^    | ^   \\_.,");
    System.out.println ("   //    ^      ^     \\_ :\"");
    System.out.println ("  //     |      |       \\_'");
    System.out.println ("_//         ^             \\ q\\~o");
    System.out.println ("           ^ ^            \\ //!");
    System.out.println ("           | ^       ^     \\ b");
    System.out.println ("             |       ^      \\");
    System.out.println ("                     |       \\<>");
    System.out.println ("                              \\<m=^=^=^==^==^=^");
  }
  
  public static void forest () {
    System.out.println("  ^  ^  ^   ^        ^  ^   ^  ^  ^   ^  ^   ^  ^  ^   ^        ^  ^   ^  ^  ^   ^  ^");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println("  |  |  |   |        |  |   |  |  |   |  |   |  |  |   |        |  |   |  |  |   |  |");
    System.out.println("       ^  ^  ^   ^   ^  ^   ^  ^  ^   ^  ^   ^  ^  ^   ^  ^   ^   ^  ^  ^   ^  ^");
    System.out.println("      /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println("      /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println("      /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println("       |  |  |   |   |  |   |  |  |   |  |   |  |  |   |   |  |   |  |  |   |  |");
    System.out.println("  ^  ^  ^   ^        ^  ^   ^  ^  ^   ^  ^   ^  ^  ^   ^        ^  ^   ^  ^  ^   ^  ^");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println(" /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\ /|\\/|\\/|\\ /|\\      /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    System.out.println("  |  |  |   |        |  |   |  |  |   |  |   |  |  |   |        |  |   |  |  |   |  |");
  }
  
  public static void wizard () {
    System.out.println("              _,._ ");
    System.out.println("  .||,       /_ _\\\\ ");    
    System.out.println(" \\.`',/      |'L'| | ");   
    System.out.println(" = ,. =      | -,| L  ");  
    System.out.println(" / || \\    ,-'\\\"/,'`.  "); 
    System.out.println("   ||     ,'   `,,. `.  ");
    System.out.println("   ,|____,' , ,;' \\| |  ");
    System.out.println("  (3|\\    _/|/'   _| |  ");
    System.out.println("   ||/,-''  | >-'' _,\\\\ ");
    System.out.println("   ||'      ==\\ ,-'  ,' ");
    System.out.println("   ||       |  V \\ ,|   ");
    System.out.println("   ||       |    |` |   ");
    System.out.println("   ||       |    |   \\  ");
    System.out.println("   ||       |    \\    \\ ");
    System.out.println("   ||       |     |    \\");
    System.out.println("   ||       |      \\_,-'");
    System.out.println("   ||       |___,,--\")_\\");
    System.out.println("   ||         |_|   ccc/");
    System.out.println("   ||        ccc/       ");
    System.out.println("   ||    "); 
  }
  
  public static void cat () {
    System.out.println("                               __");
    System.out.println("                         _,-;''';`'-,.");
    System.out.println("                      _/',  `;  `;    `\\");
    System.out.println("      ,        _..,-''    '   `  `      `\\");
    System.out.println("     | ;._.,,-' .| |,_        ,,          `\\");
    System.out.println("     | `;'      ;' ;, `,   ; |    '  '  .   \\");
    System.out.println("     `; __`  ,'__  ` ,  ` ;  |      ;        \\");
    System.out.println("     ; (6_);  (6_) ; |   ,    \\        '      |       /");
    System.out.println("    ;;   _,' ,.    ` `,   '    `-._           |   __//_________");
    System.out.println("     ,;.=..`_..=.,' -'          ,''        _,--''------''''");
    System.out.println("_pb__\\,`\"=,,,==\"',___,,,-----'''----'_'_'_''-;''");
    System.out.println("-----------------------''''''\\ \\'''''   )   /'");
    System.out.println("                              `\\`,,,___/__/'_____,");
    System.out.println("                                `--,,,--,-,'''\\");
    System.out.println("                               __,,-' /'       `");
    System.out.println("                             /'_,,--''");
    System.out.println("                            | (");
    System.out.println("                             `'");
  }  
  
  public static void wolf () {
    System.out.println("                 /\\__/\\ ");
    System.out.println("                /      \\ ");     
    System.out.println("               |  o‘ ’o | ");  
    System.out.println("     __________| \\     /|  ");  
    System.out.println("   /              \\ T / |   ");  
    System.out.println(" /                      |");
    System.out.println("|  ||     |    |       /  ");  
    System.out.println("|  ||    /______\\     / |");
    System.out.println("|  | \\  |  /     \\   /  |");
    System.out.println(" \\/   | |\\ \\      | | \\ \\");
    System.out.println("      | | \\ \\     | |  \\ \\");
    System.out.println("      | |  \\ \\    | |   \\ \\");
    System.out.println("      ‘'’   ‘'’   ‘'’    ‘'’");
  }
  
  public static void bear () {
    System.out.println("    :\"'._..---.._.'\";");
    System.out.println("     `.             .'");
    System.out.println("     .'     \\ /    `.");
    System.out.println("    :      a   a      :                 __....._");
    System.out.println("    :     _.-0-._     :---'\"\"'\"-....--'\"        '.");
    System.out.println("     :  .'   :   `.  :                          `,`.");
    System.out.println("      `.: '--'--' :.'                             ; ;");
    System.out.println("       : `._`-'_.'                                ;.'");
    System.out.println("       `.   '\"'                                   ;");
    System.out.println("        `.               '                        ;");
    System.out.println("         `.     `        :           `            ;");
    System.out.println("          .`.    ;       ;           :           ;");
    System.out.println("        .'    `-.'      ;            :          ;`.");
    System.out.println("    __.'      .'      .'              :        ;   `.");
    System.out.println("  .'      __.'      .'`--..__      _._.'      ;      ;");
    System.out.println("  `......'        .'         `'\"\"'`.'        ;......-'");
    System.out.println("  jgs    `.......-'                 `........'");  
  } 
}