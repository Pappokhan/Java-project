package interfaces;

import java.lang.*;

import classes.Profile;

public interface ProfileOperations
{
	boolean insertProfile(Profile a);
	boolean removeProfile(Profile a);
	Profile searchProfile(String email);
	void showAllProfile();
}