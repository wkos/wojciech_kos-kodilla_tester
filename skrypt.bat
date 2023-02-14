del build/libs/*.jar
call gradlew build
if exists build/libs/*.jar then copy build/libs/*.jar project else echo "jar files not exist"
