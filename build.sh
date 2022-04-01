rm -rv build/
cp -vr src/ build
cd build
javac *.java
rm *.java
cd ..
