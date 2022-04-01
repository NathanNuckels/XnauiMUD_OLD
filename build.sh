rm -rv build/
cp -vr src/ build
cd build
echo "COMPILING"
javac *.java
echo "DONE"
rm *.java
cd ..
