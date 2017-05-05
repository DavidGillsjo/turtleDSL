# How to get editor up and running
1. Install eclipse (choose modeling tools version during install)
2. Open the existing project located in CodeFrame
3. Open turtlebotmission.xtext and right click, choose run as -> generate artifacts. This will generate some java-files.
3. In the menu, choose Run-> run configurations...
4. Create a new eclipse application, change name if you want, then press Run.
5. Now the DSL editor starts (I get a warning and a null pointer exception, seems to work anyway)
6. Skip this! (Add the file association for *.TurtleBotMissionDSL in window->preferences->general->editor->file associations)
7. Open the project located in MyTurtle
8. Chose one of the example files and press the Turtle icon in the menu bar, you should now have a generated_mission.py in the project!


# Run editor
After initial setup you only need to:
1. Open the existing project located in CodeFrame
2. Choose project turtlebotmission.xtext and press Run. This will generate some java-files.
3. Run->run history->you_config_name
4. And we are done, editor up and running (should remember you last project)

# Development
To update grammar, edit file turtlebotmission.xtext/src/se.chalmers/TurtleBotMissionDSL.xtext. 
Remember to run step 2 and 3 from above to get the new editor.
