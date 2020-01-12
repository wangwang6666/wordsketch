# wordsketch


## Deployment
1. clone the project to local
2. package the project into a jar file using "mvn install"
3. upload the jar file obtained in 2. to your machine using "scp wordsketch-1.0-SNAPSHOT.jar username@ipaddress:/home/wordsketch-1.0-SNAPSHOT.jar", "username" and "ipaddress" is the username and ip address of your machine
4. run the application using "java -jar wordsketch-1.0-SNAPSHOT.jar" 
5. after running it successfully, enter "http://ipaddress:port/wordsketch" in Chrome, this is the homepage of Chinese word sktech. "ipaddress" and "port" is the ip address and port that the application runs on.

## Instruction of use
1. enter a Chinese word in search bar and then choose a part of speech
2. in result page, you can choose how to sort the results (by frequency or significance)
3. click frequency or significance, you can get the example sentences of corresponding collocation
4. click any word you can get word sketch result of this word
