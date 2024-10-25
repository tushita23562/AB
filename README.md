By Kavya Karthik (2023281) and Tushita Kapoor (2023562)

The main folders used in the project are assets (which stores all image objects used in the game including screens, buttons, birds, etc), core (which has the main file present at the address core/src/main/java/kavyaidk/java/Main.java) and lwjgl3, which is used for the desktop configuration.

In the main file, a flag variable k is used with different variables corresponding to different screens to code the logic of where you need to click on which screen to navigate to different screens and other such functionalities. The mapping of the values of k and their screens/objects are as follows:

0: home screen
1: levels screen
2: parade screen (the birds will fly around the screen and you can view details about them in the game)
3: menu screen
4: level 1 screen
5: level 2 screen
6: level 3 screen
7/8/9: the pause screen for each level
10: credits screen

There are three boolean flag variables, isLevel1Unlocked (which is initialized to true), isLevel2Unlocked and isLevel3Unlocked (which are initialized to false). As it is a static GUI, we haven’t encoded the gameplay and you simply need to press the enter key to complete each level. When this is done, the next level is unlocked.

We have also added pause and home buttons (which pause your game and allow you to resume/return to home and go back to the main screen respectively) as well as options to mute and unmute the music (which by default is unmuted) along with the credits in the menu.

