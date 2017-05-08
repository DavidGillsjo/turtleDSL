package se.chalmers.turtlebotmission.rosstarter.handlers;

import java.io.ByteArrayInputStream;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;


import java.util.ArrayList;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import turtlebotmission.LineTask;
import turtlebotmission.Mission;
import turtlebotmission.ReturnToStartTask;
import turtlebotmission.ShortestPathTask;
import turtlebotmission.Task;
import turtlebotmission.TurtleBot;
import turtlebotmission.WayPoint;
import turtlebotmission.WaypointType;
import turtlebotmission.impl.TurtleBotImpl;

/**
 * A handler that is called when the user clicks on the turtlebot icon in the menu.
 * Allows to calculate a list of waypoints to visit and then initiates the creation of the Python file.
 * 
 */
public class CreatePythonFromModelHandler extends AbstractHandler {

	/**
	 * Called whenever a user clicks on the turtlebot icon
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		IEditorPart editor = window.getActivePage().getActiveEditor();
		if (editor instanceof XtextEditor) {
			IXtextDocument doc = ((XtextEditor) editor).getDocument();

			doc.modify(new IUnitOfWork<Void, XtextResource>() {
				@Override
				public java.lang.Void exec(XtextResource archimodel) {
					// now we access the model 
					for (EObject modelObject : archimodel.getContents()) {
						if (modelObject instanceof TurtleBotImpl) {
							
							//Now you have the access to your model:
							TurtleBot turtle = (TurtleBot) modelObject;
							
							
							IWorkbenchWindow window;
							try {
								window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
								MessageDialog.openInformation(window.getShell(), "Launch ROS",
										"You will find the resulting file in this workspace, in generated_mission.py");
								
								
								//This is were you should parse the model, create a plan, and fill the string template
								//Don't hesitate to use extra classes and methods to structure your code
								
								
								
								
								final STGroup stGroup = new STGroupFile("PythonCodeTemplate.stg");
//								
								ST pythoncode = stGroup.getInstanceOf("pythonCode");
//									
								
								for (WayPoint w : turtle.getWaypoints() ){
									pythoncode.add("waypoints", "\"" + w.getName()  + "\": (" +  w.getCoord_x() + ", " + w.getCoord_y() + ")") ;	
								}
									



//								
							
								
								//System.out.println(hello.render());

								IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
								IProject myProject = myWorkspaceRoot.getProjects()[0];
								// create a new file
								IFile resultFile = myProject.getFile("generated_mission.py");
								try {
									if (!resultFile.exists())
										resultFile.create(new ByteArrayInputStream(new byte[0]), false, null);
									
									//fill the file
									resultFile.setContents(new ByteArrayInputStream(pythoncode.render().getBytes("UTF-8")), 0, null);
								} catch (Exception e) {
									e.printStackTrace();
								}
								
								
							} catch (ExecutionException e) {
								e.printStackTrace();
							}
						}
					}
					return null;
				}
			});
		}

		return null;
	}


}
