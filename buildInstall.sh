rm -rv build/
cp -vr src/ build
cd build
echo "COMPILING"
javac *.java
echo "BUILDING"
rm *.java
jar -cvfe ../XnauiMUD-Setup.jar Install *
rm -r *
mv ../XnauiMUD-Setup.jar XnauiMUD-Setup.jar
echo "DONE"
