OUT_DIR := 
SRC_DIR := src/
DIST := P1-code.zip

FLAGS := --release 11 -d $(OUT_DIR) -sourcepath $(SRC_DIR) src/Main.java

# openjfx configurations
JFX_INCL := /mnt/c/Users/arjun/.m2/repository/org/openjfx/
JAVAFXC := javac --module-path $(JFX_INCL) --add-modules javafx.graphics
JAVAFX := java --module-path $(JFX_INCL) --add-modules javafx.graphics

vending:
	javac $(FLAGS)
	java -cp $(OUT_DIR) Main

vending-gui:
	$(JAVAFXC) $(FLAGS)
	$(JAVAFX) -cp $(OUT_DIR) Main

clean:
	rm -rf $(OUT_DIR) $(DIST)
