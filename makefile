build:
	rm -r build/
	cp src/ build/
	cd build
	javac *.java
	rm *.java
	jar -cvfe ../run.jar Main *
	cd ..

test:
	cd src
	javac *.java
	cd ..

clean: 
	rm -r build/ src/*.class
