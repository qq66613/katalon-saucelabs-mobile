# katalon-saucelabs-mobile
katalon-saucelabs-mobile


# Mobile Automation Testing — Katalon Studio

## Project Overview
Android mobile UI automation testing project using Katalon Studio and Appium. The project validates login functionality using positive and negative test scenarios.

The application APK is stored inside the Katalon project, and the script uses a project-relative path.

## How to Run
1. Clone this repository.
2. Open the project in Katalon Studio.
3. Connect an Android device or emulator and configure the mobile execution environment.
4. Ensure Appium is available and configured.
5. Open `Test Suites/TS_Mobile_Final_Project`.
6. Run the test suite and review the execution results.

## Test Suite
- **Test Suite:** `TS_Mobile_Final_Project`
- **Execution:** Katalon Studio with Appium
- **APK:** `Data/APK/APK-sauce-labs-stg.2.7.1.apk`
- **Report:** Refer to the mobile execution report included in this repository.

## Test Coverage

| Test Case | Coverage |
|---|---|
| TC_MOBILE_001 | Login with valid credentials |
| TC_MOBILE_002 | Negative login scenario |
| TC_MOBILE_003 | Login with invalid credentials |

**Total:** 3 test cases covering positive and negative login scenarios.