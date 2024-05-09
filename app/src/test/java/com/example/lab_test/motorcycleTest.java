package com.example.lab_test;

import junit.framework.TestCase;

import org.junit.Test;

public class motorcycleTest extends TestCase {

    @Test
    public void testDrive(){
        motorcycle m = new motorcycle();
        m.drive();

        assertEquals(0.5,m.fule,0.01);
        assertEquals("Red",m.color.name);
    }
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-failsafe-plugin</artifactId>
                <version>3.2.5</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>integration-test</goal>
                            <goal>verify</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>

            import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;






    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

import org.junit.Test;
import static org.junit.Assert.*;


    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButtonClick_Alternate() {
        // Click the button three times
        Espresso.onView(ViewMatchers.withId(R.id.button))
                .perform(ViewActions.click())
                .perform(ViewActions.click())
                .perform(ViewActions.click());

        // Check if the text view alternates between "Red!" and "Green!"
        Espresso.onView(ViewMatchers.withId(R.id.textView))
                .check(ViewAssertions.matches(ViewMatchers.withText("Red!")));

    }

Espresso.onView(ViewMatchers.withId(R.id.et1)).perform(ViewActions.typeText("2"));
Espresso.onView(ViewMatchers.withId(R.id.area)).perform(ViewActions.click());
Espresso.onView(ViewMatchers.withId(R.id.textView)).check(ViewAssertions.matches(ViewMatchers.withText("12.56")));



    name: AndroidBuild

    on:
    pull_request:
    branches: [master]
    push:
    branches: [master]

    jobs:
    build:
    runs-on: windows-latest
    steps:
            - name: Checkout
    uses: actions/checkout@v4.1.0
            - name: Setup Java JDK
    uses: actions/setup-java@v3.13.0
    with:
    java-version: '17'
    distribution: 'adopt'
            - name: Grant execute permission to gradlew
    run: chmod +x ./gradlew
      - name: Build with Gradle
    run: ./gradlew build
      - name: Upload a Build Artifact
    uses: actions/upload-artifact@v3.1.3
    with:
    name: AndroidCICD.apk
    path: app/build/outputs/apk/debug/app-debug.apk
}