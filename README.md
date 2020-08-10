# Blue Marble (extra credit)

This repository contains codes to complete the following exercise based on the original code from https://github.com/joonspoon/javafx-base

User selects a date and an Earth image will be displayed.

To launch this app, run Launcher.jave as a Java application.

Earth image displayed at the start of the program is from: https://www.pexels.com/photo/planet-earth-close-up-photo-45208

The following is the original description of this exercise.

All requirements of this exercise have been completed.

# To run within Eclipse:
1. Fork, then clone this repository.
2. From Eclipse, File > Import > Existing Maven Projects.
3. Under src/main/java > hellofx, right click Launcher, and Run As > Java Application.

# To run from command line, using Maven:
```
git clone https://github.com/joonspoon/javafx-base
cd blue-marble
mvn clean javafx:run
```
# To complete this exercise:
1. Make a GUI that shows the view of the earth on a date chosen by the user.
2. If the user selects an option in the future, an exception will be thrown. Catch this exception and appropriately inform the user.
3. Add an option so that the user can choose to see the “enhanced” version of the image.
4. The database only includes enhanced images up until June 2018. Make the enhanced option inactive if the date selected is after that date.
5. Add an option to make the image black and white. 
