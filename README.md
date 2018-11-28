# Test-Commit-Revert (from Kent Beck)
These 2 posts from Kent Beck may well be the biggest disruptor in writing software since TDD. IMHO.
* https://medium.com/@kentbeck_7670/limbo-on-the-cheap-e4cfae840330
* https://medium.com/@kentbeck_7670/test-commit-revert-870bbd756864

Finding the concept fascinating, I've tried this workflow. Here you can find the bits you need to try it out on your own, with a Java8 and maven project.
I've filled in the missing bits - the scripts for test, commit and revert. This is what you find here! 

##How to use
  * The scripts here are good on a Mac. You'll need to write your own if you're on Windows (sorry!). Linux may work.
  * Ensure you've got Java 8 (or better)
  * Ensure you've got maven installed
  * Clone this repo
  * Change your git remote:
      * git remote set-url origin <Your Git Repo URL> 
  * In a terminal, run the script that pulls and pushes from git (leave running!):
      * ./ci 
  
  ##Experiment!
  ###Make a change. Go on!
  I suggest you try the following:
  Edit TcrTest, adding
  assertTrue(false);
  
  ###Now:
  * Run Test-Commit-Revert in a terminal:
      * ./test && ./commit || ./revert
      
  Stand back, watch the code you wrote fail a test, and then get reverted (thrown away)! You're back to where you were, with the tests all passing.
  
  ###Now:
  * Try another change to TcrTest. Perhaps duplicate the passing test (one line is enough!)
  * Run Test-Commit-Revert again!
  * Watch your change pass the build, and watch it get pushed into your repo automatically!     
  
  ##Pause for thought
  Some of these may well be true for you:
  * Your master branch can't be red!
  * It doesn't make sense to use feature branches!
  * You're doing "proper" CI (1), as you're pulling changes *and* pushing yours frequently.
  * Your commits will be small. You can't gamble on losing a lot of work!
   
  
  
  (1) https://martinfowler.com/articles/continuousIntegration.html Section "Everyone Commits To the Mainline Every Day"