
#### 1. Build And Run at CLI.

Make sure you have Java 8 installed.

Then `gradlew build`  (run `sh` on OSX, `bat` on windows).

Then `gradlew runClient`  (run `sh` on OSX, `bat` on windows).

#### 2. Set up Intellij

You can build and debug in Intellij if you want. Here are the steps:

- Before opening Intellij, generate your run configurations. Go to the terminal and run the following command:

    gradlew genIntellijRuns


- From the Idea splash screen select Import Project. Navigate to the location where you cloned this repo and select the build.gradle file and click OK. Leave the defaults on the next screen and click OK again.

- Select the `runClient` configuration and hit play.


