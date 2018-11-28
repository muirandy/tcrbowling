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
:)