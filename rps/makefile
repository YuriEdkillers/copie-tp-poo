.PHONY: project test doc exe clean

project:
	mkdir -p classes; javac -d classes -cp classes src/io/*.java src/rps/strategy/*.java src/rps/*.java

test: project
	javac -cp test-1.7.jar test/playerTest.java; javac -cp test-1.7.jar test/gameTest.java

doc:
	mkdir -p docs; javadoc -cp src rps rps.strategy -d docs

exe: project
	jar cvfm rps.jar manifest -C classes rps -C classes io

clean:
	rm -rf classes docs; rm -rf test/*.class
