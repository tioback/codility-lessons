gradle-wrapper.jar is missing

The Gradle wrapper jar (`gradle-wrapper.jar`) is required for `./gradlew` to work. It could not be downloaded automatically in this environment. Please populate it using one of the methods below:

1) If you have Gradle installed locally (recommended):

   gradle wrapper --gradle-version 8.4.1

   This will generate `gradle/wrapper/gradle-wrapper.jar` and other wrapper files.

2) If you don't have Gradle installed, download the distribution and extract the jar manually:

   curl -L -o gradle-8.4.1-bin.zip https://services.gradle.org/distributions/gradle-8.4.1-bin.zip
   unzip -j gradle-8.4.1-bin.zip 'gradle-8.4.1/lib/gradle-wrapper.jar' -d gradle/wrapper
   rm gradle-8.4.1-bin.zip

3) As an alternative, download the wrapper jar from Maven Central (if available):

   curl -L -o gradle/wrapper/gradle-wrapper.jar https://repo1.maven.org/maven2/org/gradle/gradle-wrapper/<version>/gradle-wrapper-<version>.jar

Note: Replace `<version>` with a valid wrapper artifact version if you use option 3.

After placing `gradle-wrapper.jar` in `gradle/wrapper`, `./gradlew` should run and download the Gradle distribution automatically.
