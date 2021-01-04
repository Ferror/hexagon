compile:
    mvn clean compile assembly:single

run:
	mvn clean install
	exec /usr/bin/supervisord -c /etc/supervisor/supervisord.conf
