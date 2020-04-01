.PHONY: project test doc exe clean

project:
	mkdir -p classes; javac -d classes -cp classes src/io/*.java src/battleship/util/*.java src/battleship/*.java

test: project
	javac -cp test-1.7.jar test/SeaTest.java; javac -cp test-1.7.jar test/CellTest.java; javac -cp test-1.7.jar test/ShipTest.java

doc:
	mkdir -p docs; javadoc -cp src battleship battleship.util -d docs

exe: project
	jar cvfm battleship.jar manifest -C classes battleship -C classes io

clean:
	rm -rf classes docs; rm -rf test/*.class
