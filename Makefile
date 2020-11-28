compile:
    mvn clean compile assembly:single

run:
	mvn clean install
	mvn exec:java -Dexec.mainClass="presenter.graphic.GraphicApp"
