SOURCES = ADTGraph.java Edge.java Vertex.java
TEST_SRCS = Test.java Helper.java

test: $(SOURCES) $(TEST_SRCS)
	javac $(SOURCES) $(TEST_SRCS)

javadoc: $(SOURCES)
	mkdir -p javadoc
	env LANG=en_US.UTF-8 javadoc -d javadoc $(SOURCES)

.PHONY: clean
clean:
	rm -f *.class
	rm -rf javadoc
