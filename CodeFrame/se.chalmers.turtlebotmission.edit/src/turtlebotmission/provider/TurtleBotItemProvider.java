/**
 */
package turtlebotmission.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import turtlebotmission.TurtleBot;
import turtlebotmission.TurtlebotmissionFactory;
import turtlebotmission.TurtlebotmissionPackage;

/**
 * This is the item provider adapter for a {@link turtlebotmission.TurtleBot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtleBotItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurtleBotItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBot_startPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bot start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBot_startPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TurtleBot_bot_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TurtleBot_bot_start_feature", "_UI_TurtleBot_type"),
				 TurtlebotmissionPackage.Literals.TURTLE_BOT__BOT_START,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TurtlebotmissionPackage.Literals.TURTLE_BOT__AREA);
			childrenFeatures.add(TurtlebotmissionPackage.Literals.TURTLE_BOT__WAYPOINTTYPES);
			childrenFeatures.add(TurtlebotmissionPackage.Literals.TURTLE_BOT__WAYPOINTS);
			childrenFeatures.add(TurtlebotmissionPackage.Literals.TURTLE_BOT__MISSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TurtleBot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TurtleBot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TurtleBot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TurtleBot_type") :
			getString("_UI_TurtleBot_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TurtleBot.class)) {
			case TurtlebotmissionPackage.TURTLE_BOT__AREA:
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTTYPES:
			case TurtlebotmissionPackage.TURTLE_BOT__WAYPOINTS:
			case TurtlebotmissionPackage.TURTLE_BOT__MISSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TurtlebotmissionPackage.Literals.TURTLE_BOT__AREA,
				 TurtlebotmissionFactory.eINSTANCE.createArea()));

		newChildDescriptors.add
			(createChildParameter
				(TurtlebotmissionPackage.Literals.TURTLE_BOT__WAYPOINTTYPES,
				 TurtlebotmissionFactory.eINSTANCE.createWaypointType()));

		newChildDescriptors.add
			(createChildParameter
				(TurtlebotmissionPackage.Literals.TURTLE_BOT__WAYPOINTS,
				 TurtlebotmissionFactory.eINSTANCE.createWayPoint()));

		newChildDescriptors.add
			(createChildParameter
				(TurtlebotmissionPackage.Literals.TURTLE_BOT__MISSIONS,
				 TurtlebotmissionFactory.eINSTANCE.createMission()));
	}

}
