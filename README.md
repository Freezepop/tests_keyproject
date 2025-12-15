# Проект автоматизированного тестирования Web и Mobile

## Описание

Данный проект содержит автоматизированные тесты для веб- и мобильных приложений с использованием Selenium WebDriver и Appium.  
Цель проекта — продемонстрировать навыки автоматизации тестирования, применение паттерна Page Object Model и стабильную работу с UI-элементами с помощью явных ожиданий.

Проект включает:
- Web UI тесты для сайта https://demoqa.com
- Mobile UI тесты для Android-приложения Wikipedia

---

## Используемые технологии

Java 17  
Selenium WebDriver  
Appium 2  
TestNG  
WebDriverManager  
ChromeDriver  
Android Emulator  
UiAutomator2

---

## Web-тесты

Web-тесты реализованы с использованием Selenium WebDriver и TestNG.

Покрытые сценарии:
- Навигация по главной странице DemoQA
- Переход в раздел Elements
- Работа с элементами страницы Text Box
- Заполнение и отправка формы Automation Practice Form
- Проверка успешной отправки формы через модальное окно

Для повышения стабильности тестов используются явные ожидания (Explicit Wait).

---

## Mobile-тесты

Mobile-тесты реализованы с использованием Appium и UiAutomator2.

Покрытый сценарий:
- Запуск приложения Wikipedia
- Пропуск onboarding-экрана (если отображается)
- Открытие экрана поиска
- Ввод поискового запроса
- Открытие первого результата поиска

Тест рассчитан на официальную версию приложения Wikipedia, установленную из Google Play.

---

## Page Object Model

В проекте используется паттерн Page Object Model:
- Каждая страница или экран описывается отдельным классом
- Локаторы и действия с элементами вынесены из тестов
- Тесты содержат только бизнес-логику сценариев

Данный подход повышает читаемость, переиспользуемость и поддержку тестов.

---

## Запуск тестов

Web-тесты можно запускать:
- через Maven
- напрямую из IDE

Для запуска Mobile-тестов необходимо:
- запущенный Appium Server
- Android-эмулятор или подключенное устройство
- установленное приложение Wikipedia

Appium должен быть запущен до старта мобильных тестов.

```
PS C:\Windows\system32> appium
[Appium] Welcome to Appium v3.1.2
[Appium] The autodetected Appium home path: C:\Users\Cyber\.appium
[Appium] Attempting to load driver uiautomator2...
[Appium] Requiring driver at C:\Users\Cyber\.appium\node_modules\appium-uiautomator2-driver\build\index.js
[Appium] AndroidUiautomator2Driver has been successfully loaded in 0.946s
[Appium] Appium REST http interface listener started on http://0.0.0.0:4723
[Appium] You can provide the following URLs in your client code to connect to this server:
http://172.29.208.1:4723/
http://169.254.146.234:4723/
http://192.168.59.1:4723/
http://169.254.232.203:4723/
http://169.254.141.107:4723/
http://192.168.56.1:4723/
http://169.254.53.143:4723/
http://169.254.38.103:4723/
http://192.168.0.18:4723/
http://127.0.0.1:4723/ (only accessible from the same host)
http://172.21.112.1:4723/
[Appium] Available drivers:
[Appium]   - uiautomator2@6.7.1 (automationName 'UiAutomator2')
[Appium] No plugins have been installed. Use the "appium plugin" command to install the one(s) you want to use.
```
Запуск тестов из среды разработки intellij idea:
```bash
PS C:\Users\Cyber\IdeaProjects\tests_keyproject> mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< com.example.tests:ui-tests >---------------------
[INFO] Building ui-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ ui-tests ---
[INFO] Deleting C:\Users\Cyber\IdeaProjects\tests_keyproject\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ ui-tests ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Cyber\IdeaProjects\tests_keyproject\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ ui-tests ---
[INFO] No sources to compile
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ ui-tests ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Cyber\IdeaProjects\tests_keyproject\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ ui-tests ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1251, i.e. build is platform dependent!
[INFO] Compiling 10 source files with javac [debug target 11] to target\test-classes
[WARNING] system modules path not set in conjunction with -source 11
[ERROR] /C:/Users/Cyber/IdeaProjects/tests_keyproject/src/test/java/tests/mobile/WikipediaTest.java:[45,70] unmappable character (0x98) for encoding windows-1251
[ERROR] /C:/Users/Cyber/IdeaProjects/tests_keyproject/src/test/java/tests/mobile/WikipediaTest.java:[45,77] unmappable character (0x98) for encoding windows-1251
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ ui-tests ---
[INFO] Using auto detected provider org.apache.maven.surefire.testng.TestNGProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
дек. 15, 2025 12:22:15 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:22:15 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to 'org.seleniumhq.selenium:selenium-devtools-v86:4.11.0' where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
дек. 15, 2025 12:22:24 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:22:24 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to 'org.seleniumhq.selenium:selenium-devtools-v86:4.11.0' where the version ("v86") matches the version of the chromium-based browser you're using and tдек. 15, 2025 12:22:33 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:22:33 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to 'org.seleniumhq.selenium:selenium-devtools-v86:4.11.0' where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 34.86 s -- in TestSuite
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  38.707 s
[INFO] Finished at: 2025-12-15T12:22:39+03:00
[INFO] ------------------------------------------------------------------------
PS C:\Users\Cyber\IdeaProjects\tests_keyproject> mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] ---------------------< com.example.tests:ui-tests >---------------------
[INFO] Building ui-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ ui-tests ---
[INFO] Deleting C:\Users\Cyber\IdeaProjects\tests_keyproject\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ ui-tests ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Cyber\IdeaProjects\tests_keyproject\src\main\resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ ui-tests ---
[INFO] No sources to compile
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ ui-tests ---
[WARNING] Using platform encoding (Cp1251 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\Users\Cyber\IdeaProjects\tests_keyproject\src\test\resources
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ ui-tests ---
[INFO] Recompiling the module because of changed source code.
[WARNING] File encoding has not been set, using platform encoding windows-1251, i.e. build is platform dependent!
[INFO] Compiling 10 source files with javac [debug target 11] to target\test-classes
[WARNING] system modules path not set in conjunction with -source 11
[INFO]
[INFO] --- surefire:3.2.5:test (default-test) @ ui-tests ---
[INFO] Using auto detected provider org.apache.maven.surefire.testng.TestNGProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running TestSuite
SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.
дек. 15, 2025 12:38:43 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:38:43 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.11.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
дек. 15, 2025 12:38:58 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:38:58 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.11.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
дек. 15, 2025 12:39:10 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find CDP implementation matching 143
дек. 15, 2025 12:39:10 PM org.openqa.selenium.chromium.ChromiumDriver lambda$new$5
WARNING: Unable to find version of CDP to use for 143.0.7499.110. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.11.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 43.38 s -- in TestSuite
[INFO] 
[INFO] Results:
[INFO]
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  47.466 s
[INFO] Finished at: 2025-12-15T12:39:16+03:00
[INFO] ------------------------------------------------------------------------
```


---

## Результат

После корректной настройки окружения все тесты проходят успешно.  
Проект демонстрирует стабильный и поддерживаемый подход к автоматизации UI-тестирования для web и mobile приложений.

---
