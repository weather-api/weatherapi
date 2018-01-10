# weatherapi

This project aimed to provide a service for querying data. A flask service is used with Apache-tomcat8 to execute a request. Java project enables user to make queries 
just by entering a city name and return temperature as result.(JSON data that comes from flask service, is parsed using GSON library.)

## How to have this project?

You can have this project by downloading it via download button that exists in right above the project files.

You can choose the download type that is suitable for you.

Now you're ready to import it.

or

If you are using git bash, use the following command to clone this project into your

local directory:

```
git clone http://path-to-this-project
```

### Prerequisites

You need to have java installed in your system, if you don't you can download from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

This project includes maven, so you need to have maven installed in your system to run app. 

You need flask to be able to run service file.
You can install flask on your system following steps in [this video](https://www.youtube.com/watch?v=jp5qkFWAqQs)

If you don't, you can intsall it with using command;

```
sudo apt-get install maven
```

You can use one of the following IDEs to compile this api.

* [Eclipse](https://eclipse.org/ide/)
* [NetBeans](https://netbeans.org/)
* [IntelliJ IDEA](https://www.jetbrains.com/idea)
###

### Installing

Use [How to have this project?](#Anchors-in-markdown) to download this project.

First run flask service.

To create the files in this git repo we've already run

mvn archetype:generate from http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

And...

To compile project use following commands in command prompt:

```
cd path-to-project

mvn clean install

```

After building project, you can run it with following command:

```
mvn exec:java -Dexec.mainClass=Test
```

Running mvn clean will get us back to only the source Java and the pom.xml

while running mvn compile produces a class file.

Running mvn clean compile exec:java requires http://mojo.codehaus.org/exec-maven-plugin/

Running java -jar target/my-app-1.0-SNAPSHOT.jar requires http://maven.apache.org/plugins/maven-shade-plugin/

Also, you can run tests with mvn test.

### How to create javadoc?

[What is javadoc?](https://en.wikipedia.org/wiki/Javadoc)

To use javadoc command, open a terminal or command prompt.

Change your directory to where tour source is using 'cd' command.

```
cd C:/YOUR/SOURCE/DIRECTORY
```

Following command shows how to use javadoc command.

```
javadoc -sourcepath code-path -d destination package-names
```

Suppose you want to use javadoc for creating the API of your class which is called example.java

```
javadoc -d doc example.java
```
This command will create a new folder called doc and put the API files in this new folder.


## Authors

* **Zehra Yılmaz* *Saliha Altındiş** - *Initial work* - [ZehraYılmaz](https://github.com/ZehraYilmaz)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

