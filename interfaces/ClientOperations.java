package interfaces;
import java.lang.*;
import classes.Client;

public interface ClientOperations
{
	boolean insertClient(Client c);
	boolean removeClient(Client c);
	Client searchClient(int nid);
	void showAllClient();

}