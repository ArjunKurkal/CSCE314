run: build
	java -cp "./bin/" Driver

build: clean
	find -name "*.java" > sources.txt
	javac -d bin @sources.txt

clean:
	rm -rf "bin"
	rm -rf "sources.txt"
	mkdir "./bin/"

