/**
 * File: HeroesMission.java
 * Author: Adeit Dalal
 * Date: Apr. 20, 2018
 * Description: This program is an interective and 
 * exciting text-based RPG for young children of the
 * ages 4-12 in order to assist a study into how video 
 * games can have a positive impact on children.
 * 
 * CHANGES FROM CRITERIA B:
 * Largest to Smallest:
 * 
 * *MAJOR*: In order to make the game non-linear and have more branches, the entire game structure was slightly 
 * altered so that user's choices can lead to different outputs and new locations, instead of linearly having 
 * the same eventual outcome (specifcation 8 - user input can affect game output).
 * 
 * Several extra features and normal features were added to the gameplay (included some additional tasks) to 
 * meet operator requirements, change up the gameplay, make the game more enticing, more efficient, and 
 * generally improve the game significantly (specifications 3, 4, 6, 9, 10, 11) from the originally planned 
 * idea made in Criteria B.
 * 
 * A significantly larger number of methods were added to different tasks so that the code 
 * is much more organized and simpler to understand (specification 11 - easily modifiable). 
 * 
 * To replace simple if/else statement, the ? operator was use several times to make the code more efficient and 
 * reduce delay in gameplay (specification 9).
 * 
 * A much larger amount of ASCII Art was used to make the game more appealing to the target audience (specification 4).
 *
 * That's all! Enjoy the game - comments explaining how code works are added below the respective code. 
 */

import java.util.*;
import java.text.*;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//Imports all of the necessary non-local java libraries used throughout the program. 

public class HerosMission 
{
  public static void main (String args[]) {
    Date now = new Date (); 
    new HerosMission (now);
  }
  
  public HerosMission (Date now) {
    char playAgain = 'y';
    
    while (playAgain == 'y') {
      int cont = 2;
      char pw;
      int score = 0;
      int scorEarn = 0;
      int sceneCheck;
      boolean normal = true;
      
      DateFormat df = DateFormat.getDateInstance ();
      String s = df.format (now);
      //Gets the current date and time;
      intro(s);
      
      playFile ("Playlist Adventure-Uplifting [Monstercat, NCS]");
      
      try {
        Thread.sleep(1000); }
      catch (Exception m) { ; }
      //Sets the program to sleep for a second, so that the title will start printing exactly when the music starts playing.
      
      HMAscii.title();
      //Calls a static void method from another file containing the RPG's Ascii Art.
      
      gameSleep();
      
      printSlow ("\n\nWelcome, Hero! What is your name?");
      String name =  IBIO.inputString(">> ");
      if (name.charAt(0) > 90)
        name = (char) (name.charAt(0)-32) + name.substring(1);
      //Prompts the user for their name. If the first letter in their name is
      //lowercase, changes the first letter to uppercase. 
      
      printSlow ("\nHello " + name + "!\n\nDo you have a password to skip to a specific scene? (y/n)");
      do {
        pw = Character.toLowerCase(IBIO.inputChar (">> "));
      }
      while (Character.toLowerCase(pw) != 'n' && Character.toLowerCase(pw) != 'y');
      //Prompts the user for a password, loops until a valid response is inputted.
      
      sceneCheck = sceneSkip (pw);
      if (sceneCheck != 0) {
        normal = false;
        printSlow ("You have successfully skipped to Part " + sceneCheck + "!"); 
        if (sceneCheck == 2)
          score = scene2a(name, scorEarn);
        else if (sceneCheck == 3)
          score = scene2b(name, scorEarn, false);
        else if (sceneCheck == 4)
          score = scene2c(name, scorEarn, false);
        else if (sceneCheck == 5)
          score = scene3(name, scorEarn);
        else if (sceneCheck == 6)
          score = scene4(name, scorEarn);
        else if (sceneCheck == 7)
          score = scene5(name, scorEarn);
        else if (sceneCheck == 8)
          scene6(name);
        else if (sceneCheck == 9)
          finalScene (name);
        else
          score = scene1(name, scorEarn);
        //Checks which scene to skip to if the user has a valid password, then skips directly to that scene.
        
      }        
      if (normal == true) {
        do {
          cont = rules();
          gameSleep();
        }
        while (cont == 1);
        //Re-prints the rules over and over until the user selects 'Yes" to continuing the game if the 
        //user does not have a password.
        score = scene1(name, scorEarn);
      }
      
      conclusion (s);
      
      printSlow ("\n\n\n\n\n\n\n\n\n\n\n\nCongratulations! You have successfully stopped the mad scientist "
                   + "from erupting every single volcano on earth!\nYour final score was " + score
                   + ".\n\nWould you like to play again? (y/n)");
      do {
        playAgain = Character.toLowerCase(IBIO.inputChar (">> "));
      }
      while (playAgain != 'n' && playAgain != 'y');
      //Prompts the user to see if they wish to play again. Loops until a valid response is inputted.
    }
    printSlow ("\n\nThank you for playing A Heros' Mission!");
  }
  
  //Instruction Methods Begin  
  public int rules () {    
    printFast ("\nInstructions:\n\t1. Play as Stick Hero, an aspiring hero, and journey all over to discover who is behind the volcanic eruptions - and stop them!");
    printFast ("\t2. At times, you will be presented with different kinds of choices. Choose wisely - you’ll be changing the outcome of the game!");
    printFast ("\t3. If you reach the end of the line, don’t worry - you’ll be able to go back to your most recent choice!");
    printFast ("\t4. At every early stage, you’ll be given a password. If you’d ever like to redo a choice or play the game later,"
                 + "\n\t   simply input the password to automatically jump back to that stage!\n");
    gameSleep();
    //Instructions for the entire game.
    
    int cont1;
    cont1 = JOptionPane.showConfirmDialog (null, "Continue and become a hero? (y\n)", "Continue?", JOptionPane.YES_NO_OPTION);
    //Asks a yes/no question as a dialogue box.
    return cont1;
  }
  
  public void mazeInstructions () {
    int cont2;
    do {
      printFast ("Instructions:\nYou are stuck inside of a maze! You'll need to move around and keep noting your "
                   + "position! Here are a few tips to help you get out:\n\t1. You need to get to an 'X' to exit the maze. There are "
                   + "a total of three different exits - make it to one to escape!\n\t2. The 'H' is your icon and current position.");
      printFast ("\t3. Every turn, you will be asked for a direction to move in. Be sure to only input directions that are"
                   + " directions you can move in (don't walk into walls!\n\t4. Watch out for pitfalls! They're marked as "
                   + "'O' on the map. You can't walk towards them!");
      cont2 = JOptionPane.showConfirmDialog (null, "Do you want to re-read the rules? (y/n)", "Continue?", JOptionPane.YES_NO_OPTION);
    } //Instructions for the task, then asks user if they'd like to read the instruction again or not in a yes/or dialogue box.
    while (cont2 == 0);
    //Re-Prints the instructions if the user inputs no.
  } 
  
  public void nimRules () { 
    int cont2;
    do {
      printFast ("Rules:\nThere are 15 stones in the pile.\nEach person will take turns taking stones."
                   + "\nOn each turn, you can only take one or two stones.\nThe person who takes the last stone loses."
                   + "\nIf you win, the number of stones you had taken will be added to your score!");
      cont2 = JOptionPane.showConfirmDialog (null, "Do you wish to move on? (y\n)", "Continue?", JOptionPane.YES_NO_OPTION);
      gameSleep();
    }  //Instructions for the task, then asks user if they'd like to read the instruction again or not in a yes/no dialogue box.
    while (cont2 == 1);
    //Re-Prints the instructions if the user inputs no.
  }
  
  public void arenaBattleInstructions () {
    int cont2;
    do {
      printFast ("You will be fighting the wolf in a turn by turn basis!\nOn each turn, you can either attack, use a potion, or run away!"
                   + "\nYou only have 5 potions, use them wisely!\nFinally, you can only run away when under 10 health! The first opponent"
                   + " that gets their enemy to 0 health points wins! Good luck!");
      cont2 = JOptionPane.showConfirmDialog (null, "Do you wish to move on? (y\n)", "Continue?", JOptionPane.YES_NO_OPTION);
      gameSleep();
    }
    while (cont2 == 1);
    //Runs and displays instructions over and over until the user wants to move on and play the actual task.
  }
  //Instruction Methods END
  
  //Scene Methods Begin - ALL TEXT DISPLAYED IS MOSTLY STORYLINE AND DOES NOT REQUIRE EXPLANATION
  //ASCII ART CALLS FROM THE HMASCII FILE IS NOT EXPLAINED, AS THEY ARE ALL THE EXACT SAME WITH DIFFERENT METHODS CALLED
  public void intro (String s) {
    printSlow("Late One Night...\n\n???: MUAHAHA! My invention is ready to be used! Time for my ultimate revenge to "
                + "finally be unleashed… MUAHHAHAHAHAH!!!!!!\n\n~~2 Weeks Later~~\n");
    
    HMAscii.breakingNews();
    playFile("Breaking News - Sound Effect");
    //Runs a method to play a sound file/effect. 
    printSlow (s + "\nB R E A K I N G   N E W S!\n\nReporter: Yet another inactive volcano has randomly erupted!\n\n"
                 + "One of our bravest photographers managed to capture a picture of the eruption. Here's a look!\n");
    HMAscii.volcano1();
    gameSleep();
    printSlow("\nReporter: This marks the 34th eruption in the past 2 weeks worldwide…\n\nWith scientists completely baffled about "
                + "how these random eruptions are happening, the world is in need of a hero! \n\n");
    playFile("Breaking News - Sound Effect");
    
    printSlow ("But who… ?\n\n\n\n\n\n\nThe world is in desperate need of a hero... and they have one....... YOU!\n\n\n\n\n\n\n\n\n\n");
    gameSleep();
  }
  
  public void conclusion (String s) {
    printSlow ("3 Hours Later...");
    HMAscii.breakingNews();
    gameSleep();
    printSlow (s + "\nB R E A K I N G   N E W S!\n\nReporter: The scandal by Dr. Topiwala has been exposed! The world has received the "
                 + "hero we need to keep us safe! If not for Stick Hero, all would have been lost! Whoever you are, thank you Stick Hero!\n\nTHE END!");
  }
  
  public int scene1 (String name, int earned) {
    printSlow ("Level Password: apple");
    gameSleep();
    
    HMAscii.hero1();
    printSlow ("It was normal day for you, " + name + ", at school! Quite boring, actually. So, right after school, you, "
                 + "as Stick Hero, decided to continue looking into the series of volcano eruptions!\n\n\n\nAfter tracking "
                 + "down some of the bad guys, Stick Hero had almost figured out who the evil mastermind was! "
                 + "But, right before the henchman gave Stick Hero a response, someone knocked Stick Hero out!");
    HMAscii.knockOut();
    gameSleep();
    int locationTwo = maze();
    switch (locationTwo) {
      case 1:
        earned = scene2a(name, earned);
        break;
      case 2:
        earned = scene2b(name, earned, false);
        break;
      case 3:
        earned = scene2c(name, earned, false);
        break;
    }
    //Checks with a switch statement which exit the user exited at, then runs the second scene.
    return earned;
  }
  
  public int scene2a (String name, int earned) {
    char result;
    printSlow ("Level Password: grape\n\n");
    gameSleep();
    //Password for this level is given
    
    printSlow ("~The Mysterious Forest~");
    HMAscii.forest();
    printSlow ("\n\nStick Hero: Whoaaaa!!! This place is creepy! I should be careful, there could be enemies anywhere!\n\n\n");
    
    HMAscii.cat();
    gameSleep();
    
    result = yesNo("While exploring, you found a high and thin tree with a cat stuck on it! Do you save the terrified cat?");
    if (result == 'y' || result == 'Y') { 
      printFast ("\n\nCat: Thank you for rescuing me! In return, if you answer three math questions of mine, I shall give "
                   + "you a hint as to where you must go next on your journey! I will give you two math equations! To get my help, "
                   + "you will need to answer both questions! You will get 3 counted tries and can earn 9 points. If you"
                   + " get a wrong answer, you will lose 3 points! After 3 tries, no point will be given!\n\nStick Hero: Sure! Let's get started!");
      gameSleep();
      IBIO.inputChar ("Input anything to continue! ");
      //Displays the result if the user chooses to save the cat.
      
      earned += mathQ1();
      earned += mathQ3();
      earned += mathQ5();
      //Adds the points earned from all three math tasks to total earned points. 
      
      printSlow ("Cat: Well done! Since you've completed my task so easily, here's a hint for your journey: If you don't go to"
                   + " the Mountain Range next, you will die!\nStick Hero: That was straight forward! Thank you!");
      earned += scene2c (name, earned, true);
      //Runs part two of the hint-giving tasks
    }
    else {
      printSlow ("While walking past the tree, the cat suddenly grew angry and jumped down! Luckily, cats have 9 lives."
                   + " Unfortunately, you do not! RIP " + name + "\n\nCAT - 1 STICK HERO - 0.");
      //Displays the result if the user chooses not to save the cat.
      Object [] options = {"Okay"};
      JOptionPane.showOptionDialog (null, "Move back a choice?", "Continue", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
      earned += scene2a(name, earned);
      //Restarts the scene w/ a dialogue box
    }
    return earned;
    //Returns all received points from every task called within other scenes (scene 2 (twice), 3, 4, 5)
  }
  
  public int scene2b (String name, int earned, boolean round2) {
    char result;
    printSlow ("Level Password: orange\n\n");
    gameSleep();
    //Password for this level is given
    
    printSlow ("~The Burning Cabin~\n\n");
    HMAscii.forest();
    printSlow ("\n\nStick Hero: Whoaaaa!!! This place is amazing! I should be careful though, there could be enemies anywhere!\n");
    gameSleep();
    
    HMAscii.burningCabin();
    printSlow ("Stick Hero: Whoa!!! That cabin is on fire! I should use some of the water from the lake I saw to try and put it out!\n");
    result = yesNo("Will the water put out the fire?");
    if (result == 'y' || result == 'Y') {
      HMAscii.cabin();
      printSlow ("With the fire on the cabin put out, the elderly couple came out to thank you!\n\nOld Man: Thank you for"
                   + " saving our house! In return for saving us, we will aid you on your journey - if you can answer our questions!");
      printSlow ("\nWe will give you three math equations. To get our help, you will need to answer three questions!"
                   + " You will get 3 counted tries and can earn 9 points! If you get a wrong answer, you will lose 3 points! After "
                   + "3 tries, no point will be given!\n\nStick Hero: Well, what are we waiting for? I've got the world to save!\n");
      //Displays one potential result from the y/n question, if the user chose that choice.
      gameSleep();
      
      earned += mathQ2();
      earned += mathQ4();
      earned += mathQ6();
      //Adds the points earned from all three math tasks to total earned points. 
      
      printSlow ("Old Man: Congratulations! Well done on beating the challenge " + name + ". As your reward, I will tell you this: "
                   + "You should challenge the one that likes to hunt in teams!\n\nStick Hero: Thank you!");
      
      if (!round2) {
        printSlow ("Oh look! There's another Mountain Range there! I should go check it out!");
        earned += scene2c(name, earned, true); }
      else
        earned += scene3(name, earned);
      //If the second round of Hint-Giving-Taks has been completed, runs scene 3. If it is the first hint-giving task, runs the next task.
    }      
    else {    
      printSlow ("Oh no! The cabin burned down, and because you didn't save their home, the elderly couple chased "
                   + "you all the way until the path split! At the split, there was a wizard!\n\n");
      HMAscii.wizard();
      printFast ("Stick Hero: Who are you?!\n\nWizard: I am here to stop you from discovering our plans!"
                   + "\n\nStick Hero: AHA! So there is someone behind this! Tell me who they are and I'll spare you!"
                   + "\n\nWizard: To defeat ME, I will give you three math questions! In order to pass, you must figure out the answers!"
                   + " You will get 3 counted tries and can earn 9 points! If you get a wrong answer, you will lose 3 points.\nAfter "
                   + "3 tries, no points will be given.\n\nStick Hero: Well, what are we waiting for? I've got the world to save!\n");
      //Displays one potential result from the y/n question, if the user chose that choice.
      
      earned += mathQ1();
      earned += mathQ3();
      earned += mathQ5();
      //Adds the points earned from all three math tasks to total earned points. 
      
      printSlow ("Wizard: Wow! You have defeated my challenge " + name + "! For defeating me, I gift you this: The one you challenge should howl at night!");
      gameSleep();
      
      if (!round2) {
        printSlow ("Oh look! There's a another Mountain Range there! I should go check it out!");
        earned += scene2c(name, earned, true); }
      else
        earned += scene3(name, earned);
      //If the second round of Hint-Giving-Taks has been completed, runs scene 3. If it is the first hint-giving task, runs the next location.
    }
    return earned;
  }
  
  public int scene2c (String name, int earned, boolean round2) {
    char result;
    printSlow ("Level Password: banana\n\n");
    gameSleep();
    //Password for this level is given
    
    printSlow ("~The Mountain Range~\n");
    HMAscii.mountainRange ();
    
    printSlow ("\n\nStick Hero: Whoaaaa!!! This place is amazing! I should be careful though, there could be enemies anywhere!\n"
                 + "Best not go anywhere that could be dangerous\n\nWalking around, you notice a nearby cave.\n\n");
    gameSleep();
    
    HMAscii.volcano2();
    result = yesNo("\n\nSuddenly, one of the mountains began spewing lava! It's a volcano!! Do you run into the cave?");
    if (result == 'y' || result == 'Y') {
      HMAscii.bear();
      printSlow ("\n\nYou run into the cave, and with your supersight, you see an angry bear charging at you!\n\nBut instead of attacking, "
                   + "it begins talking!\n\n\nBear: So, it is you who tries to interfere.\n\nStick Hero: Who are you?!\n\nBear:"
                   + " I am here to stop you from discovering our plans! \n\nStick Hero: AHA! So there is someone behind this!"
                   + " Tell me who they are and I'll spare you!\n\nBear: To defeat ME, I will give you three words! In order to pass,"
                   + " you must figure out what they unscramble to! You will get 3 counted tries and can earn 9 points! If you "
                   + "get a wrong answer, you will lose 3 points.\nAfter 3 tries, no points will be given.\n\nStick Hero: Well, "
                   + "what are we waiting for? I've got the world to save!\n");
      //Displays one potential result from the y/n question, if the user chose that choice.
      
      earned += unscramble("akrd orefst", "dark forest");
      earned += unscramble("alckb aimcg", "black magic");
      earned += unscramble("cnoalvo aalv", "volcano lava");
      //Adds the points earned from all three unscrambling tasks to total earned points. 
      
      printSlow ("Bear: Wow! You have defeated my challenge! For defeating me, I will tell you this: the safest path leads to same things "
                   + "you came here for!\n\n\n\nHaving heard... whatever that was, you set off in search of more people to get help from!"); 
      if (!round2) {
        printSlow ("Stick Hero: Oh look! There's a forest there! I should go check it out!");
        round2 = true;
        earned += scene2b(name, earned, round2); }
      else
        earned += scene3(name, earned);
      //If the second round of Hint-Giving-Taks has been completed, runs scene 3. If it is the first hint-giving task, runs the next location.
      
    }
    else {
      printSlow ("\n\nYour elite running skills and superspeed (mostly superspeed) helped you out-run the lava! As you continued "
                   + "to travel, you meet a travelling merchant who agrees to help you, as long as you answer 3 questions for him! He will give you "
                   + "three words! In order to pass, you must figure out what they unscramble to! You will get 3 counted tries and can earn 9 points! "
                   + "If you get a wrong answer, you will lose 3 points.\nAfter 3 tries, no points will be given.\n\n");
      //Displays one potential result from the y/n question, if the user chose that choice.
      gameSleep();
      
      earned += unscramble("alcvono eeumspr", "volcano supreme"); 
      earned += unscramble ("ploxeniso", "explosion");
      earned += unscramble ("amd icttesnsi", "mad scientist");
      printSlow ("\n\nTraveling Merchant: Well done! Here is my advice: Always go though the route that takes you the longest amount of time"
                   + "for bandits will never prey on travelers on those roads!\n\nStick Hero: Thank you!\n\nStick Hero: Hmm... where should I go next?");
      if (!round2) {
        printSlow ("Oh look! There's a forest there! I should go check it out!");
        round2 = true;
        earned += scene2b(name, earned, round2); }
      else
        earned += scene3(name, earned);
      //If the second round of Hint-Giving-Taks has been completed, runs scene 3. If it is the first hint-giving task, runs the next task.
    }
    return earned; 
    //Returns all points earned from scenes this point onwards (scene 2 (twice), 3, 4 AND 5). 
  }
  
  public int scene3 (String name, int earned) {
    printSlow ("\n\nLevel Password: lemon\n\n");
    gameSleep();
    printSlow ("You continue to journey on, unsure of what to look for next.");
    
    HMAscii.wolf();
    printSlow ("\n\nStick Hero: Look! It is a wolf! Hey... wasn't I supposed to battle something that howls? ");
    printSlow ("\nWolf: So you are the one so close to discovering our plans! No worries - I will be able to destroy you "
                 + "if you cannot answer my two riddles!\n\nStick Hero: Bring it on!");
    
    earned += riddleTask ();
    //Runs the riddle task
    
    printSlow ("Wolf: AHH! You managed to figure out my riddles! Well done. I shall offer to you two paths, one is short and will "
                 + "take you to a lair in the forest, the other is long and hard, and will take you to a volcano!\n\n");
    
    printFast (name + "! Remember what you learned at the Mountain Range!\n");
    
    int choice = IBIO.inputInt ("Do you choose the short path (0) or the hard path (1)? ");
    while (choice != 1 && choice != 0)
      choice = IBIO.inputInt ("Do you choose the short path (0) or the hard path (1)? ");
    //Prompts the user for their choice, loops if invalid input is provided.
    
    if (choice == 0) {
      printFast ("While you were traveling to the forest lair, you were ambushed by bandits! Lose 5 score!");
      earned -= 5;
      scene3(name, earned);
    }
    else
      earned += scene4 (name, earned);
    //Calls the scene4 method if the user chooses the correct path. If not, The user LOSES 5 score and the method restarts.
    
    return earned;
    //Returns all points earned from scenes this point onwards (scene 3, 4 AND 5). 6 is called within 5, but does not have any counted scores.
  }
  
  public int scene4 (String name, int earned) {
    printFast ("Level Password: lime\n\n");
    
    HMAscii.mountainFinal();
    gameSleep();
    
    printSlow ("Stick Hero: Wow! I've made it to the Bad Guy's Evil Lair! There must be guards around...");
    HMAscii.wolf();
    HMAscii.bear();
    HMAscii.wizard2();
    //Prints out Ascii art for all three Guards
    
    printSlow ("Wizard: So, you've made it to our lair! No worries, you will never get past your final challenges!\n\n"
                 + "Wolf: If you want to enter inside, you must defeat the Wizard at his special game, and either me or the bear"
                 + " in arena combat!\n\nStick Hero: We don't have all day! Let's go!!!\n\n\n\nWizard vs." + name + "!\n");
    gameSleep();
    
    earned += nim(name, earned);
    earned += scene5(name, earned);
    //Runs the scene 4 task, then calls scene 5 to run. Adds the outcome of both to points earned.
    
    return earned;
    //Returns all points earned (scene 4 AND 5. 6 is called within 5, but does not have any counted scores.
  }
  
  public int scene5 (String name, int earned) {
    printSlow ("Level Password: corn\n\n");
    gameSleep();
    
    HMAscii.wolf();
    HMAscii.bear();
    printFast ("Stick Hero: Haha! Now that I've beaten one guard, I only need to defeat one more of you to pass!\n\n"
                 + "Wolf: The next one won't be so easy! Choose your opponent! If you challenge the wrong animal, you shall "
                 + "be torn to shreds!\n\nNow's the moment, " + name + "! Using the tips got got back when you had just "
                 + "escaped the maze, figure out which opponent to choose!");
    gameSleep();
    
    String chosen = IBIO.inputString ("Do you choose to fight the bear or the wolf? ");
    char choice = chosen.charAt(0);
    while (choice != 'w' && choice != 'W' && choice != 'B' && choice != 'b') {
      chosen = IBIO.inputString ("Do you choose to fight the bear or the wolf? ");
      choice = chosen.charAt(0);
    }
    if (Character.toLowerCase(choice) == 'w')
    {
      earned++;
      printSlow ("You have chosen correctly and earned one point! Prepare yourself for the battle of your life!!");
      scene6 (name);
    }
    else {
      printSlow ("You chose wrong! The bear and the wolf both attacked at the same time!");
      earned += scene5 (name, earned);
    }
    //If the user chooses the wolf, runs the sixth and final scene. Otherwise, re-runs the scene. 
    
    return earned;
  }
  
  public void scene6 (String name) {
    printSlow ("Level Password: kiwi\n\n");
    gameSleep();
    //Provides the password to reach this level. 
    
    arenaBattleInstructions();
    arenaBattle(name);
    //Calls the tasks' instructions and the actual task. 
    finalScene(name);
  }
  
  public void finalScene (String name) {
    char move, move2, move3;
    printSlow ("\nStick Hero, having no more obstacles left, finally entered the lair! All there was inside was a single man " 
                 + "who was working on a potion!\n\nScientist: Hehe... this new and reformed potion will trigger a chain reaction! "
                 + "All of the world's volcanos, inactive or not, will errupt at once - and the world shall know the name Dr. Topiwala"
                 + " once and for all!!\n\nStick Hero: Not on my watch!\n\nScientist: AHHHH!!! " + name + ", you found me! *Tries to run away*");
    
    printFast ("The scientist is escaping! Do you\na. Attack Him\nb. Place explosives\nc. Turn off the power so the doors can't open");
      //Informs the user of the potential moves they can take.
      gameSleep();
      //Pauses the game for a second and a half.
      do {
        move = Character.toLowerCase(IBIO.inputChar ("Enter your choice: ")); 
      }
      while (!validMove2(move));
      switch (move) {
        case 'a':
          HMAscii.jumpKick();
          HMAscii.vaporise();
          printSlow ("You charged at the scientist, but the wizard came back wanting revenge! He cast a lightning spell "
                       + "and vaporized you!!\n\n\n\nRestarting...");
          finalScene (name);
          //User died before the game end was reached, so the method restarts! Now, the user must actively remember to not choose this choice!
          break;
        case 'b':
          printSlow ("You placed down the explosives successfully!\n\n\nOH NO! There's only 15 seconds left on the timer!"
                       + "\n\nQuick, how do you escape?\n");
          printFast ("Do you\na. Skii down the volcano\nb. Parasail off the volcano\nc.RUN!!!!");
          //Informs the user of the potential moves they can take.
          gameSleep();
          //Pauses the game for a second and a half.
          do {
            move2 = Character.toLowerCase(IBIO.inputChar ("Enter your choice: ")); 
          }
          while (!validMove2(move2));
          //Allows user to input their move choice, then checks if their move is a, b, or c. 
          switch (move2) {
            case 'a':
              HMAscii.skii();
              printSlow ("You managed to skii down the hill just before the explosion!\n\nWhen you got to the bottom, look at who you found!"
                           + "\n\n\nThe scientist!! Best take him to authorities right away!");
              break;
            case 'b':
              HMAscii.parasail();
              printSlow ("You ran back outside the doors and jumped off the cliff, opening your parachute right away!\nJust in time to "
                           + "escape the explosion! You notice that one person survived the explosion, and was waving for help - "
                           + "\n\n\nThe scientist!! Best take him to authorities right away!");
              break;
            case 'c':
              printSlow ("You're not THAT fast!\n\nOh well, at least you went out with a bang - and the authorities caught the scientist!!");
              HMAscii.police();
              break;
          }
          // Checks the users input, and if it's valid input, code will check 3 different cases that will provide different outcomes.
          break;
        case 'c':
          printSlow ("You cut out the electricity, trapping you and the scientist inside of the lair! Unfortunately, it also left both of you trapped!");
          printFast ("Do you\na. Set off a beacon to get help!\nb. Make your own way out with explosives!\nc. Capture the scientist, "
                      + " then restart the electricity!");
          //Informs the user of the potential moves they can take.
          gameSleep();
          //Pauses the game for a second and a half.
          do {
            move3 = Character.toLowerCase(IBIO.inputChar ("Enter your choice: ")); 
          }  //Allows user to input their move choice, then checks if their move is a, b, or c. Loops if not.
          while (!validMove2(move3));
          switch (move3) {
            case 'a':
              HMAscii.police();
              printSlow ("In under an hour, authorities arrived! They knocked down the door and arrested the scientist - thanks to you!");
              break;
            case 'b':
              printSlow ("Using the explosives, you made a BIG hole in the mountain's walls - and used too much explosive!"
                        + " RIP Stick Hero.\n\n\nRestarting...");
              finalScene(name);
              break;
            case 'c':
              printSlow ("You captured the scientist quickly, then pulled a few wires and the electricity came back up! Best get"
                        + " the scientist to authorities fast!");
              HMAscii.police();
              break;
          }
          // Checks the users input, and if it's valid input, code will check 3 different cases that will provide different outcomes.
          break;
      }
      //This section creates a non-linear ending for the game, adding a total of 5 final game endings and 7 different task endings
      //with a switch statement for the potential answers given, then branching off to choices for each choice.
  }
  //Scene Methods End

  //Task Methods Begin
  public boolean validTF (char ans) {
    if ((ans!= 'y' && ans != 'Y') && (ans != 'n' && ans != 'N'))
      return false;
    else
      return true;
    //Checks if the inputted parameter is a valid y/n response.
  }
  
  public char yesNo (String question) {
    char result;
    printSlow (question + " (y/n)");
    result = IBIO.inputChar (">> ");
    while (!validTF (result))
      result = IBIO.inputChar ("\n" + question + " (y/n) >> ");
    return result;
    //Prompts the user for a y/n answer for a question. Loops if invalid input is submitted.
  }
  
  
  //TASK SECTION II: Unscramble Methods BEGIN
  public int unscramble (String scram, String ans) { 
    int earned = 9;
    String guess = "";
    printSlow ("Unscramble:");
    guess = IBIO.inputString (scram + " >> ");
    while (!guess.toLowerCase().equals(ans)) {
      //Sets the guess to all lower case chars, then compares it to the answer.
      earned -= 3;
      printSlow ("Incorrect! Unscramble:");
      guess = IBIO.inputString (scram + " >> "); 
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  //Math Methods BEGIN
  public int mathQ1 () 
  {
    int earned = 9;
    int guess;
    int ans = 34 - 22;
    //Initializes important vars
    
    printSlow ("\n\nIn the past 3 weeks, 34 seemingly inactive volcanoes around the world have erupted! Last year, "
                 + "the number of inactive volcano explosions that occurred was 22. How many more explosions have happened "
                 + "in the past 2 weeks than last year?");
    guess = IBIO.inputInt ("34 - 22 =? ");
    //Prompts user with word problem and question
    
    while (guess != ans) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("34 - 22 =? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int mathQ2 () 
  {
    int earned = 9;
    int guess;
    int ans = 21 % 8;
    //Initializes important vars
    
    printSlow ("\n\nA few weeks ago, I made 22 pies. I had containers that could hold 8 pies each. If I have 3 containers"
                 + " how many pies will go into the third and final container?");
    guess = IBIO.inputInt ("21 / 8 (Remainder) = ? ");
    //Prompts user with word problem and question
    
    while (guess != ans) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("21 / 8 (Remainder) = ? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int mathQ3 () 
  {
    int earned = 9;
    int guess;
    int ans = 14284 + 301;
    //Initializes important vars
    
    printSlow ("\n\nThe house and it's furniture must cost at least $14 284! If I need to buy another $301 computer, how much money have"
                 + " I spent on this house?");
    guess = IBIO.inputInt ("14 284 + 301 = ? ");
    //Prompts user with word problem and question
    
    while (guess != ans) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("14 284 + 301 = ? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int mathQ4 () 
  {
    int earned = 9;
    int guess;
    int ans = 13 * 2;
    //Initializes important vars
    
    printSlow ("\n\nThere are 13 slugs moving across the street. Suddenly, each one splits in half! How many slugs are there now?");
    guess = IBIO.inputInt ("13 * 2 = ? ");
    //Prompts user with word problem and question
    
    while (guess != ans) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("13 * 2 = ? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int mathQ5 () 
  {
    int earned = 9;
    int guess;
    int ans = 45 / 3;
    //Initializes important vars
    
    printSlow ("\n\nThere are 45 enemy robots incoming! If my lightning bolt attack leaves only one third of them working, "
                 + "how many robots will I have to fight by hand?");
    guess = IBIO.inputInt ("45 / 3 = ? ");
    //Prompts user with word problem and question
    
    while (guess != ans) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("14 284 + 301 = ? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int mathQ6 () 
  {
    int earned = 9;
    int guess;
    double ans = Math.pow(2,4);
    //Initializes important vars
    
    printSlow ("\n\nEvery year, the population of the bunnies around here doubles! If there were originally 2 bunnies,"
                 + " how many bunnies will there be in 4 years?");
    guess = IBIO.inputInt ("2 ^ 4 (or 2 * 2 * 2 * 2) = ? ");
    //Prompts user with word problem and question
    
    while (guess != (int) (ans)) {
      earned -= 3;
      printSlow ("Incorrect!\n");
      guess = IBIO.inputInt ("2 ^ 4 (or 2 * 2 * 2 * 2) = ? ");
    }
    //If the answer was wrong, the number of achievable points is lowered by 3, and the user is re-promoted for the answer.
    return pointsEarned (earned);
    //Returns points earned from this task.
  }
  
  public int pointsEarned (int earned) {
    if (earned > 0) 
      printSlow ("\nYou earned " + earned + " points for that!");
    else {
      earned = 0;
      printSlow ("\nYou earned no points for that!");
    }
    return earned;
  }
  //Checks and outputs how many points the player earned for completing the math task. If the user took more than 3 tries
  //to get the answer, sets points earned to 0 (so the user doesn't lose points)
  
  //Math Methods END
  
  public int riddleTask () {
    int earned = 3;
    int tries = 0;
    boolean correct = false;
    //Initalizes the earnable score, and how many tries the user has used up.
    do {
      tries++;
      printFast ("What do you call a computer hero?");
      String ans = IBIO.inputString (" >> ").toLowerCase();
      //Adds one to tries, then prompts the user for the answer to the riddle.
      
      if (ans.equals("screensaver") || ans.equals("a screensaver")) {
        printSlow ("Answered in " + tries + "! You earned " + earned + " points!");
        correct = true;
      }
      else if (ans.equals("screen saver") || ans.equals ("a screen saver")) {
        printSlow ("Answered in " + tries + "! You earned " + earned + " points!");
        correct = true;
      }
      else {
        printSlow ("Nope. Try Again!\n");
        earned--;
      }
      //Checks if the user had the right response or not. If true, returns true. If not, the player loses a potential point they could earn.
    }
    while (tries <= 3 && !correct);
    //Checks if the user reached 3 tries, or got the right answer. If both are false, the loop re-runs.
    if (tries == 3) 
      printSlow ("The answer was: Screensaver\n\n");
    //If the user didn't get the answer in 3 moves, outputs the correct answer.
    
    //Second Riddle Now:
    earned = 3;
    tries = 0;
    correct = false;
    //Re-initalizes the earnable score, and how many tries the user has used up.
    do{
      tries++;
      printFast ("There are 45 active ones,\non the island of Java,\nif one of them were to erupt,\nyou would see lots of lava.\nWhat am I?");
      String ans = IBIO.inputString (" >> ");
      //Adds one to tries, then prompts the user for the answer to the riddle.
      
      if (ans.equalsIgnoreCase("volcano") || ans.equalsIgnoreCase("a volcano")) {
        printSlow ("Answered in " + tries + "! You earned " + earned + " points!");
        correct = true;
      }
      else {
        printSlow ("Nope. Try Again!\n");
        earned--;
      }
      //Checks if the user had the right response or not. If true, returns true. If not, the player loses a potential point they could earn.
    }
    while (tries <= 3 && !correct);
    //Checks if the user reached 3 tries, or got the right answer. If both are false, the loop re-runs.
    if (tries == 3) 
      printSlow ("The answer was: Volcano\n\n");
    //If the user didn't get the answer in 3 moves, outputs the correct answer.
    return earned;
    //Returns any points the user may have earned from this task.
  }
    
    //TASK SECTION I: Maze Methods Begin
    public int maze () {
      String direc = "";
      char direction, a, b, c, d, e, f, g, h, i, j, k, l, m, n, o , p, q, r, s, t, u, x1, x2, x3;
      int movesTaken = 0;
      a = 'H';
      b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = ' ';
      x1 = x2 = x3 = 'X';
      //Declaration and initialization of all requires variables for the maze positions. 
      
      printSlow ("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nStick Hero: What... where am I?!?!?!\n");
      HMAscii.mazeStart();
      gameSleep();
      
      printSlow ("\nStick Hero: Whoa!! I'm in a maze! This must be the work of the same person who's been behind all the eruptions!"
                   + "\n\nI need to get out of here, fast!\n");
      
      HMAscii.drawMaze (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o , p, q, r, s, t, u, x1, x2, x3);
      gameSleep();
      printSlow ("Stick Hero: Okay, so I've managed to figure out my location, and a few places where I think there may be exits!"
                   + "\nI'll have to be careful, because there may be dead-ends with pitfalls along the way.\n");
      mazeInstructions();
      
      while (x1 != 'H' && x2 != 'H' && x3 != 'H') {
        //Runs the player's turn over and over until the player position reaches one of the maze 'exits'.
        HMAscii.drawMaze (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o , p, q, r, s, t, u, x1, x2, x3);
        /* Calls a method from the RPG's ASCII Art file, and prints out the maze, with the user's current position and all of 
         * the blank positions. All of the parameters are the variables that make up all possible user positions, inculding exits.*/
        direc = mazeMove (direc);
        //Calls the method that asks the player for their move (input).
        direction = (char) (Character.toLowerCase(direc.charAt(0)));
        /*Takes the first letter of the user's inputted direction and turns it to lowercase. Since
         * mazeMove() has already ensured the input is a valid direction, this allows for simpler boolean expressions 
         * to be used while checking for where the user's icon should be displayed next. */
        
        if (a == 'H') {
          a = ' ';
          if (direction == 'u')
            b = 'H';
          else
            a = direcError (a); }
        else if (b == 'H') {
          b = ' ';
          if (direction == 'u')
            c = 'H'; 
          else if (direction == 'd') 
            m = 'H'; 
          else if (direction == 'l')
            a = 'H';
          else
            b = direcError (b); }
        else if (c == 'H') {
          c = ' ';
          if (direction == 'u') 
            b = 'H'; 
          else if (direction == 'd') 
            d = 'H'; 
          else if (direction == 'r')
            p = 'H';
          else
            c = direcError (c); }
        else if (d == 'H') {
          d = ' ';
          if (direction == 'r')
            c = 'H'; 
          else if (direction == 'd') 
            e = 'H'; 
          else if (direction == 'u')
            u = 'H';
          else
            d = direcError (d); }
        else if (e == 'H') {
          e = ' ';
          if (direction == 'u')
            d = 'H'; 
          else if (direction == 'd') 
            f = 'H'; 
          else
            e = direcError (e); }
        else if (f == 'H') {
          f = ' ';
          if (direction == 'r')
            d = 'H'; 
          else if (direction == 'd') 
            g = 'H'; 
          else
            f = direcError (f); }
        else if (g == 'H') {
          g = ' ';
          if (direction == 'u')
            h = 'H'; 
          else if (direction == 'd') 
            f = 'H'; 
          else
            g = direcError (g); }
        else if (h == 'H') {
          h = ' ';
          if (direction == 'l')
            x2 = 'H'; 
          else if (direction == 'd') 
            g = 'H'; 
          else if (direction == 'r')
            i = 'H';
          else
            h = direcError (h); }
        else if (i == 'H') {
          i = ' ';
          if (direction == 'u')
            j = 'H'; 
          else if (direction == 'r') 
            h = 'H'; 
          else
            i = direcError (i); }
        else if (j == 'H') {
          j = ' ';
          if (direction == 'l')
            i = 'H'; 
          else if (direction == 'r') 
            k = 'H'; 
          else
            j = direcError (j); }
        else if (k == 'H') {
          k = ' ';
          if (direction == 'r')
            j = 'H'; 
          else if (direction == 'd') 
            l = 'H'; 
          else
            k = direcError (k); }
        else if (l == 'H') {
          l = ' ';
          if (direction == 'r') 
            x1 = 'H'; 
          else if (direction == 'd') 
            k = 'H'; 
          else
            l = direcError (l); }
        else if (m == 'H') {
          m = ' ';
          if (direction == 'r')
            b = 'H'; 
          else if (direction == 'd') 
            n = 'H'; 
          else
            m = direcError (m); }
        else if (n == 'H') {
          n = ' ';
          if (direction == 'u') 
            m = 'H'; 
          else if (direction == 'r') 
            o = 'H'; 
          else
            n = direcError (n); }
        else if (o == 'H') {
          o = ' ';
          if (direction == 'u')
            x3 = 'H'; 
          else if (direction == 'l') 
            n = 'H'; 
          else
            o = direcError (o); }
        else if (p == 'H') {
          p = ' ';
          if (direction == 'l') 
            c = 'H'; 
          else if (direction == 'r') 
            q = 'H'; 
          else
            p = direcError (p); }
        else if (q == 'H') {
          q = ' ';
          if (direction == 'd')
            p = 'H'; 
          else
            q = direcError (q); }
        else if (r == 'H') {
          r = ' ';
          if (direction == 'd') 
            u = 'H'; 
          else if (direction == 'r')
            s = 'H';
          else
            r = direcError (r); }
        else if (s == 'H') {
          s = ' ';
          if (direction == 'l')
            r = 'H';
          else
            s = direcError (s); }
        else if (t == 'H') {
          t = ' ';
          if (direction == 'l') 
            u = 'H'; 
          else
            t = direcError (t); }
        else if (u == 'H') {
          u = ' ';
          if (direction == 'l') 
            d = 'H';
          else if (direction == 'd')
            t = 'H';
          else if (direction == 'r')
            r = 'H';
          else
            u = direcError (u); }
        /* This section uses a large series of if else if statements to check where the user is currently positioned,
         * based off of which variable currently the user icon (H). At each 'position', or variable, the program reads which 
         * direction the user chose to move towards. Following through the maze corridors, the user icon is now set to the 
         * next split in the maze they chose to move towards, and their old position is reset to the basics. 
         * 
         * Since the user cannot move in all directions at every variable, if the direction does not match to one of the valid 
         * options(ex. the user wants to go 'down' in an area where there is no corridor below their icon), an error method 
         * will run, and the loop will re-run, making the user now at their new position and able to move in new valid directions.
         * 
         * For efficiency, this section will skip the rest of the else if statements once it finds the variable that holds the 
         * user icon. As there are a great deal of variable changes whilst methods can only return one valid, and the different 
         * valid directions change for every variable, this section could not be moved to a different method and called repeatedly. */ 
        movesTaken++;
        //Increases the moves taken by 1.
      }
      HMAscii.drawMaze (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o , p, q, r, s, t, u, x1, x2, x3);
      printSlow ("Well done! In " + movesTaken + " moves, you found an exit!                             \n");
      HMAscii.mazeExit();
      //This section first prints the final maze result, then shows an ASCII picture of the maze exit.
      
      String nextLocation = "A MOUNTAIN RANGE?!?!";
      int nextLoc= 3;
      
      if (x1 == 'H') {
        nextLocation = "A FOREST?!?!";
        nextLoc = 1; 
      } 
      else if (x2 == 'H') {
        nextLocation = "A GRASSLAND?!?!";
        nextLoc = 2;
      }
      printSlow ("Seeing a strange door up ahead, you walk through and find yourself in...\n\n" + nextLocation);
      return nextLoc;
      /* It then checks which exit the user had chosen to reach (by checking which exit point is equal to the value of the 
       * user's icon), then informs the user of where their next scene is. Finally, it returns the value of the users next
       * location to the constructor.*/
    }
    
    public String mazeMove (String direc) {
      direc = IBIO.inputString ("Which direction do you want to move in? (Up/Down/Left/Right) >> ");
      while (!checkDirect (direc))
        direc = IBIO.inputString ("Invalid input. Which direction do you want to move in? (Up/Down/Left/Right) >> ");
      return direc;
      /*This method prompts the user for their choice of direction. It then calls a method to check whether or not 
       * the input was a valid direction or not - if not, the user will be prompted for an answer again. Once a valid 
       * direction is inputted, the chosen direction is returned to the main loop.*/
    }
    
    public boolean checkDirect (String direction) {
      boolean valid = false;
      if (direction.equalsIgnoreCase("up") || direction.equalsIgnoreCase("U"))
        valid = true;
      else if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("D"))
        valid = true;
      else if (direction.equalsIgnoreCase("right") || direction.equalsIgnoreCase("R"))
        valid = true;
      else if (direction.equalsIgnoreCase("left") || direction.equalsIgnoreCase("L"))
        valid = true;
      return valid;
      /*This method checks the string the user inputted. Ignoring whether the input is lower or upper-case, the program
       * checks if the user's input is an accurate direction, and returns a boolean value back to the mazeMove() method. */
    }
    
    public char direcError (char position) {
      printSlow ("Please choose another direction! Be sure you aren't going to hit a wall or fall into a pitfall!");
      position = 'H'; 
      return position;
      /*This method prints out an error message, telling the user their movement choice is not possible (either hitting a
       * dead end or a wall), then resets the old position back to the user icon (as in the series of if else if statements,
       * the first thing the program does is set the old user position to blank).*/
    }
    //Maze Methods END
    
    
    //TASK SECTION II: Nim Methods BEGIN
    public int nim (String pname, int score) {
      nimRules ();
      //Prints out the rules.
      boolean playAgain = false;
      do {
        int left = 15;
        int player = 2;
        int taken = 0;
        int ptaken = 0;
        //Initializes important variables.
        
        while (left > 0) {
          //Runs while there are stones in the pile.
          if (player == 1) {
            player = 2;
          }
          else
            player = 1;
          //Switches the turn value to the other player.
          drawLeft (left);
          //Draws how many stones are left.
          taken = whoseTurn (player, left, pname);
          left -= taken;
          //Runs the turn of whomever's turn it is, then subtracts the number of stone left by the number of stones
          //that had been removed by either the guard or the user. 
          if (player == 1)
            ptaken += taken;
          //If it is the user's turn, adds how many stones the user has taken to their total value
        }
        if (playerWon (player)) {
          score += ptaken;
          printSlow ("You beat the Wizard and he ran away crying!\nYour score: " + score);
          playAgain = false;
        }
        else {
          printSlow ("Try Again!");
          gameSleep();
          playAgain = true;
        }
      }
      while (playAgain);
      //If the user loses to the guard, restarts the task.
      return score;
      //If the user has won, returns the user's new score.
    }
    
    public void drawLeft (int left) {
      printSlow ("\nStones Remaining: " + left);
      //Prints out how many stones are left.
      for (int x = 0; x < left; x++) {
        System.out.print ("*");
      }
      System.out.println ();
      //Prints out a line of asteriks to signify how many stones are left.
    }
    
    public int whoseTurn (int player, int left, String pname) {
      int removed;
      if (player == 1) {
        printSlow (pname + "'s Turn!");
        removed = turn (left);
        return removed;
      }
      else {
        printSlow ("Wizards's Turn!");
        removed = botTurn (left);
        return removed;
      }
      //Checks whose turn it is, calls the method to run that player's turn, then returns the number of removed stones.
    }
    
    public boolean isValid (int num, int left) {
      boolean valid = false;
      if (num > left)
        valid = false;
      else if (num == 1 || num == 2)
        valid = true;    
      return valid;
      //Efficienctly checks whether or not the user has inputted an appropriate number of stones to remove.
    }
    
    public int turn (int left) {
      printFast ("How many stones do you want to remove?");
      int amt = IBIO.inputInt (">> ");
      //Prompts the player for how many stones they wish to remove.
      while (!isValid (amt, left))
        //Checks if the user's input is valid.
      {
        printSlow ("That amount is invalid. Try a smaller number.");
        printFast ("How many stones do you want to remove?");
        amt = IBIO.inputInt (">> ");
        //If the input was invalid, re-prompts the user for how many stones to remove until a valid response is inputted.
      }
      return amt;
    }
    
    public int botTurn (int left) {
      int aiRem;
      do {
        aiRem = (int) (Math.random() * 2) + 1;
        //Generates either 1 or 2. Can only generate 1 if the number of stones left is 1.
      }
      while (aiRem > left);
      if (aiRem == 1)
        printFast ("The wizard removed 1 stone!\n");
      else
        printFast ("The wizard removed 2 stones!\n");
      return aiRem;
      //Informs the user of how many stones the guard will be removing, the return's the guad's move.
    }
    
    public boolean playerWon (int player) {
      boolean winner = player == 1 ? false : true;
      return winner;
      //Checks if the player has won or not by seeing whose turn it was when the last stone was drawn.
    } 
    //Nim Methods End
    
    //TASK SECTION III: ArenaBattle Methods Start
    public void arenaBattle (String name) {
      boolean gameOver, gameWon, goAgain;
      int attack, attackW, chanceP;
      char moveP;
      //Declares important variables that are required throughout the entire method.
      
      do {
        int playerHp = 100;
        int wolfHp = 100;
        int potions = 5;
        int doubleDmg = 0;
        int fireTurn = 0;
        gameOver = false;
        gameWon = false;
        //Initalizes important variables required for the loop tot run.
        HMAscii.wolf();
        printFast ("\nVS\n");
        HMAscii.hero2();
        
        printSlow ("\nBattle Arena time! \n" + name + " vs. Wolf Guard!\n");
        
        while (gameOver == false && gameWon == false) {
          //Checks every turn if the player has won or lost.
          moveP = playerTurn(name, potions);
          //Initiates the player's move.
          switch (moveP) {
            //Executes code for different potential outcomes of the inputted variable (moveP).
            case 'a':
              attack = (int) (Math.random() * 16) + 5;
              //Sets the player's damage for the turn to a random int between 5 and 20.
              if (doubleDmg > 0) {
                printSlow ("\nWith your newfound strength, this attack will do double the normal damage!\n");
                attack *= 2; 
                doubleDmg--;
                //IF the player has more than 0 strength potions activated doubles the value of their attack, then lowers
                //the number of possible double damage attacks by 1. 
              }
              wolfHp -= attack < wolfHp ? attack : wolfHp;
              //Subtracts the wolf's health by the generated attack damage.
              //If the attack damage is greater than the wolf's HP, sets the wolfs HP to 0 (to avoid negative HP values).
              printSlow ("You did " + attack + " damage! The wolf now has " + wolfHp + " health left!");
              //Informs the user
              break; 
              //Exits the case. 
              
            case 'b': 
              chanceP = (int) (Math.random() * 4) + 1;
              //Choosed a random number between 1 and 4.
              switch (chanceP) {
                case 1:
                  printSlow ("The potion boosted your endurance! Regain half of your current health points!");
                  playerHp *= 1.5;
                  printSlow ("You now have " + playerHp + " health!");
                  break;
                  //1/4 chance the potion will increase the player's curent health by half, then informs player of their new HP.
                  
                case 2:
                  printSlow ("The potion boosted your strength! Your next attack will do double the damage!");
                  doubleDmg++;
                  break;
                  //1/4 chance the potion will boost the user's next attack damage by 2.
                  
                case 3:
                  printSlow ("You dropped the potion and it shattered!");
                  break;
                  //1/4 chance the potion will be accidently wasted.
                  
                case 4:
                  printSlow ("You threw the fire potion at the wolf! It will now lose an extra 5 damage for the next 3 turns!");
                  fireTurn+=3;
                  //1/4 chance a fire potion will be used. Adds 3 turns to the potions effects.
              }
              potions = potionCheck(potions);
              //Sets potions to one lower than before.
              break;
              
            case 'c':
              if (playerHp < 10) { 
              printSlow("With only " + playerHp + " left, you decided to run away! The wolf chased you, but "
                          + "you managed to recover 50 health before it caught up!");
              playerHp += 50;
              //If the player has less than 10 health and wants to run away, gives the player an extra 50 health
            }
              else
                printSlow("Run away failed! You lost a move.\n");
              break;
              //If the player does not have less than 10 health, their move is wasted.
          }
          if (fireTurn > 0) {
            fireTurn--;
            //Runs only if the wolf is affected by a fire potion. Removes one round from the wolf's burns.
            wolfHp -= wolfHp > 5 ? 5 : wolfHp;
            printSlow ("The wolf's burns did an extra 5 damage! It now has " + wolfHp + " health left!");
            //Subtracts the wolf's health by 5. If the wolf's health is less than 5, sets it's health to 0 (to avoid negative health).
            //Then informs the user of how much health the wolf has left now.
            if (fireTurn == 0)
              printSlow ("The wolf's burns have healed!\n");
            //If this was the last round the potion affects the wolf, informs the user.
          }
          
          gameWon = wolfHp > 0 ? false : true;
          //Checks if the wolf's HP is 0. If true, the wolf's turn will not occur.
          if (gameWon == false) {
            printSlow ("\nWolf Guard's move!");
            gameSleep();
            attackW = (int) (Math.random() * 13) + 8;
            //Sets the wolf's attack to a random integer between 8 and 20.
            playerHp -= attackW < playerHp ? attackW : playerHp;
            //Subtracts the player's health by the wolf's damage. If the wolf's damage is greater than the player's health,
            //sets the playerHp to 0 (to avoid negative health values).
            printSlow ("The wolf attacked and did " + attackW + " damage! You have " + playerHp + " health left!\n");
            gameOver = playerHp > 0 ? false : true;
            //Checks if the player still has health over 0 and has lost or not.
            //Changes from Criteria B: The ? operator was used to make the program more efficient (specification 9).
          }
          else
            printSlow ("The wolf ran away to recover from its wounds! " + name + " wins!"); 
        }
        goAgain = gameStatus (gameOver);
        //Checks whether the task should need to rerun or not.
      }
      while (goAgain); 
      //If the game restart condition is true, restarts the task.
    }
    
    public char playerTurn (String name, int potion) {
      char move;
      printSlow (name +"'s move!\n\n"
                   + "Will you:\na. Attack\nb. Use a Potion\nc. Run Away (Low HP Required!)");
      //Informs the user of the potential moves they can take.
      gameSleep();
      //Pauses the game for a second and a half.
      do {
        move = Character.toLowerCase(IBIO.inputChar ("Enter your choice: ")); 
      }
      while (!validMove(move, potion));
      //Promots the user for their move choice. Calls a method to check if the input was valid or not. If false, re-prompts 
      //the user until a valid choice is inputted.
      return move;
      //Returns the user's move choice.
      
    }
    
    public boolean validMove (char move, int potion) {
      if (move != 'a' && move != 'b' && move != 'c') {
        printSlow ("Enter a valid choice please!\n");
        return false;
        //If the user's input is not one of the potential choices, returns that the move was invalid, and prints an error message.
      }
      else if (move == 'b' && potion == 0) {
        printSlow ("You have no more potions! Please choose another option.\n");
        return false;
        //If the user wants to use a potion but has none, returns that the move was invalid, and prints an error message.
      }
      else
        return true;
      //For all other cases, the move is valid, thus returns that the move was valid. 
    }
    
    public int potionCheck (int potion) {
      potion--;
      if (potion > 1)
        printSlow ("You have " + potion + " potions left!");
      else if (potion == 1)
        printSlow ("You only have one potion left! Use it wisely!");
      else
        printSlow ("You are out of potions!");
      return potion;
    }
    //Subtracts the number of potions by one, then informs the user of how many potions they have left.
    
    public boolean gameStatus (boolean over) {
      boolean gameRestart;
      if (over == true) {
        printSlow ("The wolf defeated you! Try Again!                                              ");
        gameRestart = true;
      }
      else
        gameRestart = false;
      return gameRestart;
      /*If the variable over broke the loop that keeps the game going, the game informs the user they had lost and sets 
       * the game restart variable to true. As the only other case for the turn-continuing loop to end would be if the player 
       * won, the restart game variable is set to false, and the value of the restart var is returned.*/
    }
    //ArenaBattle Methods End
    //Task Methods End
    
    
    //General Use and Extra Methods - Some are used all throuhgout the game for different tasks. 
    //Some do not fall under any of the other task groups. Placed at the end so they don't get into the way while coding.
    public void printSlow (String s) {
      for (int i = 0 ; i < s.length () ; i++) {
        System.out.print ("" + s.charAt (i));
        try {
          Thread.sleep (55);
        }
        catch (InterruptedException m) { ; }
      }
      System.out.println();
    }
    /*for every character in the inputted string, this method will print out each character, then pause for 55 
     * milliseconds, creating a delay in printing the inputted string to the console - which will make text and 
     * dialogue throughout the program easier to follow along.*/
    
    public void gameSleep() {
      try {
        Thread.sleep(1500); }
      catch (Exception m) { ; }
      //Sets the current thread to sleep for one and a half seconds, effectively pausing the game for a moment.
      //Using this can allow for better sound timing, or allow the user to read what's happening on the console.
    }
    
    public int sceneSkip (char pw) {
      HashMap<String, Integer> passwords = new HashMap<String, Integer> ();
      passwords.put("apple", 1);
      passwords.put("grape", 2);
      passwords.put("orange", 3);
      passwords.put("banana", 4);
      passwords.put("lemon", 5);
      passwords.put("lime", 6);
      passwords.put("corn", 7);
      passwords.put("kiwi", 8);
      passwords.put("pineapple", 9);
      //Create a HashMap that requires a String to retrieve an integer, and place all of the valid 
      //passwords with their respective scene numbers.
      
      if (pw == 'y') {
        String pass = IBIO.inputString ("What is the password? >> ");
        try {
          int sceneCheck = passwords.get(pass); 
          return sceneCheck;
          //Try the inputted password in the HashMap that holds all the passwords. If it works, return the scene number the password retrieved.
        }
        catch (Exception yx) {
          printSlow ("\nThat is not a valid password!\n"); 
          return 0;
        }
        //If the input does not match a single password, the program will error - and this catch will stop the program
        //from breaking, and move on. 
      }
      else
        return 0;
      //If the user does not have a password, return the value that declares they do not. 
    }
    
    public boolean validMove2 (char move) {
      if (move != 'a' && move != 'b' && move != 'c') {
        printSlow ("Enter a valid choice please!\n");
        return false;
      }
      else
        return true;
    }
    
    public static void playSound(String audioFileName)
      // A method used to play audio files (compatibility is guaranteed only with .wav files)
    {
      try {
        // Tries the code, but provides a "catch" to handle any exceptions
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(HerosMission.class.getResource(audioFileName)); 
        // Opens an audio input stream
        Clip clip = AudioSystem.getClip();
        // Gets a sound clip resource
        clip.open(audioIn);
        // Open audio clip and loads clip from the audio input stream.
        clip.start();
        // Starts clip
      }
      catch (Exception ex) {
        System.out.println("Customized Error 404! AudioFile Not Found!\nCould be due to user settings");
      } // In case of error, message to console is printed
    }
    
    public void playFile (String fileName) {
      fileName = fileName.trim() + ".wav";
      playSound(fileName);
      //Sets the parameter to the music file name, adds the file extension, and calls a method that will play the music.
    }
    
    public void printFast (String s) {
      for (int i = 0 ; i < s.length () ; i++) {
        System.out.print ("" + s.charAt (i));
        try {
          Thread.sleep (25);
          //Less delay between each character printed than the other delayed printer.
        }
        catch (InterruptedException m) {
          ;
        }
      }
      System.out.println();
    } 
    //General Use Methods End
  }