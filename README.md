1. Follow instructions here:

https://mcforge.readthedocs.io/en/1.14.x/gettingstarted/

2. Set up Intellij

From the Idea splash screen select Import Project. Navigate to the location where you extracted the MDK and select the build.gradle file and click OK. Leave the defaults on the next screen and click OK again.

To get run configurations, go back to the terminal and run the following command:

gradlew genIntellijRuns
Move back to the Idea window and it should inform you that the project has changed and ask you if you want to reload it, select yes.

3. Click on Gradle tab. Hit the refresh icon. Then build.

4. Exit Intellij then run:

    ./gradlew genIntellijRuns

This sets up the configuration so you can for instance select `run client`.

5. Go back into Intellij and run `runClient`

