find src -name "*.java" > sources.txt
javac -d out @sources.txt
rm sources.txt

java -cp out pawjump.Main            

