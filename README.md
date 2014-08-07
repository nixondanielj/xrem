Project Setup
---
First, [here's a great (very relevant) video](https://www.youtube.com/watch?feature=player_embedded&v=qokEYBNWA_0) to watch while you're downloading the crap in this install.

[Here's some other stuff you should know](http://rest.elkstein.org/)

###Step by Step
1. Get eclipse - I grabbed [a fresh x64 copy of Java EE](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/keplersr2) and "tar zxvf"d it into my home directory
2. Eclipse does this thing where the menus don't show up in Ubuntu 13.10, try [this solution](http://stackoverflow.com/questions/19452390/eclipse-menus-dont-show-up-after-upgrading-to-ubuntu-13-10)
3. Open up eclipse and click: Help > Install New Software
4. In the box labeled "Work with:" enter: "http://dl.google.com/eclipse/plugin/4.3" and click add
5. Give it a name (I used "google plugin") and click OK
6. Put a check by "Google Plugin for Eclipse" and "SDKs/Google App Engine Java SDK 1.9.2"
7. Finish the install wizard, i.e., click next a lot and agree to some terms
8. Wait for-goddamned-ever and think about how much you hate government subsidized utility monopolies (and watch/read the content I listed above)
9. Agree to unsigned content and let the install restart eclipse
10. Clone this xrem repository
11. In Eclipse, click File > Import
12. In the import window, open the "General" folder, choose "Existing Projects into Workspace"
13. Select the cloned xrem directory in the "Select root directory" box
14. If your xrem directory is not in your workspace, you may want to put a check next to the "Copy projects into workspace" box
15. Click Finish
16. You should now be able to click "Run", if eclipse asks how the project should be run, choose the "Web Application" entry that has a little "g" logo next to it
17. Finally, [go here](http://localhost:8888/_ah/api/explorer) - if it offers you a greeting api of some kind, you've succeeded. If it's broken, check the console in eclipse to see if the port is different from 8888 - maybe localhost:8080 or something
