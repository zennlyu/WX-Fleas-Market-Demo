source ~/.bash_profile
# vim ~/.zshrc
mvn clean package -Dmaven.test.skip=true
docker-compose build
docker-compose up