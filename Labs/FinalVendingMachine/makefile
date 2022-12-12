run: build
	java -cp "./bin/" com.example.finalvendingmachine.Driver

build: clean
	find -name "Driver.java" > sources.txt
	find -name "Item.java" >> sources.txt
	find -name "Drink.java" >> sources.txt
	find -name "DataFile.java" >> sources.txt
	find -name "Snack.java" >> sources.txt
	find -name "Vending.java" >> sources.txt
	javac -source 11 -target 11 -d bin @sources.txt

clean:
	rm -rf bin/
	rm -rf "sources.txt"
