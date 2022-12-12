OUT_DIR := src/
SRC_DIR := src/code/utils/*.java
DIST := P1-code.zip

FLAGS := --release 11 -d $(OUT_DIR) -sourcepath $(SRC_DIR)

# openjfx configurations
JFX_INCL := /usr/lib/jvm/openjfx/
JAVAFXC := javac --module-path $(JFX_INCL) --add-modules javafx.graphics
JAVAFX := java --module-path $(JFX_INCL) --add-modules javafx.graphics

vending: 
	javac $(FLAGS) src/code/Driver.java
		java -cp $(OUT_DIR) Main

vending-gui: 
	$(JAVAFXC) $(FLAGS) src/code/HelloApplication.java
	$(JAVAFX) -cp $(OUT_DIR) Main

clean:
	rm -rf $(OUT_DIR) $(DIST)
